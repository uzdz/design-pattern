package com.uzdz.行为型模式.观察者模式.project.custom.api;

/**
 * 观察者对象接口
 * @author Uzdz
 * @date: 2019/3/20 15:55
 * @since 0.1.0
 */
public interface Observer {

    /**
     * 当被观察者发生数据变更时
     * subject通过调用此api进行通知
     * @param data
     */
    void accept(String data);
}
