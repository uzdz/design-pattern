package com.uzdz.行为型模式.状态模式.project.state.impl;

import com.uzdz.行为型模式.状态模式.project.RaffleActivity;
import com.uzdz.行为型模式.状态模式.project.state.State;

/**
 * 发放奖品中状态
 * @author Uzdz
 * @date: 2019/4/1 17:40
 * @since 0.1.0
 */
public class DispenseState implements State {
    /**
     * 初始化时传入活动引用，发放奖品后改变其状态
     */
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 当前处于发放奖品状态
     */
    @Override
    public boolean deductMoney() {
        System.out.println("当前处于发放奖品状态，请稍后...");
        return false;
    }

    /**
     * 当前处于发放奖品状态
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("当前处于发放奖品状态，请稍后...");
        return false;
    }

    /**
     * 检查奖品是否充足，颁发奖品
     */
    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("正在发出奖品，请查收！");

            // 扣除奖品库存
            activity.setCount(activity.getCount() - 1);
        } else {
            System.out.println("很遗憾，奖品库存不足！");
        }

        // 改变状态为：等待扣积分状态
        activity.setState(activity.getNoRaffleState());
    }

}
