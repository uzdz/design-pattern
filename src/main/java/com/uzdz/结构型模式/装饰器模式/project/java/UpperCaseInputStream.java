package com.uzdz.结构型模式.装饰器模式.project.java;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义一个输入流转换
 * @author uzdz
 * @date: 2019/3/21 18:29
 * @since 0.1.0
 */
public class UpperCaseInputStream extends FilterInputStream {

    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toUpperCase((char) c);
    }
}
