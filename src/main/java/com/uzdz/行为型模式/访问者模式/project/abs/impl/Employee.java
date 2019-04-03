package com.uzdz.行为型模式.访问者模式.project.abs.impl;

import com.uzdz.行为型模式.访问者模式.project.abs.Element;

/**
 * 员工
 * @author uzdz
 * @date: 2019/4/3 21:33
 * @since 0.1.0
 */
public class Employee extends Element {

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工工龄
     */
    private int workingYears;

    public Employee(String name, int workingYears) {
        this.name = name;
        this.workingYears = workingYears;
    }

    public int getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(int workingYears) {
        this.workingYears = workingYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
