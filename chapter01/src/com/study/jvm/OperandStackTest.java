package com.study.jvm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang
 * @create 2020-12-01-11:02
 */
public class OperandStackTest {

    public static void main(String[] args) {
        add();
    }

    public void testAddOperation() {
        //byte、short、char、boolean：都以int型来保存
        byte i = 15;
        int j = 8;
        int k = i + j;


    }

    public int getSum(){
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum(){
        //获取上一个栈桢返回的结果，并保存在操作数栈中
        int i = getSum();
        int j = 10;
    }

    // 程序员面试过程中， 常见的i++和++i 的区别，放到字节码篇章时再介绍。
    public static void add(){
        //第1类问题：
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        //第2类问题：
        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        //第3类问题：
        int i7 = 10;
        i7 = i7++;
        System.out.println(i7);

        int i8 = 10;
        i8 = ++i8;
        System.out.println(i8);

        //第4类问题：
        int i9 = 10;
        int i10 = i9++ + ++i9; // 10+12
        System.out.println(i10);

        Map map = new HashMap();
        map.put(1,"s");
        map.put(2,"e");

        map.forEach((k,v) -> {
            System.out.println((int)k + (String)v);
        });
    }
}
