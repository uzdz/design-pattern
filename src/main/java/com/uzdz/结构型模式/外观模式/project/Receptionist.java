package com.uzdz.结构型模式.外观模式.project;

import com.uzdz.结构型模式.外观模式.project.cure.Outpatient;
import com.uzdz.结构型模式.外观模式.project.cure.Register;
import com.uzdz.结构型模式.外观模式.project.cure.TakeMedicine;

/**
 * 接待处
 * @author uzdz
 * @date: 2019/3/25 16:17
 * @since 0.1.0
 */
public class Receptionist {

    private Outpatient outpatient;

    private Register register;

    private TakeMedicine takeMedicine;

    public Receptionist(String name) {
        this.outpatient = new Outpatient(name);
        this.register = new Register(name);
        this.takeMedicine = new TakeMedicine(name);
    }

    /**
     * 通过外观模式，将复杂的流程屏蔽，且解耦
     */
    public void cure() {
        System.out.println("[接待人员] 快捷流程!");
        register.doRegister();
        outpatient.doOutpatient();
        takeMedicine.doTakeMedicine();
    }
}
