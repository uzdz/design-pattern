# 问题描述

## 求职者投递简历项目

> 大家求职面试都会用到简历，简历书写完毕就很少改动了，应聘不同的公司可以打印一样的简历，我们把打印简历的过程应用到代码层面就是原型模式了。

## 原型模式（Prototype Pattern）

### 模式概述

> 用于创建重复的对象，同时又能保证性能，提供了一种创建对象的最佳方式。

> 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

> 简单理解就是复制对象，得到全新对象，这个全新对象拥有了跟老对象一样的属性值和方法。

### 优点
1. 性能提高。
2. 逃避构造函数的约束。

### 缺点
1. 配备克隆方法需要对类的功能进行通盘考虑，这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持串行化的间接对象，或者引用含有循环结构的时候。
2. 必须实现 Cloneable 接口。

## 注意事项
1. 与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。
2. 原型模式就是为我们创建相同对象带来便利的，只要有了一个原型对象，之后要创建对象就不用每次都new了，也不用给新创建的对象赋值了，直接调用克隆方法就可以拥有无数可用对象。

# Java Clone()深度克隆
> 原型模式中有深度克隆和浅克隆，在浅克隆中需要考虑成员变量对象是否为原生对象（String,Integer等是原生对象），如果是非原生对象还需要层层克隆。而java父类的clone()方法是深度克隆的，我们在例子中也看到了，并没有层层克隆，所以浅克隆就不需过多了解了，java就是那么强大。

# 原型模式中有三个登场角色
#### 原型角色：定义用于复制现有实例来生成新实例的方法
```java
// 以贴主示例代码为例  
implements Cloneable   // 1.（抽象类或者接口）实现 java.lang.Cloneable 接口
public Shape clone();  // 2.定义复制现有实例来生成新实例的方法
```

#### 具体原型角色：实现用于复制现有实例来生成新实例的方法
```java
public Shape clone() {// 2.实现复制现有实例来生成新实例的方法（也可以由超类完成）
    Shape clone = null;
    try {
        clone = (Shape) clone();
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
    return clone;
}
```
#### 使用者角色：维护一个注册表，并提供一个找出正确实例原型的方法。最后，提供一个获取新实例的方法，用来委托复制实例的方法生成新实例。
```java
private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();//维护一个注册表
public static void loadCache() {
    Circle circle = new Circle();
    circle.setId("1");
    shapeMap.put(circle.getId(),circle);

    Square square = new Square();
    square.setId("2");
    shapeMap.put(square.getId(),square);

    Rectangle rectangle = new Rectangle();
    rectangle.setId("3");
    shapeMap.put(rectangle.getId(),rectangle);
}
public static Shape getShape(String shapeId) {//提供一个获取新实例的方法
    Shape cachedShape = shapeMap.get(shapeId);//提供一个找出正确实例原型的方法
    return (Shape) cachedShape.clone();//委托复制实例的方法生成新实例。
}
```