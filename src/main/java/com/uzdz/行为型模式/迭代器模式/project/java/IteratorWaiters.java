package com.uzdz.行为型模式.迭代器模式.project.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 获取全部的服务员
 * @author Uzdz
 * @date: 2019/4/1 15:04
 * @since 0.1.0
 */
public class IteratorWaiters {

    private static List<String> waiters = new ArrayList<>();

    static {
        waiters.add("张三");
        waiters.add("李四");
        waiters.add("王五");
    }

    /**
     * 遍历服务员
     */
    public void iteratorWaiters() {
        ToIterator toIterator = new ToIterator();

        while (toIterator.hasNext()) {
            System.out.println("服务员：" + toIterator.next());
        }
    }

    class ToIterator implements Iterator {

        AtomicInteger index = new AtomicInteger();

        @Override
        public boolean hasNext() {

            if (index.get() < waiters.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            String waiter = waiters.get(index.get());

            index.incrementAndGet();
            return waiter;
        }
    }
}
