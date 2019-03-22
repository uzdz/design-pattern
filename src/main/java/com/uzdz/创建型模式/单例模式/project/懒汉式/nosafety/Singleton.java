package com.uzdz.创建型模式.单例模式.project.懒汉式.nosafety;

/**
 * 懒汉式 - 线程不安全
 * @author uzdz
 * @date: 2019/3/22 10:30
 * @since 0.1.0
 */
public class Singleton {

    private static Singleton singleton = null;

    /**
     * 关闭new构造方法创建
     */
    private Singleton() {
    }

    /**
     * 是否 Lazy 初始化：是
     *
     * 是否多线程安全：否
     *
     * 实现难度：易
     *
     * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
     * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
     * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
     * @return
     */
    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
