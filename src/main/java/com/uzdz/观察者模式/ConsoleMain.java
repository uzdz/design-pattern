package com.uzdz.观察者模式;

import com.uzdz.观察者模式.project.custom.company.DongCompany;
import com.uzdz.观察者模式.project.custom.company.UzdzCompany;
import com.uzdz.观察者模式.project.custom.observatory.MeteorologicalObservatory;
import com.uzdz.观察者模式.project.java.company.JavaDongCompany;
import com.uzdz.观察者模式.project.java.company.JavaUzdzCompany;
import com.uzdz.观察者模式.project.java.observatory.JavaMeteorologicalObservatory;

public class ConsoleMain {
    public static void main(String[] args) {

        // 自定义观察者模式测试

        // 定义气象台
        MeteorologicalObservatory meteorologicalObservatory = new MeteorologicalObservatory();

        // 定义两家公司
        DongCompany dongCompany = new DongCompany();
        UzdzCompany uzdzCompany = new UzdzCompany();

        meteorologicalObservatory.registerObserver(dongCompany);
        meteorologicalObservatory.registerObserver(uzdzCompany);

        meteorologicalObservatory.dataChanged();

        meteorologicalObservatory.removeObserver(dongCompany);
        System.out.println("[dong公司] 退出了订阅数据");

        meteorologicalObservatory.dataChanged();


        System.out.println("=======================================");


        // 利用Java提供的观察者模式测试

        // 定义气象台
        JavaMeteorologicalObservatory javaMeteorologicalObservatory = new JavaMeteorologicalObservatory();

        // 定义两家公司
        JavaDongCompany javaDongCompany = new JavaDongCompany();
        JavaUzdzCompany javaUzdzCompany = new JavaUzdzCompany();

        javaMeteorologicalObservatory.addObserver(javaDongCompany);
        javaMeteorologicalObservatory.addObserver(javaUzdzCompany);

        javaMeteorologicalObservatory.dataChanged();

        javaMeteorologicalObservatory.deleteObserver(javaDongCompany);
        System.out.println("[java dong公司] 退出了订阅数据");

        javaMeteorologicalObservatory.dataChanged();
    }
}
