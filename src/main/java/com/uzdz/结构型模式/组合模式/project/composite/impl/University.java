package com.uzdz.结构型模式.组合模式.project.composite.impl;

import com.uzdz.结构型模式.组合模式.project.composite.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * composite（树枝节点）大学
 * @author Uzdz
 * @date: 2019/4/1 16:38
 * @since 0.1.0
 */
public class University extends OrganizationComponent {

    /**
     * 大学名称
     */
    String name;

    /**
     * 大学描述
     */
    String description;

    /**
     * 大学下的学院
     */
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String description) {
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
        System.out.println("大学-------" + getName() + "-----------");
        // 大学下面有很多学院，把他们遍历出来
        for(OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }
}
