package com.uzdz.观察者模式.project.custom.api;

/**
 * 被观察者对象接口
 * @author uzdz
 * @date: 2019/3/20 15:55
 * @since 0.1.0
 */
public interface Subject {

    /**
     * 当有观察者订阅时，调用此api进行订阅
     * @param observer
     * @return
     */
    boolean registerObserver(Observer observer);

    /**
     * 当观察者想取消订阅时，调用次api进行取消
     * @param observer
     * @return
     */
    boolean removeObserver(Observer observer);

    /**
     * 当希望通知所有订阅了的观察者数据时，调用此api通知
     * @param data 变更数据
     */
    void notifyObservers(String data);
}
