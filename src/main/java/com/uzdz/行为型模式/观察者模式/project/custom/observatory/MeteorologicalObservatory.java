package com.uzdz.行为型模式.观察者模式.project.custom.observatory;

import com.uzdz.行为型模式.观察者模式.project.custom.api.Observer;
import com.uzdz.行为型模式.观察者模式.project.custom.api.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 气象台 - 手动实现方式
 * @author Uzdz
 * @date: 2019/3/20 16:04
 * @since 0.1.0
 */
public class MeteorologicalObservatory implements Subject {

    volatile private List<Observer> observers;

    public MeteorologicalObservatory() {
        this.observers = new ArrayList<>();
    }

    @Override
    public boolean registerObserver(Observer observer) {

        if (Objects.isNull(observer)) {
            return false;
        }

        if (!observers.contains(observer)) {
            observers.add(observer);
        }

        return true;
    }

    @Override
    public boolean removeObserver(Observer observer) {

        if (Objects.isNull(observer)) {
            return false;
        }

        if (observers.contains(observer)) {
            observers.remove(observer);
        }

        return true;
    }

    @Override
    public void notifyObservers(String data) {
        observers.stream().forEach((observer) -> {
            observer.accept("数据集：" + data);
        });
    }

    public void dataChanged() {
        String data = String.valueOf(System.currentTimeMillis());
        System.out.println("[custom 气象台] 发现天气发生了变更，准备通知订阅的信息, 数据变更为：" + data);

        notifyObservers(data);
    }
}
