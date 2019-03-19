package com.uzdz.策略模式.project;

import com.uzdz.策略模式.project.head.HeadBehavior;

/**
 * 鸭子超类
 * @author uzdz
 * @date: 2019/3/19 14:05
 * @since 0.1.0
 */
public abstract class Duck {

    private HeadBehavior headBehavior;

    public Duck(HeadBehavior headBehavior) {
        this.headBehavior = headBehavior;
    }

    public void swim() {
        System.out.println("i can swim");
    }

    public void head() {
        headBehavior.head();
    }

    public abstract void walk();

    /**
     * 策略模式支持运行时更改行为策略
     * @param headBehavior
     */
    public void updateHead(HeadBehavior headBehavior) {
        this.headBehavior = headBehavior;
    }
}
