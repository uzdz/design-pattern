package com.uzdz.行为型模式.观察者模式.project.custom.company;

import com.uzdz.行为型模式.观察者模式.project.custom.api.Observer;

/**
 * dong的公司
 * @author uzdz
 * @date: 2019/3/20 16:00
 * @since 0.1.0
 */
public class DongCompany implements Observer {

    @Override
    public void accept(String data) {
        System.out.println("[dong公司] 收到数据发生了改变，数据信息为：" + data);
    }
}
