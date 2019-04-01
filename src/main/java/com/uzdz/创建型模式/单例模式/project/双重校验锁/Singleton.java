package com.uzdz.创建型模式.单例模式.project.双重校验锁;

/**
 * 双重校验锁 - 线程安全
 * @author Uzdz
 * @date: 2019/3/22 10:30
 * @since 0.1.0
 */
public class Singleton {

    /**
     * 使用volatile保证多线程情况下，对象的可见性，即当new初始化后，会立刻被其他线程发现
     */
    private volatile static Singleton singleton = null;

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
     * 实现难度：较复杂
     *
     * 采用双锁机制，安全且在多线程情况下能保持高性能。
     * getInstance() 的性能对应用程序很关键。
     * @return
     */
    public static Singleton getInstance() {

        if (singleton == null) {

            // 多线程情况下，当有线程获取了该锁，负责去初始化对象时，其他线程会被阻塞
            // 当负责初始化线程完成后，被阻塞在synchronized的线程继续执行
            // 但是由于对singleton设置了volatile状态属性，则会被第二重判断拦截，不会再去初始化。
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
