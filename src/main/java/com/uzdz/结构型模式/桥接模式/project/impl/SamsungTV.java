package com.uzdz.结构型模式.桥接模式.project.impl;

import com.uzdz.结构型模式.桥接模式.project.base.OriginTvCommand;

/**
 * 三星电视
 * @author uzdz
 * @date: 2019/4/2 15:13
 * @since 0.1.0
 */
public class SamsungTV implements OriginTvCommand {

    @Override
    public void on() {
        System.out.println("Samsung TV on!");
    }

    @Override
    public void off() {
        System.out.println("Samsung TV off!");
    }

    @Override
    public void setChannel(int channelNumber) {
        System.out.println("Samsung TV channel number is " + channelNumber + "!");
    }
}
