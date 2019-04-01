package com.uzdz.结构型模式.装饰器模式.project.custom.decorator;

import com.uzdz.结构型模式.装饰器模式.project.custom.entity.abs.OriginalSell;

/**
 * 装饰器(Decorator) - 检查售卖商品是否合法
 * @author Uzdz
 * @date: 2019/3/21 15:23
 * @since 0.1.0
 */
public class BasicsSellDecorator implements OriginalSell {

    /**
     * 被装饰售卖对象
     */
    private OriginalSell originalSell;

    public BasicsSellDecorator(OriginalSell originalSell) {
        this.originalSell = originalSell;
    }

    @Override
    public void place() {
        this.originalSell.place();
    }
}
