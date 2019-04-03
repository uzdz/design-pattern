package com.uzdz.行为型模式.访问者模式.project.abs;

import com.uzdz.行为型模式.访问者模式.project.visitor.Visitor;

/**
 * 用于规定元素对象必须接收访问者基类
 * @author uzdz
 * @date: 2019/4/3 21:32
 * @since 0.1.0
 */
public abstract class Element {

    /**
     * 元素对象接收访问者并注入到访问者类内(双重注入)
     * @param visitor
     */
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
