package com.uzdz.创建型模式.单例模式.project.饿汉式;

/**
 * 饿汉式 - 线程安全
 * @author uzdz
 * @date: 2019/3/22 10:30
 * @since 0.1.0
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    /**
     * 关闭new构造方法创建
     */
    private Singleton() {
    }

    /**
     * 是否 Lazy 初始化：否
     *
     * 是否多线程安全：是
     *
     * 实现难度：易
     *
     * 类加载时就初始化，容易产生垃圾对象。但由于没有加锁，执行效率会提高。
     * @return
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
