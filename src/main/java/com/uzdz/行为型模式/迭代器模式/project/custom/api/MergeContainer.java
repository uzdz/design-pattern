package com.uzdz.行为型模式.迭代器模式.project.custom.api;

/**
 * 餐厅咖啡厅合并必须实现的接口
 * @author Uzdz
 * @date: 2019/4/1 14:33
 * @since 0.1.0
 */
public interface MergeContainer {

    /**
     * 获取迭代对象
     * @return
     */
    Iterator getIterator();
}
