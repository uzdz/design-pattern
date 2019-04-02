package com.uzdz.行为型模式.备忘录模式.project;

import com.uzdz.行为型模式.备忘录模式.project.memento.Memento;

/**
 * 守护者对象，存储boss状态的备忘录
 * @author uzdz
 * @date: 2019/4/2 17:26
 * @since 0.1.0
 */
public class Caretaker {
    /**
     * boss状态备忘录
     */
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
