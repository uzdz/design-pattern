package com.uzdz.结构型模式.享元模式.project.impl;

import com.uzdz.结构型模式.享元模式.project.base.Flyweight;

/**
 * 共享对象
 * @author uzdz
 * @date: 2019/4/2 18:20
 * @since 0.1.0
 */
public class ConcreteFlyweight extends Flyweight {
    /**
     * 接受外部状态
     * @param extrinsic
     */
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    /**
     * 根据外部状态进行逻辑处理
     * @param extrinsic
     */
    @Override
    public void operate(int extrinsic) {
        System.out.println("具体Flyweight:" + extrinsic);
    }
}
