package com.uzdz.行为型模式.备忘录模式.project.memento;

/**
 * 备忘录对象，保存boss的状态
 * @author uzdz
 * @date: 2019/4/2 17:23
 * @since 0.1.0
 */
public class Memento {
    /**
     * 攻击力
     */
    private Integer vit;

    /**
     * 防御力
     */
    private Integer def;

    /**
     * 构造器中保存状态
     * @param vit
     * @param def
     */
    public Memento(Integer vit, Integer def) {
        this.vit = vit;
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }
}
