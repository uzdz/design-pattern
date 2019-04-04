package com.uzdz.行为型模式.中介者模式.project.colleague.impl;

import com.uzdz.行为型模式.中介者模式.project.colleague.Colleague;
import com.uzdz.行为型模式.中介者模式.project.mediator.Mediator;

/**
 * 咖啡机
 * @author uzdz
 * @date: 2019/4/4 23:18
 * @since 0.1.0
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);

        // 将电器注入中介者
        mediator.register(name, this);
    }

    /**
     * 手动触发咖啡制作完毕通知
     */
    public void complete() {
        System.out.println("咖啡已制作完毕！");

        sendMessage(0);
    }

    /**
     * 操作咖啡机打开
     */
    public void doOpen() {
        sendMessage(1);
    }

    /**
     * 操作咖啡机关闭
     */
    public void doClose() {
        sendMessage(0);
    }

    /**
     * 制作咖啡
     */
    public void open() {
        System.out.println("开始制作咖啡！");
    }

    /**
     * 制作咖啡完毕
     */
    public void close() {
        System.out.println("咖啡制作完毕，关机！");
    }

    @Override
    public void sendMessage(int status) {
        this.getMediator().getMessage(status, this.getName());
    }
}
