package com.uzdz.创建型模式.工厂模式.project.工厂方法模式;

import com.uzdz.创建型模式.工厂模式.project.工厂方法模式.car.ICar;
import com.uzdz.创建型模式.工厂模式.project.工厂方法模式.factory.ICarFactory;
import com.uzdz.创建型模式.工厂模式.project.工厂方法模式.factory.impl.JeepCarFactory;

public class ConsoleMain {
    public static void main(String[] args) {

        System.out.println("范·迪塞尔下一场戏开越野车。");

        ICarFactory carFactory = new JeepCarFactory();

        ICar car = carFactory.getCar();

        car.car();
    }
}
