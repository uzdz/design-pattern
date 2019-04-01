package com.uzdz.行为型模式.模版模式.project.tea;

import com.uzdz.行为型模式.模版模式.project.HotDrinkTemplate;

import java.util.Scanner;

/**
 * 热饮：茶
 * @author uzdz
 * @date: 2019/4/1 11:36
 * @since 0.1.0
 */
public class OriginTea extends HotDrinkTemplate {
    @Override
    public String varieties() {
        return "清茶";
    }

    @Override
    public String bitterCups() {
        return "陶瓷杯";
    }

    @Override
    public void ingredients() {
        System.out.println("加入柠檬");
    }
}
