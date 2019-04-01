package com.uzdz.行为型模式.模版模式.project.coffee;

import com.uzdz.行为型模式.模版模式.project.HotDrinkTemplate;

/**
 * 热饮：咖啡
 * @author uzdz
 * @date: 2019/4/1 11:36
 * @since 0.1.0
 */
public class OriginCoffee extends HotDrinkTemplate {
    @Override
    public String varieties() {
        return "原脂咖啡";
    }

    @Override
    public String bitterCups() {
        return "纸杯";
    }

    @Override
    public void ingredients() {
        System.out.println("加入糖和牛奶");
    }
}
