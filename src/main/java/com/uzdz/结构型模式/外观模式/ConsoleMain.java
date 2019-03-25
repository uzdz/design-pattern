package com.uzdz.结构型模式.外观模式;

import com.uzdz.结构型模式.外观模式.project.Receptionist;
import com.uzdz.结构型模式.外观模式.project.cure.Outpatient;
import com.uzdz.结构型模式.外观模式.project.cure.Register;
import com.uzdz.结构型模式.外观模式.project.cure.TakeMedicine;

public class ConsoleMain {
    public static void main(String[] args) {
        System.out.println("***** [优化前] 小董看病流程! *****");

        String name = "小董";

        System.out.println("[个人] 普通流程!");

        System.out.println("第一步：");
        // 排号
        Register register = new Register(name);
        register.doRegister();

        System.out.println("第二步：");
        // 就医
        Outpatient outpatient = new Outpatient(name);
        outpatient.doOutpatient();

        System.out.println("第三步：");
        // 取药
        TakeMedicine takeMedicine = new TakeMedicine(name);
        takeMedicine.doTakeMedicine();

        System.out.println("***** [优化后] 小董看病流程! *****");

        // 接待人员统一处理
        Receptionist receptionist = new Receptionist(name);
        System.out.println("第一步：接待人员办理流程");
        receptionist.cure();
    }
}
