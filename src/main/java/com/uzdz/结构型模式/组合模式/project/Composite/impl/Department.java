package com.uzdz.结构型模式.组合模式.project.Composite.impl;

import com.uzdz.结构型模式.组合模式.project.Composite.OrganizationComponent;

/**
 * Leaf（叶子节点）专业
 * @author uzdz
 * @date: 2019/4/1 16:42
 * @since 0.1.0
 */
public class Department extends OrganizationComponent {

    /**
     * 专业名称
     */
    String name;

    /**
     * 专业描述
     */
    String description;

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * 重写机构组件的方法
     * 但由于叶子节点后没有子节点，所以没有增加和删除方法
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * 叶子只需要输出自己的信息
     */
    @Override
    public void print() {
        System.out.println("专业：" + getName());
    }
}
