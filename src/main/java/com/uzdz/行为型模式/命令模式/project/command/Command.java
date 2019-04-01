package com.uzdz.行为型模式.命令模式.project.command;

/**
 * 命令接口
 * @author Uzdz
 * @date: 2019/3/25 11:00
 * @since 0.1.0
 */
public interface Command {

    /**
     * 子类实现该命令后，具体的操作内容
     */
    void execute();
}
