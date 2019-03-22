package com.uzdz.创建型模式.工厂模式.project.工厂方法模式.factory.impl;

import com.uzdz.创建型模式.工厂模式.project.工厂方法模式.car.ICar;
import com.uzdz.创建型模式.工厂模式.project.工厂方法模式.car.impl.JeepCar;
import com.uzdz.创建型模式.工厂模式.project.工厂方法模式.factory.ICarFactory;

/**
 * 吉普汽车库
 * @author uzdz
 * @date: 2019/3/22 17:47
 * @since 0.1.0
 */
public class JeepCarFactory implements ICarFactory {


    @Override
    public ICar getCar() {
        return new JeepCar();
    }
}
