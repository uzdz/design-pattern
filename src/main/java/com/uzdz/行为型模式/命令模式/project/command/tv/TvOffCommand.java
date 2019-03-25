package com.uzdz.行为型模式.命令模式.project.command.tv;

import com.uzdz.行为型模式.命令模式.project.appliance.Tv;
import com.uzdz.行为型模式.命令模式.project.command.Command;

/**
 * 电视 - 关闭命令
 * @author uzdz
 * @date: 2019/3/25 11:13
 * @since 0.1.0
 */
public class TvOffCommand implements Command {

    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
