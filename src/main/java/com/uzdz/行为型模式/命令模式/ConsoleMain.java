package com.uzdz.行为型模式.命令模式;

import com.uzdz.行为型模式.命令模式.project.Controller;
import com.uzdz.行为型模式.命令模式.project.appliance.Light;
import com.uzdz.行为型模式.命令模式.project.appliance.Tv;
import com.uzdz.行为型模式.命令模式.project.command.light.LightOffCommand;
import com.uzdz.行为型模式.命令模式.project.command.light.LightOnCommand;
import com.uzdz.行为型模式.命令模式.project.command.tv.TvOffCommand;
import com.uzdz.行为型模式.命令模式.project.command.tv.TvOnCommand;

public class ConsoleMain {
    public static void main(String[] args) {
        Controller controller = new Controller();

        // 卧室灯
        LightOnCommand bedroomLightOn = new LightOnCommand(new Light("卧室"));
        LightOffCommand bedroomLightOff = new LightOffCommand(new Light("卧室"));

        // 客厅灯
        LightOnCommand livingRoomLightOn = new LightOnCommand(new Light("客厅"));
        LightOffCommand livingRoomLightOff = new LightOffCommand(new Light("客厅"));

        // 客厅电视
        TvOnCommand livingRoomTvOn = new TvOnCommand(new Tv("客厅"));
        TvOffCommand livingRoomTvOff = new TvOffCommand(new Tv("客厅"));

        // 将设置好的命令绑定到控制器上
        controller.setCommand(0, bedroomLightOn, bedroomLightOff);
        controller.setCommand(1, livingRoomLightOn, livingRoomLightOff);
        controller.setCommand(2, livingRoomTvOn, livingRoomTvOff);

        // 开启1号槽位的电器
        controller.onButton(1);

        // 关闭1号槽位的电器
        controller.offButton(1);
    }
}
