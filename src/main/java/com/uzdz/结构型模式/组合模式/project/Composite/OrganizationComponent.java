package com.uzdz.结构型模式.组合模式.project.Composite;

/**
 * 抽象组件（Component）学院和专业称为机构
 *
 * 默认为每个方法提供默认的实现
 * @author uzdz
 * @date: 2019/4/1 16:35
 * @since 0.1.0
 */
public abstract class OrganizationComponent {

    public void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
