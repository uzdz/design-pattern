package com.uzdz.创建型模式.工厂模式.project.简单工厂模式.car.impl;

import com.uzdz.创建型模式.工厂模式.project.简单工厂模式.car.ICar;

/**
 * 具体不同的产品 - 跑车
 * @author Uzdz
 * @date: 2019/3/22 16:56
 * @since 0.1.0
 */
public class SportCar implements ICar {
    @Override
    public void car() {
        System.out.println("场务把跑车交给范·迪塞尔");
    }
}
