# 问题描述

## Internet气象站项目

> 气象台每当探测到有天气变动，就需要将天气信息实时推送给订阅了气象台数据的公司，气象台程序运行后，且公司可以自由的订阅与退订数据服务，这一切无需修改或重启气象台等阻断操作。

> 为了解决上面的需求，结合观察者模式实现？

## 要点讲解

> 气象台与订阅公司存在一对多的关系。且所有订阅公司都拥有当数据发生改变时，实时收到同时的事件。

## 观察者模式（Observer Pattern）

### 模式概述

1. 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。这种类型的设计模式属于行为型模式。

2. 被观察者的状态发生改变，所有的观察者对象都将得到通知，进行广播通知。

3. 通过声明Subject(被观察者)、Observer(观察者)来进行事件的监听和移除。Observer向Subject进行订阅或取消等操作。

### 优点
1. 观察者和被观察者是抽象耦合的，观察者可以随意增多或移除，且对被观察者无任何影响。
2. 建立类似一套订阅触发机制，且被观察者可以管理观察者。
3. Java内嵌观察者模式的支持类，比如Observable(Subject)、Observer类。

### 缺点
1. 如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
2. 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。 
3. 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。

## 注意事项
1. 当使用Java内嵌的观察者模式时，当数据发生改变后通知所有的Observer时，要先调用setChange()来通知Observable数据确实发生了更改且可以通知Observer，否则即使调用了notifyObservers(Object o)也不会通知Observers。
2. 避免观察者与被观察者之间存在循环引用，应该使观察者与被观察者解耦，被观察者只需知道观察者实现了监听接口，具体逻辑无需了解。

#### Java支持的Observable调用notifyObservers(Object)源码
> 必须调用setChanged()声明数据被修改。

```java
public void notifyObservers(Object arg) {
        /*
         * a temporary array buffer, used as a snapshot of the state of
         * current Observers.
         */
        Object[] arrLocal;

        synchronized (this) {
            /* We don't want the Observer doing callbacks into
             * arbitrary code while holding its own Monitor.
             * The code where we extract each Observable from
             * the Vector and store the state of the Observer
             * needs synchronization, but notifying observers
             * does not (should not).  The worst result of any
             * potential race-condition here is that:
             * 1) a newly-added Observer will miss a
             *   notification in progress
             * 2) a recently unregistered Observer will be
             *   wrongly notified when it doesn't care
             */
            if (!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }
```