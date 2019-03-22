package com.uzdz.创建型模式.工厂模式.project.抽象工厂模式;


import com.uzdz.创建型模式.工厂模式.project.抽象工厂模式.factory.ICarFactory;

/**
 * 驾驶某辆汽车的公共类
 * @author uzdz
 * @date: 2019/3/22 20:01
 * @since 0.1.0
 */
public class CarSelector {

    private ICarFactory iCarFactory;

    public CarSelector(ICarFactory iCarFactory) {
        this.iCarFactory = iCarFactory;
    }

    /**
     * 具体驾驶那辆车方法，具体驾驶实现由子类决定
     */
    public void byCar()
    {
        iCarFactory.getCar().car();
    }
}
