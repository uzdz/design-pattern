package com.uzdz.创建型模式.原型模式;

import com.uzdz.创建型模式.原型模式.project.MyResume;
import com.uzdz.创建型模式.原型模式.project.WorkExperience;
import com.uzdz.创建型模式.原型模式.project.base.Resume;

public class ConsoleMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建我的简历
        Resume resume = new MyResume();
        resume.setName("uzdz");
        resume.setSex("男");

        WorkExperience workExperience = new WorkExperience();
        workExperience.setTime("2014/08/10-2016/08/20");
        workExperience.setCompany("xyz科技有限公司");
        workExperience.setPosition("JAVA开发工程师");
        resume.setWorkExperience(workExperience);

        // 克隆简历
        Resume copyResume1 = resume.Clone();

        // 打印简历
        System.out.println("----打印简历1-----");
        System.out.println(copyResume1.getName());
        System.out.println(copyResume1.getSex());
        System.out.println(copyResume1.getWorkExperience().getTime() + " " +
                copyResume1.getWorkExperience().getCompany() + " " +
                copyResume1.getWorkExperience().getPosition());

        // 克隆简历
        Resume copyResume2 = resume.Clone();

        // 打印简历
        System.out.println("----打印简历2-----");
        System.out.println(copyResume2.getName());
        System.out.println(copyResume2.getSex());
        System.out.println(copyResume2.getWorkExperience().getTime() + " " +
                copyResume2.getWorkExperience().getCompany() + " " +
                copyResume2.getWorkExperience().getPosition());
    }
}
