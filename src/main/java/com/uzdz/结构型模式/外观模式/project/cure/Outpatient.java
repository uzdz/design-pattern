package com.uzdz.结构型模式.外观模式.project.cure;

/**
 * 门诊
 * @author Uzdz
 * @date: 2019/3/25 16:14
 * @since 0.1.0
 */
public class Outpatient {

    private String name;

    public Outpatient(String name) {
        this.name = name;
    }

    public void doOutpatient() {
        System.out.println("<" + name + "> 准备进行门诊!");
    }
}
