package com.uzdz.行为型模式.迭代器模式.project.custom;

import com.uzdz.行为型模式.迭代器模式.project.custom.api.Iterator;
import com.uzdz.行为型模式.迭代器模式.project.custom.api.MergeContainer;

import java.util.ArrayList;
import java.util.List;

/**
 * 合并后的餐厅
 * @author uzdz
 * @date: 2019/4/1 14:42
 * @since 0.1.0
 */
public class MergeRestaurant {

    private List<Class> iterators = new ArrayList<>(16);

    public boolean setIterator(Class iteratorClass) throws IllegalAccessException, InstantiationException {

        if (iteratorClass.newInstance() instanceof MergeContainer) {
            this.iterators.add(iteratorClass);
            return true;
        }


        return false;
    }

    public void getMenus() {
        iterators.stream().forEach((data) -> {
            try {
                MergeContainer container = (MergeContainer) data.newInstance();
                Iterator iterator = container.getIterator();
                while (iterator.hasNext()) {
                    System.out.println("菜品：" + iterator.next());
                }
            } catch (Exception e) {
                System.err.println("迭代异常，异常原因：" + e.getMessage());
            }
        });
    }
}
