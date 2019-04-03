package com.uzdz.行为型模式.访问者模式.project;


import com.uzdz.行为型模式.访问者模式.project.abs.impl.Employee;
import com.uzdz.行为型模式.访问者模式.project.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工管理类
 * @author uzdz
 * @date: 2019/4/3 21:33
 * @since 0.1.0
 */
public class Employees {
    private List<Employee> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    /**
     * 添加员工
     * @param employee
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * 员工管理类负责将访问者对象注入到每个元素对象中
     * @param visitor 访问者对象
     */
    public void calculation(Visitor visitor) {
        employees.stream().forEach((employee) -> {
            employee.accept(visitor);
        });
    }
}
