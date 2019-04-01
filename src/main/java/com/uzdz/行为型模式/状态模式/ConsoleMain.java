package com.uzdz.行为型模式.状态模式;

import com.uzdz.行为型模式.状态模式.project.RaffleActivity;

public class ConsoleMain {
    public static void main(String[] args) {
        // 创建活动对象，奖品池有1个奖品
        RaffleActivity activity = new RaffleActivity(2, 101);

        // 我们连续抽三次奖
        for (int i = 1; i <= 30; i++) {
            System.out.println("--------第" + (i) + "次抽奖----------");

            // 第一步点击扣除积分
            boolean bool = activity.deductMoney();

            if (bool) {
                // 第二步抽奖
                activity.raffle();
            } else if (activity.getCount() <= 0) {
                System.out.println("工作人员补充库存，请稍等...");

                activity.setCount(5);

                System.out.println("补充完毕，继续抽奖！");
            }else if (activity.getScore() < 50) {
                System.out.println("用户充值积分中，请稍等...");

                activity.setScore(500);

                System.out.println("充值完毕，继续抽奖！");
            }
        }
    }
}
