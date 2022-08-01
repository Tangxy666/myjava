package com.tangxy.MyListMapSet;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Map下有Hashtable，LinkedHashMap，HashMap，TreeMap
 */

public class MapTest {
    public static void main(String[] args) {
        /**
         * 类变量： 线程安全；存数据用Entry<?,?>[];链接方式是[]数组方式
         * private transient Entry<?,?>[] table;  数据！
         * private transient int count;           当前已经存的大小
         * private int threshold;                  达到多少值要扩容
         * private float loadFactor;                达到当前空间大小的多少倍要扩容
         * private transient int modCount = 0;
         * private static final long serialVersionUID = 1421746759512286392L;
         *
         * 构造器：
         * //双参构造器，当initialCapacity==0时，初始化为大小1；大于0时直接创建table；故未指定大小，初始化大小为11。
         *  public Hashtable(int initialCapacity, float loadFactor)
         *
         *  table = new Entry<?,?>[initialCapacity];
         *
         * //单参构造器，默认调用双参数构造器，参数设置为（int arg,0.75）
         * public Hashtable(int initialCapacity) {this(initialCapacity, 0.75f);}
         *
         * //空参，默认调用双参数构造器，参数设置为（11,0.75）
         * public Hashtable() {this(11, 0.75f);}
         *
         * put:
         * 先获取hashcode()的值，判断put的key在table中不存在；之后调addEntry(hash, key, value, index);
         * 之后调addEntry：
         *              if (count >= threshold)开始扩容；
         *                      int newCapacity = (oldCapacity << 1) + 1 即（乘2加1）
         *
         *
         *
         */


        Hashtable<Object, Object> hashtable = new Hashtable<>();
        hashtable.put("myname","hashtable");
        System.out.println("myname:"+hashtable.get("myname"));

        /**
         * 类变量：线程不安全；存数据用Entry，链接方式是链表，不用考虑扩容；
         * private static final long serialVersionUID = 3801124242820219131L;
         * transient LinkedHashMap.Entry<K,V> head;
         * transient LinkedHashMap.Entry<K,V> tail;
         * final boolean accessOrder;
         */

        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
        System.out.println("用法一样！");


        /**
         * 类变量：
         * transient Node<K,V>[] table;
         * transient Set<Map.Entry<K,V>> entrySet;
         * transient int size;
         *  transient int modCount;
         *  int threshold;
         *  final float loadFactor;
         *
         * 默认常量：
         * static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
         *  static final int MAXIMUM_CAPACITY = 1 << 30;
         *  static final float DEFAULT_LOAD_FACTOR = 0.75f;
         *  static final int TREEIFY_THRESHOLD = 8;
         *  static final int UNTREEIFY_THRESHOLD = 6;
         *  static final int MIN_TREEIFY_CAPACITY = 64;
         *
         *  构造器：
         *  //指定初始化大小以及多少倍时扩容
         *  public HashMap(int initialCapacity, float loadFactor)
         *
         *  //指定初始大小；默认达到0.75空间时扩容
         *  public HashMap(int initialCapacity)
         *
         *  //一般空参,指定默认loadFactor = DEFAULT_LOAD_FACTOR;即当达到0.75空间时扩容；
         *  public HashMap()
         *
         *  put：
         *  ....一堆操作判断是否正常
         *  判断hashcode,防重复
         *  ....一堆操作判断是否正常
         *
         *  ....一堆操作判断是否正常
         *
         *  if (++size > threshold) 需要扩容
         *             resize();   扩容
         * //扩容方式：原来大小为0时，扩为16；不为0时扩为原来的2倍。
         *
         *
         *
         */
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("myname","hashMap");
        System.out.println("用法一样！");

        TreeMap<Object, Object> treeMap = new TreeMap<>();
        System.out.println("用法一样！");
    }
}
