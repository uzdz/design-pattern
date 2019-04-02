package com.uzdz.创建型模式.建造者模式;

import com.uzdz.创建型模式.建造者模式.project.EngineeringDepartment;
import com.uzdz.创建型模式.建造者模式.project.builder.BikeBuilder;
import com.uzdz.创建型模式.建造者模式.project.builder.impl.MoBikeBuilder;
import com.uzdz.创建型模式.建造者模式.project.builder.impl.OfoBikeBuilder;
import com.uzdz.创建型模式.建造者模式.project.entity.Bike;

public class ConsoleMain {
    public static void main(String[] args) {
        // 建造摩拜单车 <建造者>
        BikeBuilder moBikeBuilder = new MoBikeBuilder();

        // <监工>
        EngineeringDepartment ed1 = new EngineeringDepartment(moBikeBuilder);

        // 指导组装 <建造实例(监工负责监督，建造者实际建造)>
        ed1.Construct();

        // 产出单车，体现建造和显示分离 <获取最终生成结果>
        Bike moBike = moBikeBuilder.getBike();
        System.out.println(moBike);
    }
}
