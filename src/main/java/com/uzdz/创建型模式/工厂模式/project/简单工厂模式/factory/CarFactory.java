package com.uzdz.创建型模式.工厂模式.project.简单工厂模式.factory;

import com.uzdz.创建型模式.工厂模式.project.简单工厂模式.car.ICar;
import com.uzdz.创建型模式.工厂模式.project.简单工厂模式.car.impl.JeepCar;
import com.uzdz.创建型模式.工厂模式.project.简单工厂模式.car.impl.SportCar;

/**
 * 简单静态工厂 - 汽车库
 * @author Uzdz
 * @date: 2019/3/22 17:47
 * @since 0.1.0
 */
public class CarFactory {

    public static ICar byCar(String carType) throws Exception {

        if(carType.equalsIgnoreCase("Jeep")){
            return new JeepCar();
        } else if(carType.equalsIgnoreCase("Sport")){
            return new SportCar();
        } else {
            throw new Exception("爱上一匹野马,可我的家里没有草原. 你走吧！");
        }
    }
}
