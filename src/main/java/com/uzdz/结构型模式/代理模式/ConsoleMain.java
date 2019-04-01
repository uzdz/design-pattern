package com.uzdz.结构型模式.代理模式;

import com.uzdz.结构型模式.代理模式.project.image.impl.proxy.DongZhen;

public class ConsoleMain {
    public static void main(String[] args) {

        String codeComp = "阿里巴巴有限公司公司";
        System.out.println(codeComp + "准备请uzdz写一个项目...");

        DongZhen dongZhen = new DongZhen(codeComp);

        dongZhen.coding();

        System.out.println("***************************");

        String singComp = "超凡演艺公司";
        System.out.println(singComp + "准备请uzdz出场演唱会...");

        dongZhen.setPartnerName(singComp);

        dongZhen.singing();
    }
}
