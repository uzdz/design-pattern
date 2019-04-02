package com.uzdz.行为型模式.备忘录模式;

import com.uzdz.行为型模式.备忘录模式.project.Boss;
import com.uzdz.行为型模式.备忘录模式.project.Caretaker;

public class ConsoleMain {
    public static void main(String[] args) {
        // 创建游戏角色
        Boss boss = new Boss();

        // 大战Boss前，给游戏角色赋予初始值
        boss.setVit(100);
        boss.setDef(100);

        System.out.println("----大战Boss前-----");
        boss.displayState();

        // 把当前体能状态保存到守护对象，以便之后恢复
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(boss.CreateMemento());

        // 大战Boss后消耗了体力，减去相应的体能数据
        boss.setVit(50);
        boss.setDef(50);
        System.out.println("----大战Boss后-----");
        boss.displayState();

        // 恢复元气
        boss.recoverMemento(caretaker.getMemento());
        System.out.println("----恢复元气后-----");
        boss.displayState();
    }
}
