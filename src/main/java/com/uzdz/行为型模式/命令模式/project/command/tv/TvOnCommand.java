package com.uzdz.行为型模式.命令模式.project.command.tv;

import com.uzdz.行为型模式.命令模式.project.appliance.Tv;
import com.uzdz.行为型模式.命令模式.project.command.Command;

/**
 * 电视 - 开启命令
 * @author Uzdz
 * @date: 2019/3/25 11:13
 * @since 0.1.0
 */
public class TvOnCommand implements Command {

    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
