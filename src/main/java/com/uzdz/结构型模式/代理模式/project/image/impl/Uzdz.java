package com.uzdz.结构型模式.代理模式.project.image.impl;

import com.uzdz.结构型模式.代理模式.project.image.Skill;

/**
 * uzdz本人
 * @author Uzdz
 * @date: 2019/4/1 20:22
 * @since 0.1.0
 */
public class Uzdz implements Skill {

    @Override
    public void coding() {
        System.out.println("uzdz正在写代码!");
    }

    @Override
    public void singing() {
        System.out.println("uzdz正在唱歌!");
    }
}
