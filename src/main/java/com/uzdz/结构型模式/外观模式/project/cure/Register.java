package com.uzdz.结构型模式.外观模式.project.cure;

/**
 * 挂号
 * @author Uzdz
 * @date: 2019/3/25 16:14
 * @since 0.1.0
 */
public class Register {
    private String name;

    public Register(String name) {
        this.name = name;
    }

    public void doRegister() {
        System.out.println("<" + name + "> 开始挂号!");
    }
}
