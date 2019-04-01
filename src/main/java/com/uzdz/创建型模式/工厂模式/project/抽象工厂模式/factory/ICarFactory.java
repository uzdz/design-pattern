package com.uzdz.创建型模式.工厂模式.project.抽象工厂模式.factory;


import com.uzdz.创建型模式.工厂模式.project.抽象工厂模式.car.ICar;

/**
 * 抽象/接口车库
 * @author Uzdz
 * @date: 2019/3/22 17:47
 * @since 0.1.0
 */
public interface ICarFactory {

    /**
     * 获取汽车
     * @return
     */
    ICar getCar();
}
