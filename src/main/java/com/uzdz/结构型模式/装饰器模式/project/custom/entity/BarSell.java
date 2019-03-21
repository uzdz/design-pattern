package com.uzdz.结构型模式.装饰器模式.project.custom.entity;

import com.uzdz.结构型模式.装饰器模式.project.custom.entity.abs.OriginalSell;

/**
 * 中国式咖啡
 * @author uzdz
 * @date: 2019/3/21 15:20
 * @since 0.1.0
 */
public class BarSell implements OriginalSell {


    @Override
    public void place() {
        System.out.println("bar sell product");
    }
}
