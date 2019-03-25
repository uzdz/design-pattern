package com.uzdz.结构型模式.适配器模式.project.passport;

import com.uzdz.结构型模式.适配器模式.project.passport.abs.Passport;

/**
 * 中国护照
 * @author uzdz
 * @date: 2019/3/25 14:21
 * @since 0.1.0
 */
public class ChinaPassport implements Passport {

    private String name;

    public ChinaPassport(String name) {
        System.out.println("公民<" + name + ">获得了中国护照");
        this.name = name;
    }

    @Override
    public String getPassport() {
        return "china";
    }
}
