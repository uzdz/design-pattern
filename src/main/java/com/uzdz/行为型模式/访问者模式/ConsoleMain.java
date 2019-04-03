package com.uzdz.行为型模式.访问者模式;


import com.uzdz.行为型模式.访问者模式.project.Employees;
import com.uzdz.行为型模式.访问者模式.project.abs.impl.Employee;
import com.uzdz.行为型模式.访问者模式.project.visitor.impl.AnnualLeaveVisitor;

public class ConsoleMain {
    public static void main(String[] args) {

        // 向员工管理类中添加员工
        Employees employees = new Employees();
        employees.addEmployee(new Employee("uzdz", 3));
        employees.addEmployee(new Employee("董振", 1));

        // 计算年终奖金（AnnualLeaveVisitor 访问者对象，可以通过实现Visitor接口自由切换）
        employees.calculation(new AnnualLeaveVisitor());
    }
}
