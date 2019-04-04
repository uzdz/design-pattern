package com.uzdz.行为型模式.中介者模式.project.colleague.impl;

import com.uzdz.行为型模式.中介者模式.project.colleague.Colleague;
import com.uzdz.行为型模式.中介者模式.project.mediator.Mediator;

/**
 * 电视机
 * @author uzdz
 * @date: 2019/4/4 23:18
 * @since 0.1.0
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);

        // 将电器注入中介者
        mediator.register(name, this);
    }

    /**
     * 打开电视
     */
    public void open() {
        System.out.println("打开电视机！");
    }

    /**
     * 关闭电视
     */
    public void close() {
        System.out.println("关闭电视机！");
    }

    @Override
    public void sendMessage(int status) {
        this.getMediator().getMessage(status, this.getName());
    }
}
