package com.uzdz.结构型模式.享元模式;

import com.uzdz.结构型模式.享元模式.project.FlyweightFactory;
import com.uzdz.结构型模式.享元模式.project.base.Flyweight;

public class ConsoleMain {
    public static void main(String[] args) {

        System.out.println("创建一个X：");
        Flyweight flyweightX = FlyweightFactory.getFlyweight("X");

        System.out.println("创建一个Y且判断是否和X为同一个对象？");
        Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
        if (flyweightY == flyweightX) {
            System.out.println("结果：true");
        } else {
            System.out.println("结果：false");
        }

        System.out.println("再创建一个X且判断是否和首次创建的X为同一个对象？");
        Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
        if (flyweightReX == flyweightX) {
            System.out.println("结果：true");
        } else {
            System.out.println("结果：false");
        }
    }
}
