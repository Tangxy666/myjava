package com.tangxy.MyListMapSet;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Set下有HashSet，LinkedHashSet，TreeSet
 */
public class SetTest {


    public static void main(String[] args) {
        /**
         * 类变量：
         *  static final long serialVersionUID = -5024744406713321676L;
         *     private transient HashMap<E,Object> map;
         *     private static final Object PRESENT = new Object();
         *
         *  和hashMap差不多，add其实就是调的hashmap.put;
         *  即扩容的方式一样为未指定初始16，不为0时为2倍；扩容条件为默认0.75；
         */
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add("hashSet");
        System.out.println("number:"+hashSet.size());
        hashSet.forEach(System.out::println);
        System.out.println("**************************************************");

        /**
         * 跟LinkedHashMap差不多
         */

        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        System.out.println("用法都一样！");

        System.out.println("***************************************************");
        /**
         * 跟TreeMap差不多
         */
        TreeSet<Object> treeSet = new TreeSet<>();
        System.out.println("用法都一样");


    }
}
