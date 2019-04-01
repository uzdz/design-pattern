package com.uzdz.结构型模式.代理模式.project.image.impl.proxy;

import com.uzdz.结构型模式.代理模式.project.image.Skill;
import com.uzdz.结构型模式.代理模式.project.image.impl.Uzdz;

/**
 * 经纪人DongZhen
 * @author Uzdz
 * @date: 2019/4/1 20:25
 * @since 0.1.0
 */
public class DongZhen implements Skill {

    String partnerName;

    private Uzdz uzdz;

    public DongZhen(String partnerName) {
        this.partnerName = partnerName;
    }

    @Override
    public void coding() {
        System.out.println("[经纪人DongZhen] 检查产品原型是否合格... ok ");

        if (uzdz == null) {
            uzdz = new Uzdz();
        }

        uzdz.coding();

        System.out.println("[经纪人DongZhen] 向<" + partnerName + ">收取项目报酬");
    }

    @Override
    public void singing() {
        System.out.println("[经纪人DongZhen] 检查演唱会是否合法... ok ");

        if (uzdz == null) {
            uzdz = new Uzdz();
        }

        uzdz.singing();

        System.out.println("[经纪人DongZhen] 向<" + partnerName + ">收取演唱会出场费");
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
}
