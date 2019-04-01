package com.uzdz.结构型模式.装饰器模式;

import com.uzdz.结构型模式.装饰器模式.project.custom.entity.BarSell;
import com.uzdz.结构型模式.装饰器模式.project.custom.function.Inspect;
import com.uzdz.结构型模式.装饰器模式.project.custom.function.RadioBroadcast;
import com.uzdz.结构型模式.装饰器模式.project.java.UpperCaseInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ConsoleMain {
    public static void main(String[] args) throws IOException {

        System.out.println("原来的点名的售卖流程...");
        BarSell barSell = new BarSell();
        barSell.place();

        System.out.println("******************************");

        System.out.println("后来新增了广播功能...");
        RadioBroadcast radioBroadcast = new RadioBroadcast(new BarSell());
        radioBroadcast.place();

        System.out.println("******************************");

        System.out.println("再后来增加了检查安全功能...");
        Inspect inspect = new Inspect(radioBroadcast);
        inspect.place();

        System.out.println("******************************");

        System.out.println("<以下是通过java提供的装饰器模式，自定义新增一个把文件所有字母变成大写的装饰者类>");

        UpperCaseInputStream upperCaseInputStream = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream(new File("src/main/java/com/Uzdz/结构型模式/装饰器模式/project/java/change.txt"))));

        int ch = -1;

        while ((ch = upperCaseInputStream.read()) >= 0) {
            System.out.print((char) ch);
        }
    }
}
