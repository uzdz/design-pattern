package com.uzdz.行为型模式.命令模式.project.appliance.abs;

/**
 * 家电基础功能接口
 * @author Uzdz
 * @date: 2019/3/25 11:09
 * @since 0.1.0
 */
public interface AbsAppliance {

    /**
     * 关闭
     */
    void on();

    /**
     * 开启
     */
    void off();
}
