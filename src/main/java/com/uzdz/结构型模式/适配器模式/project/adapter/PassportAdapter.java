package com.uzdz.结构型模式.适配器模式.project.adapter;

import com.uzdz.结构型模式.适配器模式.project.passport.ChinaPassport;
import com.uzdz.结构型模式.适配器模式.project.passport.abs.Passport;

/**
 * 通过中国护照申请美国护照的适配器
 * @author uzdz
 * @date: 2019/3/25 14:25
 * @since 0.1.0
 */
public class PassportAdapter implements Passport {

    /**
     * 中国护照
     */
    private Passport passport;

    public PassportAdapter(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String getPassport() {

        if ("china".equals(passport.getPassport())) {
            System.out.println("<适配器> 验证中国护照成功，并颁发美国护照!");
            return "usa";
        } else {
            System.out.println("<适配器> 验证中国护照失败，当前护照类型为：" + passport.getPassport() +"!");
            return passport.getPassport();
        }
    }
}
