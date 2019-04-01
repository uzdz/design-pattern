package com.uzdz.行为型模式.命令模式.project.appliance;

import com.uzdz.行为型模式.命令模式.project.appliance.abs.AbsAppliance;

/**
 * 电器 - 电视
 * @author Uzdz
 * @date: 2019/3/25 11:03
 * @since 0.1.0
 */
public class Tv implements AbsAppliance {

    /**
     * 电视名称
     */
    private String name;

    public Tv(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("电视<" + name + ">关闭!");
    }

    @Override
    public void off() {
        System.out.println("电视<" + name + ">关闭!");
    }
}
