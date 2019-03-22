package com.uzdz.创建型模式.工厂模式.project.简单工厂模式;

import com.uzdz.创建型模式.工厂模式.project.简单工厂模式.car.ICar;
import com.uzdz.创建型模式.工厂模式.project.简单工厂模式.factory.CarFactory;

public class ConsoleMain {
    public static void main(String[] args) throws Exception {

        System.out.println("范·迪塞尔下一场戏开跑车。");

        ICar car = CarFactory.byCar("Sport");

        car.car();
    }
}
