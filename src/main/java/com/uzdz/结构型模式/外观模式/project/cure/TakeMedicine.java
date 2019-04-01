package com.uzdz.结构型模式.外观模式.project.cure;

/**
 * 取药
 * @author Uzdz
 * @date: 2019/3/25 16:16
 * @since 0.1.0
 */
public class TakeMedicine {

    private String name;

    public TakeMedicine(String name) {
        this.name = name;
    }

    public void doTakeMedicine() {
        System.out.println("<" + name + "> 准备取药!");
    }
}
