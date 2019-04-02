package com.uzdz.创建型模式.建造者模式.project.entity;

/**
 * 自行车
 * @author uzdz
 * @date: 2019/4/2 16:57
 * @since 0.1.0
 */
public class Bike {
    /**
     * 轮胎
     */
    private String tyre;

    /**
     * 车架
     */
    private String frame;

    /**
     * GPS定位装置
     */
    private String gps;

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "tyre='" + tyre + '\'' +
                ", frame='" + frame + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
