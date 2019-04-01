package com.uzdz.行为型模式.迭代器模式.project.custom.api;

/**
 * 迭代器接口
 * @author Uzdz
 * @date: 2019/4/1 14:32
 * @since 0.1.0
 */
public interface Iterator {

    /**
     * 是否由下一个
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个
     * @return
     */
    Object next();
}
