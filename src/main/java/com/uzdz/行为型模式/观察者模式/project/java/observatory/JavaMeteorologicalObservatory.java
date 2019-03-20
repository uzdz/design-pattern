package com.uzdz.行为型模式.观察者模式.project.java.observatory;

import java.util.Observable;

/**
 * 气象台 - Java默认支持方式
 * Java实现的观察者提供了部分提取数据的API
 * @author uzdz
 * @date: 2019/3/20 16:04
 * @since 0.1.0
 */
public class JavaMeteorologicalObservatory extends Observable {

    /**
     * 获取当前订阅了被观察者的观察者数量
     * @return
     */
    public int getCurrentObservers() {
        return countObservers();
    }

    public void dataChanged() {
        String data = String.valueOf(System.currentTimeMillis());
        System.out.println("[java 气象台] 发现天气发生了变更，准备通知订阅的信息, 数据变更为：" + data);

        // notifyObservers前一定要进行setChanged操作，否则无法通知观察者变更

        setChanged();

        notifyObservers(data);
    }

}
