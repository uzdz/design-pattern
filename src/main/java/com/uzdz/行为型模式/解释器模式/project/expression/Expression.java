package com.uzdz.行为型模式.解释器模式.project.expression;

/**
 * 抽象表达式类
 * @author uzdz
 * @date: 2019/4/4 21:00
 * @since 0.1.0
 */
public interface Expression {

    /**
     * 决策方法
     * @param context
     * @return
     */
    boolean interpret(String context);
}
