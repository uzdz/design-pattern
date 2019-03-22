package com.uzdz.创建型模式.工厂模式.project.抽象工厂模式;


import com.uzdz.创建型模式.工厂模式.project.抽象工厂模式.factory.impl.JeepCarFactory;

public class ConsoleMain {
    public static void main(String[] args) {

        System.out.println("范·迪塞尔下一场戏开越野车。");

        CarSelector carSelector = new CarSelector(new JeepCarFactory());

        carSelector.byCar();
    }
}
