# 问题描述

## 厂商遥控器适配项目

> 电视默认提供基础抽象类，比如电视的开关、上一个、下一个等，不同的厂商比如索尼、三星等都通过继承实现电视遥控器，以完成对自身厂商电视的实现。

## 桥接模式（Bridge Pattern）

### 模式概述

> 桥接模式将抽象部分与它的实现部分分离开来，使他们都可以独立变化。

> 桥接模式将继承关系转化成关联关系，它降低了类与类之间的耦合度，减少了系统中类的数量，也减少了代码量。

### 优点
1. 抽象和实现的分离，使得抽象子类与实现可以自由扩展。
3. 实现部分细节对于客户端透明。

### 缺点
1. 桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。

## 注意事项
1. 当系统对于两个独立变化的维度分类时，而每一种分类又有可能变化，使用桥接模式再适合不过了。
2. 如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，通过桥接模式可以使它们在抽象层建立一个关联关系。