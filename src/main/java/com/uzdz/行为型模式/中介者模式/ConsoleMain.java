package com.uzdz.行为型模式.中介者模式;

import com.uzdz.行为型模式.中介者模式.project.colleague.impl.Alarm;
import com.uzdz.行为型模式.中介者模式.project.colleague.impl.CoffeeMachine;
import com.uzdz.行为型模式.中介者模式.project.colleague.impl.TV;
import com.uzdz.行为型模式.中介者模式.project.mediator.Mediator;
import com.uzdz.行为型模式.中介者模式.project.mediator.impl.ConcreteMediator;
import com.uzdz.行为型模式.命令模式.project.Controller;
import com.uzdz.行为型模式.命令模式.project.appliance.Light;
import com.uzdz.行为型模式.命令模式.project.appliance.Tv;
import com.uzdz.行为型模式.命令模式.project.command.light.LightOffCommand;
import com.uzdz.行为型模式.命令模式.project.command.light.LightOnCommand;
import com.uzdz.行为型模式.命令模式.project.command.tv.TvOffCommand;
import com.uzdz.行为型模式.命令模式.project.command.tv.TvOnCommand;

import java.util.concurrent.TimeUnit;

public class ConsoleMain {
    public static void main(String[] args) throws InterruptedException {
        Mediator mediator = new ConcreteMediator();

        Alarm alarm = new Alarm(mediator, "闹铃");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "咖啡机");
        TV tv = new TV(mediator, "电视");

        // 手动出发闹铃打开
        alarm.doOpen();

        // 5秒钟后咖啡机制作完成，手动触发
        TimeUnit.SECONDS.sleep(5);

        coffeeMachine.complete();
    }
}
