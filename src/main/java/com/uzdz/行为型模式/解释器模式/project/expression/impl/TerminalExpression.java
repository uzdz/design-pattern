package com.uzdz.行为型模式.解释器模式.project.expression.impl;

import com.uzdz.行为型模式.解释器模式.project.expression.Expression;

/**
 * 表达式 终结符
 * @author uzdz
 * @date: 2019/4/4 23:47
 * @since 0.1.0
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
