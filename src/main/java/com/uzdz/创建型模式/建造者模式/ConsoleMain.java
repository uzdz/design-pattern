package com.uzdz.创建型模式.建造者模式;

import com.uzdz.创建型模式.建造者模式.project.EngineeringDepartment;
import com.uzdz.创建型模式.建造者模式.project.builder.impl.MoBikeBuilder;
import com.uzdz.创建型模式.建造者模式.project.entity.Bike;

public class ConsoleMain {
    public static void main(String[] args) {

        System.out.println("用户想生产一个默认流水线的摩拜自行车：");
        Bike bike = new EngineeringDepartment(new MoBikeBuilder()).build();
        System.out.println(bike);

        System.out.println("");
        System.out.println("");

        System.out.println("用户想自定制摩拜自行车的配件：");
        Bike customBike = new EngineeringDepartment(new MoBikeBuilder())
                .changeFrame("uzdz的车架")
                .changeGPS("uzdz的gps")
                .changeTyres("uzdz的车轮").build();
        System.out.println(customBike);

    }
}
