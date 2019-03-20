package com.uzdz.行为型模式.策略模式;


import com.uzdz.行为型模式.策略模式.project.Duck;
import com.uzdz.行为型模式.策略模式.project.DuckMarket;
import com.uzdz.行为型模式.策略模式.project.head.imp.GreenHead;
import com.uzdz.行为型模式.策略模式.project.head.imp.RedHead;

public class ConsoleMain {
    public static void main(String[] args) {
        Duck duck = new DuckMarket(new RedHead());
        duck.swim();
        duck.walk();
        duck.head();

        System.out.println("-----替换鸭子头后-----");

        duck.updateHead(new GreenHead());
        duck.swim();
        duck.walk();
        duck.head();
    }
}
