package com.uzdz.行为型模式.迭代器模式.project.custom.merge;

import com.uzdz.行为型模式.迭代器模式.project.custom.api.Iterator;
import com.uzdz.行为型模式.迭代器模式.project.custom.api.MergeContainer;

import java.util.ArrayList;
import java.util.List;

/**
 * 中餐厅
 * @author Uzdz
 * @date: 2019/4/1 14:31
 * @since 0.1.0
 */
public class ChineseRestaurant implements MergeContainer {

    private static List<String> menus = new ArrayList<>(16);

    static {
        menus.add("西红柿炒鸡蛋");
        menus.add("拍黄瓜");
        menus.add("蛋炒饭");
    }

    @Override
    public Iterator getIterator() {
        return new ToIterator();
    }

    class ToIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < menus.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            String foodName = menus.get(index);
            index++;
            return foodName;
        }
    }
}
