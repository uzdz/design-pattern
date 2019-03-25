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
        Light bedroomLight = new Light("卧室");
        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);

        // 客厅灯
        Light livingRoomLight = new Light("客厅");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        // 客厅电视
        Tv livingRoomTv = new Tv("客厅");
        TvOnCommand livingRoomTvOn = new TvOnCommand(livingRoomTv);
        TvOffCommand livingRoomTvOff = new TvOffCommand(livingRoomTv);

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
