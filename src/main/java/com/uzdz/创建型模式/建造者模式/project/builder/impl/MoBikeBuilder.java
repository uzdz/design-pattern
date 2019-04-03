package com.uzdz.创建型模式.建造者模式.project.builder.impl;

import com.uzdz.创建型模式.建造者模式.project.builder.BikeBuilder;
import com.uzdz.创建型模式.建造者模式.project.entity.Bike;

/**
 * 摩拜单车默认情况下生产线
 * @author uzdz
 * @date: 2019/4/2 16:56
 * @since 0.1.0
 */
public class MoBikeBuilder implements BikeBuilder {

    /**
     * 拥有单车对象
     */
    Bike bike = new Bike();

    @Override
    public void buildTyres() {
        bike.setTyre("橙色轮胎");
    }

    @Override
    public void buildFrame() {
        bike.setFrame("橙色车架");
    }

    @Override
    public void buildGPS() {
        bike.setGps("mobike定制版GPS定位装置");
    }

    @Override
    public Bike getBike() {
        return bike;
    }

    @Override
    public void changeGPS(String gps) {
        bike.setGps(gps);
    }

    @Override
    public void changeFrame(String frame) {
        bike.setFrame(frame);
    }

    @Override
    public void changeTyres(String tyres) {
        bike.setTyre(tyres);
    }
}
