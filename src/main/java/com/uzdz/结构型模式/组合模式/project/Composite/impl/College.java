package com.uzdz.结构型模式.组合模式.project.Composite.impl;

import com.uzdz.结构型模式.组合模式.project.Composite.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite（树枝节点）学院
 * @author uzdz
 * @date: 2019/4/1 16:40
 * @since 0.1.0
 */
public class College extends OrganizationComponent {

    /**
     * 学院名称
     */
    String name;

    /**
     * 学院描述
     */
    String description;

    /**
     * 学院下的专业
     */
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * 重写机构组件的方法，其作为树有增加和删除方法
     * @param organizationComponent
     */
    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("学院 >> " + getName());
        // 学院下面有很多专业，把他们遍历出来
        for(OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }
}
