package com.uzdz.创建型模式.工厂模式.project.抽象工厂模式.factory.impl;

import com.uzdz.创建型模式.工厂模式.project.抽象工厂模式.car.ICar;
import com.uzdz.创建型模式.工厂模式.project.抽象工厂模式.car.impl.JeepCar;
import com.uzdz.创建型模式.工厂模式.project.抽象工厂模式.factory.ICarFactory;

/**
 * 越野汽车库
 * @author Uzdz
 * @date: 2019/3/22 17:47
 * @since 0.1.0
 */
public class JeepCarFactory implements ICarFactory {


    @Override
    public ICar getCar() {
        return new JeepCar();
    }
}
