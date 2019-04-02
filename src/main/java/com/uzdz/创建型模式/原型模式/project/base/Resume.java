package com.uzdz.创建型模式.原型模式.project.base;

import com.uzdz.创建型模式.原型模式.project.WorkExperience;

/**
 * 定义简历抽象类
 * @author uzdz
 * @date: 2019/4/2 16:15
 * @since 0.1.0
 */
public abstract class Resume {
    /**
     * 名字
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 工作经历
     */
    private WorkExperience workExperience;

    /**
     * 未实现的克隆方法，抛出不支持克隆异常
     * @return
     * @throws CloneNotSupportedException
     */
    public abstract Resume Clone() throws CloneNotSupportedException;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }
}
