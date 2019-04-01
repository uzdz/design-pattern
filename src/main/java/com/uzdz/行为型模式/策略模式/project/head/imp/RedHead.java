package com.uzdz.行为型模式.策略模式.project.head.imp;

import com.uzdz.行为型模式.策略模式.project.head.HeadBehavior;

/**
 * 红头鸭
 * @author Uzdz
 * @date: 2019/3/19 20:15
 * @since 0.1.0
 */
public class RedHead implements HeadBehavior {

    @Override
    public void head() {
        System.out.println("my head is red");
    }
}
