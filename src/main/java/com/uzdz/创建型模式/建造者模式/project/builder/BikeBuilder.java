package com.uzdz.创建型模式.建造者模式.project.builder;

import com.uzdz.创建型模式.建造者模式.project.entity.Bike;

/**
 * 自行车生产线接口
 * @author uzdz
 * @date: 2019/4/2 16:52
 * @since 0.1.0
 */
public interface BikeBuilder {
    /**
     * 组装轮胎
     */
    void buildTyres();

    /**
     * 组装车架
     */
    void buildFrame();

    /**
     * 组装GPS定位装置
     */
    void buildGPS();

    /**
     * 获取自行车
     * @return
     */
    Bike getBike();

    /**
     * 更换GPS
     * @param gps
     */
    void changeGPS(String gps);

    /**
     * 更换车架
     * @param frame
     */
    void changeFrame(String frame);

    /**
     * 更换轮胎
     * @param tyres
     */
    void changeTyres(String tyres);
}
