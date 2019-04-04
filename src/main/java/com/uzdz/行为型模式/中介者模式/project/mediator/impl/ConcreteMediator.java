package com.uzdz.行为型模式.中介者模式.project.mediator.impl;

import com.uzdz.行为型模式.中介者模式.project.colleague.Colleague;
import com.uzdz.行为型模式.中介者模式.project.colleague.impl.Alarm;
import com.uzdz.行为型模式.中介者模式.project.colleague.impl.CoffeeMachine;
import com.uzdz.行为型模式.中介者模式.project.colleague.impl.TV;
import com.uzdz.行为型模式.中介者模式.project.mediator.Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 具体中介者类
 * @author uzdz
 * @date: 2019/4/4 22:55
 * @since 0.1.0
 */
public class ConcreteMediator implements Mediator {

    /**
     * 电器注册处（作为中介者，需要知道所有的电器）
     */
    private HashMap<String, Colleague> colleagueHashMap;

    /**
     * 电器名归纳容器
     */
    private Map<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueHashMap = new HashMap<String, Colleague>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);

        // 因为传入的colleagueName可能不统一，中介者在取电器的时候不方便，所以通过一个内部家具名容器进行包装
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        }
    }

    @Override
    public void getMessage(int state, String colleagueName) {
        if (colleagueHashMap.get(colleagueName) instanceof Alarm) {
            if (state == 1) {
                System.out.println("收到闹铃响起通知！");

                Alarm alarm = (Alarm) colleagueHashMap.get(interMap.get("Alarm"));
                alarm.open();

                // 闹铃响起后，通知咖啡机制作咖啡
                CoffeeMachine coffeeMachine = (CoffeeMachine) colleagueHashMap.get(interMap.get("CoffeeMachine"));
                coffeeMachine.doOpen();
            } else {
                System.out.println("收到闹铃关闭通知！");

                Alarm alarm = (Alarm) colleagueHashMap.get(interMap.get("Alarm"));
                alarm.close();
            }
        } else if (colleagueHashMap.get(colleagueName) instanceof CoffeeMachine) {
            if (state == 1) {
                System.out.println("收到制作咖啡通知！");

                CoffeeMachine coffeeMachine = (CoffeeMachine) colleagueHashMap.get(interMap.get("CoffeeMachine"));
                coffeeMachine.open();
            } else {
                System.out.println("收到咖啡机关闭通知！");

                // 关闭咖啡机
                CoffeeMachine coffeeMachine = (CoffeeMachine) colleagueHashMap.get(interMap.get("CoffeeMachine"));
                coffeeMachine.close();

                // 打开电视机
                TV tv = (TV) colleagueHashMap.get(interMap.get("TV"));
                tv.doOpen();
            }
        } else if (colleagueHashMap.get(colleagueName) instanceof TV) {
            if (state == 1) {
                System.out.println("收到电视机打开通知！");

                TV tv = (TV) colleagueHashMap.get(interMap.get("TV"));
                tv.open();

                // 关闭闹铃
                Alarm alarm = (Alarm) colleagueHashMap.get(interMap.get("Alarm"));
                alarm.doClose();
            } else {
                System.out.println("收到电视机机关闭通知！");

                TV tv = (TV) colleagueHashMap.get(interMap.get("TV"));
                tv.close();
            }
        }
    }
}
