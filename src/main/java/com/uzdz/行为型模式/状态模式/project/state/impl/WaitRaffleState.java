package com.uzdz.行为型模式.状态模式.project.state.impl;

import com.uzdz.行为型模式.状态模式.project.RaffleActivity;
import com.uzdz.行为型模式.状态模式.project.state.State;

/**
 * 等待扣除积分状态 (不能抽奖)
 * @author Uzdz
 * @date: 2019/4/1 17:39
 * @since 0.1.0
 */
public class WaitRaffleState implements State {
    /**
     * 初始化时传入活动引用，扣除积分后改变其状态
     */
    RaffleActivity activity;

    public WaitRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 成功扣除积分后，把状态变为可抽奖状态，否则继续处于等待扣除积分状态
     */
    @Override
    public boolean deductMoney() {

        if (activity.getCount() <= 0) {
            System.out.println("当前奖品库存不足，请联系工作人员及时补货。");
            return false;
        }

        // 获取当前可用积分
        int score = activity.getScore();

        // 判断当前是否支持扣除50分
        if (score >= 50) {
            // 扣除50分
            activity.setScore(activity.getScore() - 50);
            System.out.println("扣除50积分成功，您可以抽奖了");
            activity.setState(activity.getCanRaffleState());
            return true;
        } else {
            System.out.println("扣除积分失败，剩余积分不足：" + activity.getScore());
            return false;
        }
    }

    /**
     * 还未扣除积分，不能进行抽奖
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("扣除积分后才能抽奖喔！");
        return false;
    }

    /**
     * 还未扣除积分，不支持发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("等待扣除积分中...");
    }
}
