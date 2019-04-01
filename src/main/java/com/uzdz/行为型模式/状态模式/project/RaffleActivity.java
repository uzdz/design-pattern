package com.uzdz.行为型模式.状态模式.project;

import com.uzdz.行为型模式.状态模式.project.state.State;
import com.uzdz.行为型模式.状态模式.project.state.impl.BeginRaffleState;
import com.uzdz.行为型模式.状态模式.project.state.impl.DispenseState;
import com.uzdz.行为型模式.状态模式.project.state.impl.WaitRaffleState;

/**
 * 抽奖活动主程序
 * @author Uzdz
 * @date: 2019/4/1 17:42
 * @since 0.1.0
 */
public class RaffleActivity {

    /**
     * 活动状态
     */
    State state = null;

    /**
     * 奖品数量
     */
    int count = 0;

    /**
     * 当前机器积分
     */
    int score = 0;

    /**
     * 不允许抽奖状态
     */
    State noRaffleState = new WaitRaffleState(this);

    /**
     * 允许抽奖状态
     */
    State canRaffleState = new BeginRaffleState(this);

    /**
     * 发放奖品状态
     */
    State dispenseState = new DispenseState(this);


    public RaffleActivity(int count, int score) {
        // 活动初始化为不能抽奖
        this.state = getNoRaffleState();
        this.count = count;
        this.score = score;
    }

    /**
     * 扣除积分，准备抽奖
     */
    public boolean deductMoney(){
        return state.deductMoney();
    }

    /**
     * 扣除积分后可以抽奖
     */
    public void raffle(){
        // 是否抽中奖品
        if(state.raffle()){
            // 发放奖品是内部的处理逻辑，用户不可见
            state.dispensePrize();
        }
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
