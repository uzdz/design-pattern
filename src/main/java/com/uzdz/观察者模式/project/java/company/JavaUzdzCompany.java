package com.uzdz.观察者模式.project.java.company;

import java.util.Observable;
import java.util.Observer;

/**
 * uzdz的公司
 * @author uzdz
 * @date: 2019/3/20 16:00
 * @since 0.1.0
 */
public class JavaUzdzCompany implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("[java uzdz公司] 收到数据发生了改变，数据信息为：" + (String) arg);
    }
}
