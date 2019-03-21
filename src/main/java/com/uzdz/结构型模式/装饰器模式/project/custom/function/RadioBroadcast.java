package com.uzdz.结构型模式.装饰器模式.project.custom.function;

import com.uzdz.结构型模式.装饰器模式.project.custom.entity.abs.OriginalSell;
import com.uzdz.结构型模式.装饰器模式.project.custom.decorator.BasicsSellDecorator;

/**
 * 装饰类实现(NewComponent) - 广播售卖结果
 * @author uzdz
 * @date: 2019/3/21 15:29
 * @since 0.1.0
 */
public class RadioBroadcast extends BasicsSellDecorator {


    public RadioBroadcast(OriginalSell originalSell) {
        super(originalSell);
    }

    @Override
    public void place() {

        System.out.println("有商品被售卖了！");

        super.place();
    }
}
