package com.uzdz.结构型模式.享元模式.project.base;

/**
 * 共享超类
 * @author uzdz
 * @date: 2019/4/2 18:19
 * @since 0.1.0
 */
public abstract class Flyweight {
    /**
     * 内部状态（指对象共享出来的信息，存储在享元对象内部并且不会随环境的改变而改变）
     */
    public String intrinsic;

    /**
     * 外部状态（指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。）
     */
    protected final String extrinsic;

    /**
     * 要求享元角色必须接受外部状态
     * @param extrinsic
     */
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    /**
     * 定义业务操作（随着环境变化而变化，由子类实现）
     * @param extrinsic
     */
    public abstract void operate(int extrinsic);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
