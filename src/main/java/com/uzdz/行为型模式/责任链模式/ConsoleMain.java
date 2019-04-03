package com.uzdz.行为型模式.责任链模式;

import com.uzdz.行为型模式.责任链模式.project.Proposer;
import com.uzdz.行为型模式.责任链模式.project.approver.Approver;
import com.uzdz.行为型模式.责任链模式.project.approver.impl.CEOApprover;
import com.uzdz.行为型模式.责任链模式.project.approver.impl.ChiefInspectorApprover;
import com.uzdz.行为型模式.责任链模式.project.approver.impl.GroupLeaderApprover;
import com.uzdz.行为型模式.迭代器模式.project.custom.MergeRestaurant;
import com.uzdz.行为型模式.迭代器模式.project.custom.merge.ChineseRestaurant;
import com.uzdz.行为型模式.迭代器模式.project.custom.merge.CoffeeHouse;
import com.uzdz.行为型模式.迭代器模式.project.java.IteratorWaiters;

public class ConsoleMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        // 创建ceo审批人
        Approver ceo = new CEOApprover("dongzhen");

        // 创建总监审批人
        Approver chiefInspector = new ChiefInspectorApprover("董振");

        // 创建组长审批人
        Approver groupLeader = new GroupLeaderApprover("uzdz");

        // 设置每一级的下一级审批人
        // 此项目形成闭环，线上项目中应该最终审批为空节点，否则会造成死循环
        groupLeader.setNextApprover(chiefInspector);
        chiefInspector.setNextApprover(ceo);
        ceo.setNextApprover(groupLeader);



        Proposer proposer = new Proposer();
        groupLeader.processRequest(proposer.sendPurchaseRequest(2220));
    }
}
