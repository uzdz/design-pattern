package com.uzdz.策略模式.project;

import com.uzdz.策略模式.project.head.HeadBehavior;

/**
 * 鸭子菜市场 - 子类
 * @author uzdz
 * @date: 2019/3/19 20:20
 * @since 0.1.0
 */
public class DuckMarket extends Duck {

    public DuckMarket(HeadBehavior headBehavior) {
        super(headBehavior);
    }

    @Override
    public void walk() {
        System.out.println("i can walk");
    }

}
