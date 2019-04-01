package com.uzdz.创建型模式.单例模式.project.懒汉式.safety;

/**
 * 懒汉式 - 线程安全
 * @author Uzdz
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
     * 是否多线程安全：是
     *
     * 实现难度：易
     *
     * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低。
     * 因为每次获取实例都会被synchronized阻塞，当多多线程下频繁调用，会造成阻塞，拖垮获取效率。
     * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
     * @return
     */
    public static synchronized Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
