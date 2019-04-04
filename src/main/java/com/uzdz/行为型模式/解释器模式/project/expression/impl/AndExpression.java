package com.uzdz.行为型模式.解释器模式.project.expression.impl;

import com.uzdz.行为型模式.解释器模式.project.expression.Expression;

/**
 * and 运算符
 * @author uzdz
 * @date: 2019/4/4 23:48
 * @since 0.1.0
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
