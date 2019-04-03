package com.uzdz.创建型模式.建造者模式.project;

import com.uzdz.创建型模式.建造者模式.project.builder.BikeBuilder;
import com.uzdz.创建型模式.建造者模式.project.entity.Bike;

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
        bikeBuilder.buildFrame();
        bikeBuilder.buildTyres();
        bikeBuilder.buildGPS();
        this.bikeBuilder = bikeBuilder;
    }

    /**
     * 更换轮胎
     * @return
     */
    public EngineeringDepartment changeTyres(String tyres) {
        this.bikeBuilder.changeTyres(tyres);
        return this;
    }

    /**
     * 更换车架
     * @return
     */
    public EngineeringDepartment changeFrame(String frame) {
        this.bikeBuilder.changeFrame(frame);
        return this;
    }

    /**
     * 更换gps
     * @return
     */
    public EngineeringDepartment changeGPS(String gps) {
        this.bikeBuilder.changeGPS(gps);
        return this;
    }

    /**
     * 指导组装单车
     */
    public Bike build() {
        return this.bikeBuilder.getBike();
    }
}
