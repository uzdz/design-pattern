package com.uzdz.策略模式.project;

/**
 * 鸭子超类
 * @author uzdz
 * @date: 2019/3/19 14:05
 * @since 0.1.0
 */
public abstract class Duck {

    public void swim() {
        System.out.println("i am swimming");
    }

    public abstract void head();
}
