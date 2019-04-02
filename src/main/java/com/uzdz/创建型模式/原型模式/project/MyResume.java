package com.uzdz.创建型模式.原型模式.project;

import com.uzdz.创建型模式.原型模式.project.base.Resume;

/**
 * 我的简历实现类,需要实现java的Cloneable接口和自定义的Resume接口
 * @author uzdz
 * @date: 2019/4/2 16:17
 * @since 0.1.0
 */
public class MyResume extends Resume implements Cloneable {

    /**
     * 实现克隆方法，直接用java父类自带的克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Resume Clone() throws CloneNotSupportedException {
        return (Resume)this.clone();
    }
}
