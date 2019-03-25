package com.uzdz.行为型模式.命令模式.project.appliance;

import com.uzdz.行为型模式.命令模式.project.appliance.abs.AbsAppliance;

/**
 * 电器 - 灯
 * @author uzdz
 * @date: 2019/3/25 11:02
 * @since 0.1.0
 */
public class Light implements AbsAppliance {

    /**
     * 灯名称
     */
    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("灯<" + name + ">开启!");
    }

    @Override
    public void off() {
        System.out.println("灯<" + name + ">关闭!");
    }
}
