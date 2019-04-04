package com.uzdz.行为型模式.中介者模式.project.colleague.impl;

import com.uzdz.行为型模式.中介者模式.project.colleague.Colleague;
import com.uzdz.行为型模式.中介者模式.project.mediator.Mediator;

/**
 * 闹铃
 * @author uzdz
 * @date: 2019/4/4 23:16
 * @since 0.1.0
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);

        // 将电器注入中介者
        mediator.register(name, this);
    }

    /**
     * 手动触发闹铃
     */
    public void doOpen() {
        System.out.println("手动触发闹铃响起了!");
        sendMessage(1);
    }

    /**
     * 闹铃响起
     */
    public void open() {
        System.out.println("闹铃响起了！");
    }

    /**
     * 闹铃关闭
     */
    public void close() {
        System.out.println("闹铃停止了！");
    }

    @Override
    public void sendMessage(int status) {
        this.getMediator().getMessage(status, this.getName());
    }
}
