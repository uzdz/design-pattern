package com.uzdz.创建型模式.工厂模式.project.工厂方法模式.factory;


import com.uzdz.创建型模式.工厂模式.project.工厂方法模式.car.ICar;

/**
 * 抽象/接口汽车库
 * @author uzdz
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
