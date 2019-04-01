package com.uzdz.行为型模式.命令模式.project;

import com.uzdz.行为型模式.命令模式.project.command.Command;

/**
 * 核心控制器
 * @author Uzdz
 * @date: 2019/3/25 11:21
 * @since 0.1.0
 */
public class Controller {

    /**
     * 开启的命令 - 用数组的下标表示槽位
     */
    private Command[] onCommands;

    /**
     * 关闭的命令 - 用数组的下标表示槽位
     */
    private Command[] offCommands;

    public Controller() {
        // 开启命令有5个槽位
        onCommands = new Command[5];

        // 关闭命令有5个槽位
        offCommands = new Command[5];
    }

    public void onButton(int slot) {

        // 执行电器开启命令slot槽位操作
        onCommands[slot].execute();
    }

    public void offButton(int slot) {

        // 执行电器关闭命令slot槽位操作
        offCommands[slot].execute();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {

        // 将slot槽位的开启和关闭命令进行绑定，控制器无需关心具体是什么电器

        onCommands[slot] = onCommand;

        offCommands[slot] = offCommand;
    }
}
