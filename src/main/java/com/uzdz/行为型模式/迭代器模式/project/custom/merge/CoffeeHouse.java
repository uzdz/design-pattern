package com.uzdz.行为型模式.迭代器模式.project.custom.merge;

import com.uzdz.行为型模式.迭代器模式.project.custom.api.Iterator;
import com.uzdz.行为型模式.迭代器模式.project.custom.api.MergeContainer;

/**
 * 咖啡厅
 * @author Uzdz
 * @date: 2019/4/1 14:31
 * @since 0.1.0
 */
public class CoffeeHouse implements MergeContainer {

    private static String[] menus = new String[5];

    static {
        menus[0] = "拿铁咖啡";
        menus[1] = "现磨咖啡";
        menus[2] = "鲜橙汁";
    }

    @Override
    public Iterator getIterator() {
        return new CoffeeHouse.ToIterator();
    }

    class ToIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < menus.length && menus[index] != null) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            String foodName = menus[index];
            index++;
            return foodName;
        }
    }
}
