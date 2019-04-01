package com.uzdz.行为型模式.模版模式.project;

import java.util.Scanner;

/**
 * 热饮模版
 * @author uzdz
 * @date: 2019/4/1 11:10
 * @since 0.1.0
 */
public abstract class HotDrinkTemplate {

    public final void produce() {
        System.out.println("准备开始制作热饮：" + varieties());

        boilWater();

        brewing(varieties());

        load(varieties(), bitterCups());

        if (wantIngredients()) {
            ingredients();
        } else {
            System.out.println("客户无需加配料");
        }
    }

    /**
     * 品种名称
     * @return
     */
    public abstract String varieties();

    public final void boilWater() {
        System.out.println("水烧开了");
    }

    /**
     * 冲泡热品
     * @param varieties 热饮名称
     */
    public final void brewing(String varieties) {
        System.out.println("冲泡" + varieties);
    }

    /**
     * 杯具类型
     * @return
     */
    public abstract String bitterCups();

    /**
     * 将饮品倒入杯子
     * @param varieties
     * @param bitterCups
     */
    public final void load(String varieties, String bitterCups) {
        System.out.println("将" + varieties + "倒入" + bitterCups);
    }

    /**
     * 是否需要配料
     * @return
     */
    public boolean wantIngredients() {
        System.out.print("是否需要加入配料？");
        return new Scanner(System.in).nextLine().equals("y") ? true : false;
    }

    /**
     * 配料
     */
    public abstract void ingredients();
}
