package com.uzdz.结构型模式.适配器模式;

import com.uzdz.结构型模式.适配器模式.project.adapter.PassportAdapter;
import com.uzdz.结构型模式.适配器模式.project.passport.ChinaPassport;
import com.uzdz.结构型模式.适配器模式.project.passport.RussiaPassport;
import com.uzdz.结构型模式.适配器模式.project.passport.abs.Passport;

public class ConsoleMain {
    public static void main(String[] args) {
        ChinaPassport chinaPassport = new ChinaPassport("Uzdz");

        Passport passport = new PassportAdapter(chinaPassport);

        System.out.println("验证是否成功获取美国护照，验证结果：" + checkUsaPassport(passport));

        System.out.println("********************************************** 下方为失败演示");

        RussiaPassport russiaPassport = new RussiaPassport("dongzhen");

        Passport passportAdapter = new PassportAdapter(russiaPassport);

        System.out.println("验证是否成功获取美国护照，验证结果：" + checkUsaPassport(passportAdapter));
    }

    private static boolean checkUsaPassport(Passport passport) {
        return "usa".equals(passport.getPassport());
    }
}
