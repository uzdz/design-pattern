package com.uzdz.结构型模式.享元模式;

import com.uzdz.结构型模式.享元模式.project.FlyweightFactory;
import com.uzdz.结构型模式.享元模式.project.base.Flyweight;
import com.uzdz.结构型模式.享元模式.project.impl.UnsharedConcreteFlyweight;

public class ConsoleMain {
    public static void main(String[] args) {
        int extrinsic = 22;

        Flyweight flyweightX = FlyweightFactory.getFlyweight("X");
        flyweightX.operate(++ extrinsic);

        Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
        flyweightY.operate(++ extrinsic);

        Flyweight flyweightZ = FlyweightFactory.getFlyweight("Z");
        flyweightZ.operate(++ extrinsic);

        Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
        flyweightReX.operate(++ extrinsic);

        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("X");
        unsharedFlyweight.operate(++ extrinsic);
    }
}
