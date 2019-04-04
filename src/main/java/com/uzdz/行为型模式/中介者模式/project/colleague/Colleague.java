package com.uzdz.行为型模式.中介者模式.project.colleague;

import com.uzdz.行为型模式.中介者模式.project.mediator.Mediator;

/**
 * 家用电器的基类
 * @author uzdz
 * @date: 2019/4/4 23:08
 * @since 0.1.0
 */
public abstract class Colleague {

    /**
     * 中介者（即该电器那个中介者管理）
     */
    private Mediator mediator;

    /**
     * 电器名称
     */
    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * 当电器状态发生变化时，通过调用注入基类的中介者进行通知
     * @param status
     */
    public abstract void sendMessage(int status);

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
