package com.uzdz.结构型模式.享元模式.project;

import com.uzdz.结构型模式.享元模式.project.base.Flyweight;
import com.uzdz.结构型模式.享元模式.project.impl.ConcreteFlyweight;

import java.util.HashMap;

/**
 * 享元工厂
 * @author uzdz
 * @date: 2019/4/2 18:22
 * @since 0.1.0
 */
public class FlyweightFactory {

    /**
     * 定义一个缓存池容器
     */
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    /**
     * 享元工厂
     * @param extrinsic
     * @return
     */
    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;

        //池中有该对象
        if(pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
            System.out.print("已有 " + extrinsic + " 直接从池中取---->");
        } else {
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight(extrinsic);

            //放入池中
            pool.put(extrinsic, flyweight);
            System.out.print("创建 " + extrinsic + " 并从池中取出---->");
        }

        return flyweight;
    }
}
