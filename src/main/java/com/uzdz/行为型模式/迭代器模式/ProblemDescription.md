# 问题描述

## 咖啡店与中餐厅菜单合并项目

> 咖啡厅和中餐厅进行合并，开一家新餐馆，那么这个新餐馆的菜单也需要合并为一个给客户提供。

> 由于不同的餐厅、咖啡店菜单可能采用不同的方式存储，合并为一家新餐厅之后，便利不同的菜单便成为了麻烦，需要引出迭代器，来将不同餐厅的菜单与新餐厅菜单解耦。

## 迭代器模式（Iterator Pattern）

### 模式概述

> 迭代器提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。屏蔽了便利对象的内部表现，通过迭代器为其提供统一接口暴露。

### 优点
1. 它支持以不同的方式遍历一个聚合对象。
2. 迭代器简化了聚合类。
3. 在同一个聚合上可以有多个遍历。
4. 在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。

### 缺点
1. 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。

## 注意事项
1. 迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。
2. 用于访问一个聚合对象的内容而无须暴露它的内部表示，迭代器为遍历不同的聚合结构提供一个统一的接口。

#### Java内置的迭代器Iterator
> 可以通过实现Iterator接口，实现hasNext()、next()等方法，完成对象的迭代功能

```java
public interface Iterator<E> {
    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    boolean hasNext();

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    E next();

    /**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation).  This method can be called
     * only once per call to {@link #next}.  The behavior of an iterator
     * is unspecified if the underlying collection is modified while the
     * iteration is in progress in any way other than by calling this
     * method.
     *
     * @implSpec
     * The default implementation throws an instance of
     * {@link UnsupportedOperationException} and performs no other action.
     *
     * @throws UnsupportedOperationException if the {@code remove}
     *         operation is not supported by this iterator
     *
     * @throws IllegalStateException if the {@code next} method has not
     *         yet been called, or the {@code remove} method has already
     *         been called after the last call to the {@code next}
     *         method
     */
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

    /**
     * Performs the given action for each remaining element until all elements
     * have been processed or the action throws an exception.  Actions are
     * performed in the order of iteration, if that order is specified.
     * Exceptions thrown by the action are relayed to the caller.
     *
     * @implSpec
     * <p>The default implementation behaves as if:
     * <pre>{@code
     *     while (hasNext())
     *         action.accept(next());
     * }</pre>
     *
     * @param action The action to be performed for each element
     * @throws NullPointerException if the specified action is null
     * @since 1.8
     */
    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }
}
```