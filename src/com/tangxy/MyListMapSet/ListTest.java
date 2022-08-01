package com.tangxy.MyListMapSet;

import java.util.*;

/**
 * List下有ArrayList，Vector，LinkedList
 */
public class ListTest {

    public static void main(String[] args) {

        /**
         * 1-ArrayList：
         * 类变量： 可知用的是{}数组；线程不安全；
         * private static final long serialVersionUID = 8683452581122892189L;
         *private static final int DEFAULT_CAPACITY = 10;
         *private static final Object[] EMPTY_ELEMENTDATA = {};
         *private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
         *transient Object[] elementData; // non-private to simplify nested class access
         *private int size;
         *
         * 构造器：
         * //指定初始大小，this.elementData = new Object[initialCapacity];
         * public ArrayList(int initialCapacity)
         *
         * //空参，默认大小为0，第一次add参数会扩容为max(10,arg.size())；
         * public ArrayList() {this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;}
         *
         * //如果参数正常的话直接复制
         * public ArrayList(Collection<? extends E> c)
         *
         * add:
         * 1.ensureCapacityInternal(size + 1); //用于判断是否溢出以及扩容
         * minCapacity为max(10,arg.size())；
         * 2.minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
         * 3.if (minCapacity - elementData.length > 0) grow(minCapacity);判断会溢出，扩容
         * int newCapacity = oldCapacity + (oldCapacity >> 1); 原来空间+原来空间左移1位(即yuan+(int)(yuan/2))
         *
         *
         */
        int oldCapacity=4;
        System.out.println(oldCapacity + (oldCapacity >> 1));
        System.out.println("**********************************************");
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(0,"my index to 0!");
        System.out.println("number:"+arrayList.size());
        Pt.myprint(arrayList);

        System.out.println("********************************************");

        /**
         * 类变量： 可知用的是双向链表；线程不安全；不需要考虑扩容问题
         * transient int size = 0;
         * transient Node<E> first;
         *transient Node<E> last;
         *
         * 构造器:
         * public LinkedList() {
         *     }
         *
         * public LinkedList(Collection<? extends E> c)
         */

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add("linkedList");
        System.out.println("number:"+linkedList.size());
        Pt.myprint(linkedList);
        System.out.println("********************************************");


        /**
         * 跟ArrayList差不多，就是加了synchronized;线程安全;
         */
        Vector<Object> vector = new Vector<>();
        vector.add(3);
        vector.add("vector");
        Pt.myprint(vector);
        vector.forEach(System.out::println);

    }
}


class Pt{
    public static void myprint(List list){
        System.out.println("method1-forEach");
        list.forEach(System.out::println);
        System.out.println("method2-for");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("method3-iterator-while");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("method4-forplus");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

