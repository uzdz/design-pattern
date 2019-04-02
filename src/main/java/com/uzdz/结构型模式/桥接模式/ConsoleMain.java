package com.uzdz.结构型模式.桥接模式;


import com.uzdz.结构型模式.桥接模式.project.ext.NewTvController;
import com.uzdz.结构型模式.桥接模式.project.impl.SamsungTV;

public class ConsoleMain {
    public static void main(String[] args) {

        System.out.println("我家里的电视是三星的。");
        NewTvController samsungController = new NewTvController(new SamsungTV());

        samsungController.onOff();

        samsungController.next();
        samsungController.next();
        samsungController.pre();

        samsungController.onOff();

        System.out.println();
        System.out.println("********************");
        System.out.println();

        System.out.println("我家里的电视是索尼的。");
        NewTvController SonyController = new NewTvController(new SamsungTV());

        SonyController.onOff();

        SonyController.next();
        SonyController.pre();
        SonyController.pre();

        SonyController.onOff();
    }
}
