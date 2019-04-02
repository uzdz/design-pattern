package com.uzdz.结构型模式.享元模式.project.impl;

import com.uzdz.结构型模式.享元模式.project.base.Flyweight;

/**
 * 不共享对象
 * @author uzdz
 * @date: 2019/4/2 18:22
 * @since 0.1.0
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    /**
     * 接受外部状态
     * @param extrinsic
     */
    public UnsharedConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate(int extrinsic) {
        System.out.println("不共享的具体Flyweight:" + extrinsic);
    }
}
