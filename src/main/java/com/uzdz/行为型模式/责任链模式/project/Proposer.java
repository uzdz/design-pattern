package com.uzdz.行为型模式.责任链模式.project;

import com.uzdz.行为型模式.责任链模式.project.purchase.PurchaseRequest;

/**
 * 申购人
 * @author uzdz
 * @date: 2019/4/3 20:38
 * @since 0.1.0
 */
public class Proposer {

    /**
     * 申购人发出购买申请
     * @param cost 申购物品价格
     * @return
     */
    public PurchaseRequest sendPurchaseRequest(int cost) {
        System.out.println("准备申购公司物品，价格为：" + cost);
        return new PurchaseRequest(cost);
    }
}
