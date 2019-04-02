package com.uzdz.结构型模式.桥接模式.project.impl;

import com.uzdz.结构型模式.桥接模式.project.base.OriginTvCommand;

/**
 * 索尼电视
 * @author uzdz
 * @date: 2019/4/2 15:13
 * @since 0.1.0
 */
public class SonyTV implements OriginTvCommand {

    @Override
    public void on() {
        System.out.println("Sony TV on!");
    }

    @Override
    public void off() {
        System.out.println("Sony TV off!");
    }

    @Override
    public void setChannel(int channelNumber) {
        System.out.println("Sony TV channel number is " + channelNumber + "!");
    }
}
