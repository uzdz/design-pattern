package com.uzdz.行为型模式.策略模式.project;

import com.uzdz.行为型模式.策略模式.project.head.HeadBehavior;

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

    /**
     * 所有的鸭子都会游泳 (不变部分)
     */
    public void swim() {
        System.out.println("i can swim");
    }

    /**
     * 鸭子走路的姿势不一样 (变化部分，且无法组合成算法族，只能由子类单独实现，比如备注之类的)
     */
    public abstract void walk();

    /**
     * 鸭子的头不一样 (变化部分，且可以通过实现行为的不同策略，形成算法族)
     */
    public void head() {
        headBehavior.head();
    }

    /**
     * 策略模式支持运行时更改行为策略
     * @param headBehavior
     */
    public void updateHead(HeadBehavior headBehavior) {
        this.headBehavior = headBehavior;
    }
}
