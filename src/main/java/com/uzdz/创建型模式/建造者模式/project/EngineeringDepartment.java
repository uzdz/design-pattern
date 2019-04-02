package com.uzdz.创建型模式.建造者模式.project;

import com.uzdz.创建型模式.建造者模式.project.builder.BikeBuilder;

/**
 * 工程部门作为指挥者，可以指导生产部门作业
 * @author uzdz
 * @date: 2019/4/2 17:00
 * @since 0.1.0
 */
public class EngineeringDepartment {

    /**
     * 用户告知指挥者想要什么样的单车
     */
    BikeBuilder bikeBuilder;

    public EngineeringDepartment(BikeBuilder bikeBuilder){
        this.bikeBuilder = bikeBuilder;
    }

    /**
     * 指导组装单车
     */
    public void Construct() {
        bikeBuilder.buildTyres();
        bikeBuilder.buildFrame();
        bikeBuilder.buildGPS();
    }
}
