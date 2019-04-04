package com.uzdz.行为型模式.中介者模式.project.mediator;

import com.uzdz.行为型模式.中介者模式.project.colleague.Colleague;

/**
 * 中介者接口
 * @author uzdz
 * @date: 2019/4/4 22:52
 * @since 0.1.0
 */
public interface Mediator {

    /**
     * 将电器注册进中介者
     * @param colleagueName
     * @param colleague
     */
    void register(String colleagueName, Colleague colleague);

    /**
     * 中介者收到消息
     * @param state 状态
     * @param colleagueName 电器名称
     */
    void getMessage(int state, String colleagueName);
}
