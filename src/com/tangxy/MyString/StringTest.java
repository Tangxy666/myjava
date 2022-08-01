package com.tangxy.MyString;

public class StringTest {
    public static void main(String[] args) {

        String s1 = "123";
        String s1t = "123";
        System.out.println(s1==s1t);
        s1="124";
        System.out.println(s1==s1t);
        /**
         * StringBuffer()：
             synchronized！！！
             new char[] value;
             int count;
             value=new char[capacity]
             public StringBuffer() {
             super(16);         无参数构造
             }

             public StringBuilder(String str) {
             super(str.length() + 16);
             append(str);       有参构造器
             }

            扩容：
            ensureCapacityInternal(count + len);

             private void ensureCapacityInternal(int minimumCapacity) {   //minimumCapacity:加入数据后需要的空间
             // overflow-conscious code
             if (minimumCapacity - value.length > 0) {
             value = Arrays.copyOf(value,
             newCapacity(minimumCapacity));    扩容！
             }
             }
             扩容：递归：每次扩容原来的2倍再+2，至新空间大于等于需要的空间（或超过最大空间）。
             private int newCapacity(int minCapacity) {
             // overflow-conscious code
             int newCapacity = (value.length << 1) + 2;
             if (newCapacity - minCapacity < 0) {
             newCapacity = minCapacity;
             }
             return (newCapacity <= 0 || MAX_ARRAY_SIZE - newCapacity < 0)
             ? hugeCapacity(minCapacity)
             : newCapacity;
             }
        **/
        StringBuffer s2 = new StringBuffer("123");
        StringBuffer s2t = new StringBuffer("123");
        System.out.println(s2==s2t);

        /**
         * StringBuilder():
         *
         *
         *      无参数构造:初始构建空间为16
         *      public StringBuilder() {
         *         super(16);
         *     }
         *     有参数构造:初始构建空间为length()+16
         *     public StringBuilder(String str) {
         *         super(str.length() + 16);
         *         append(str);
         *     }
         *
         *     public StringBuilder(CharSequence seq) {
         *         this(seq.length() + 16);
         *         append(seq);
         *     }
         *
         *     扩容同上；
         */
        StringBuilder s3 = new StringBuilder();
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        char[] chars = new char[10];
        chars[0]='1';
        chars[1]='2';
        String str="123456";
        str.getChars(0,str.length(),chars,2);
        System.out.println(chars);
    }
}
