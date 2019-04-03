package com.uzdz.行为型模式.责任链模式.project.approver.impl;

import com.uzdz.行为型模式.责任链模式.project.approver.Approver;
import com.uzdz.行为型模式.责任链模式.project.purchase.PurchaseRequest;

/**
 * 审批角色 - 总监
 * @author uzdz
 * @date: 2019/4/3 20:29
 * @since 0.1.0
 */
public class ChiefInspectorApprover extends Approver {
    public ChiefInspectorApprover(String name) {
        super("总监：" + name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getCost() <= 0) {
            System.out.println("采购金额不正确，驳回!");
            return;
        }

        if (request.getCost() >= 501 && request.getCost() <= 1000) {
            System.out.println(super.getName() + "，最终审批了请求！");
        } else {
            System.out.println(super.getName() + "，无权审批，传递下一级审批。");
            super.getNextApprover().processRequest(request);
        }
    }
}
