package com.uzdz.行为型模式.观察者模式.project.java.company;

import java.util.Observable;
import java.util.Observer;

/**
 * dong的公司
 * @author Uzdz
 * @date: 2019/3/20 16:00
 * @since 0.1.0
 */
public class JavaDongCompany implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("[java dong公司] 收到数据发生了改变，数据信息为：" + (String)arg);
    }
}
