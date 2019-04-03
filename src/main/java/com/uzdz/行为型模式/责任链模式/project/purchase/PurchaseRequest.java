package com.uzdz.行为型模式.责任链模式.project.purchase;

/**
 * 采购审批内容详情
 * @author uzdz
 * @date: 2019/4/3 20:27
 * @since 0.1.0
 */
public class PurchaseRequest {
    /**
     * 此次采购成本价
     */
    private int cost;

    public PurchaseRequest(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
