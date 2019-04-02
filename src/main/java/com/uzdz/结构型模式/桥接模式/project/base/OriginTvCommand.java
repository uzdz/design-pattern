package com.uzdz.结构型模式.桥接模式.project.base;

/**
 * 原生遥控器抽象类
 * @author uzdz
 * @date: 2019/4/2 15:05
 * @since 0.1.0
 */
public interface OriginTvCommand {
    /**
     * 开启电视
     */
    void on();

    /**
     * 关闭电视
     */
    void off();

    /**
     * 设置电视频道
     * @param channelNumber 当前频道
     */
    void setChannel(int channelNumber);
}
