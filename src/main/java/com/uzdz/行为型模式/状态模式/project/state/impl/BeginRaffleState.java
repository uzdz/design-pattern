package com.uzdz.行为型模式.状态模式.project.state.impl;

import com.uzdz.行为型模式.状态模式.project.RaffleActivity;
import com.uzdz.行为型模式.状态模式.project.state.State;

import java.util.Random;

/**
 * 抽奖中状态
 * @author Uzdz
 * @date: 2019/4/1 17:40
 * @since 0.1.0
 */
public class BeginRaffleState implements State {
    /**
     * 初始化时传入活动引用，抽奖后改变其状态
     */
    RaffleActivity activity;

    public BeginRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    /**
     * 处于开始抽奖状态，则表示已经扣除了积分
     */
    @Override
    public boolean deductMoney() {
        System.out.println("已经扣取过了积分，马上开始抽奖！");
        return false;
    }

    /**
     * 抽奖中，结果分为两种：抽中 或 未抽中
     * @return
     */
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！");
        // 10%中奖机会
        if(new Random().nextInt(10) == 0){
            System.out.println("恭喜您抽中了！");

            // 抽中，改变活动状态为：发放奖品中状态
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中！");

            // 未抽中，改变状态为：等待扣积分状态
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    /**
     * 当前处于抽奖中状态，不支持发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("正在抽奖中，请稍后！");
    }
}
