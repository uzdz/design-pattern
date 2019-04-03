package com.uzdz.行为型模式.访问者模式.project.visitor.impl;

import com.uzdz.行为型模式.访问者模式.project.abs.Element;
import com.uzdz.行为型模式.访问者模式.project.abs.impl.Employee;
import com.uzdz.行为型模式.访问者模式.project.visitor.Visitor;

/**
 * 年假算法 - 访问者类
 * @author uzdz
 * @date: 2019/4/3 21:35
 * @since 0.1.0
 */
public class AnnualLeaveVisitor implements Visitor {
    @Override
    public void visitor(Element element) {
        Employee employee = (Employee) element;

        System.out.println("员工姓名：" + employee.getName() + " -- 年终奖金：" + employee.getWorkingYears() * 20);
    }
}
