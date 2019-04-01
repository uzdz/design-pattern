package com.uzdz.行为型模式.迭代器模式;

import com.uzdz.行为型模式.迭代器模式.project.custom.MergeRestaurant;
import com.uzdz.行为型模式.迭代器模式.project.custom.merge.CoffeeHouse;
import com.uzdz.行为型模式.迭代器模式.project.custom.merge.ChineseRestaurant;
import com.uzdz.行为型模式.迭代器模式.project.java.IteratorWaiters;

public class ConsoleMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        IteratorWaiters waiters = new IteratorWaiters();

        System.out.println("本店的服务员有：");
        waiters.iteratorWaiters();

        System.out.println("*****************************************");

        MergeRestaurant mergeRestaurant = new MergeRestaurant();

        System.out.println("服务员将两个菜谱进行合并!");

        boolean coffee = mergeRestaurant.setIterator(CoffeeHouse.class);
        boolean chinese = mergeRestaurant.setIterator(ChineseRestaurant.class);


        if (coffee && chinese) {
            System.out.println("菜谱合并成功!");
        }

        System.out.println("将菜谱传递给客户，进行选菜。");

        System.out.println("客户翻了一遍...");
        mergeRestaurant.getMenus();

        System.out.println("客户翻又翻了一遍...");
        mergeRestaurant.getMenus();
    }
}
