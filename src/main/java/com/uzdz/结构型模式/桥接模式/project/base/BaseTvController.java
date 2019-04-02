package com.uzdz.结构型模式.桥接模式.project.base;

/**
 * 原生电视遥控器抽象类
 * @author uzdz
 * @date: 2019/4/2 15:02
 * @since 0.1.0
 */
public abstract class BaseTvController {

    /**
     * 具体厂家实现细节
     */
    public OriginTvCommand controller;

    public BaseTvController(OriginTvCommand controller) {
        this.controller = controller;
    }

    /**
     * 开关电视
     */
    public abstract void onOff();

    /**
     * 下一个频道
     */
    public abstract void next();

    /**
     * 上一个频道
     */
    public abstract void pre();
}
