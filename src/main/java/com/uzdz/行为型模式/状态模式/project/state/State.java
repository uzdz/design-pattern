package com.uzdz.行为型模式.状态模式.project.state;

/**
 * 状态接口
 * @author Uzdz
 * @date: 2019/4/1 17:37
 * @since 0.1.0
 */
public interface State {
    /**
     * 扣除积分 (扣成功 或 积分不足未扣成功)
     * @return
     */
    boolean deductMoney();

    /**
     * 进行抽奖中 (抽中 或 未抽中)
     * @return
     */
    boolean raffle();

    /**
     * 发放奖品 (成功发放 或 无奖品发放失败)
     */
    void dispensePrize();
}
