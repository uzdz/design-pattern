package com.uzdz.行为型模式.责任链模式.project.approver;

import com.uzdz.行为型模式.责任链模式.project.purchase.PurchaseRequest;

/**
 * 审批角色抽象类
 * @author uzdz
 * @date: 2019/4/3 20:25
 * @since 0.1.0
 */
public abstract class Approver {

    /**
     * 下一级审批人
     */
    private Approver nextApprover;

    /**
     * 当前审批人姓名
     */
    private String name;

    /**
     * 处理请求
     * @param request
     */
    public abstract void processRequest(PurchaseRequest request);

    public Approver(String name) {
        this.name = name;
    }

    public Approver getNextApprover() {
        return nextApprover;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
