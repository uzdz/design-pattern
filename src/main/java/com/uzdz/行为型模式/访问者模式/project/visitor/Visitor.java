package com.uzdz.行为型模式.访问者模式.project.visitor;

import com.uzdz.行为型模式.访问者模式.project.abs.Element;

/**
 * 访问者算法接口(算法由实现类实现)
 * @author uzdz
 * @date: 2019/4/3 21:32
 * @since 0.1.0
 */
public interface Visitor {

    /**
     * 具体实现类实现算法逻辑
     * @param element
     */
    void visitor(Element element);
}
