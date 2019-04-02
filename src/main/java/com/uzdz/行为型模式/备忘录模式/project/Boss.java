package com.uzdz.行为型模式.备忘录模式.project;

import com.uzdz.行为型模式.备忘录模式.project.memento.Memento;

/**
 * 游戏角色
 * @author uzdz
 * @date: 2019/4/2 17:24
 * @since 0.1.0
 */
public class Boss {
    /**
     * 攻击力
     */
    private Integer vit;

    /**
     * 防御力
     */
    private Integer def;

    /**
     * 创建备忘录，保存boss当前实力
     * @return
     */
    public Memento CreateMemento(){
        return new Memento(this.vit,this.def);
    }

    /**
     * 恢复boss实力
     * @param memento
     */
    public void recoverMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    /**
     * 展示boss游戏实力
     */
    public void displayState(){
        System.out.println("游戏boss攻击力：" + getVit() + ",防御力：" + getDef());
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
