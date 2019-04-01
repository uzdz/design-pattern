package com.uzdz.行为型模式.命令模式.project.command.light;

import com.uzdz.行为型模式.命令模式.project.appliance.Light;
import com.uzdz.行为型模式.命令模式.project.command.Command;

/**
 * 灯 - 开启命令
 * @author Uzdz
 * @date: 2019/3/25 11:13
 * @since 0.1.0
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
