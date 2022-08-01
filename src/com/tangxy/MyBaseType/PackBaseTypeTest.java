package com.tangxy.MyBaseType;

public class PackBaseTypeTest {
    public static void main(String[] args) {
        //-128~127 'x'->:表示的值在-128~127也可以  1byte=8bit;256个数
        byte aByte='a';
        System.out.println("aByte:"+aByte);



        //-32768~-32767 'x'->:表示的值在-32768~-32767也可以 2byte=16bit;32,768个数
        short aShort=-32768;
        System.out.println("aShort:"+aShort);

        //-2147483648~2147483647 'x'->:表示的值在-2147483648~2147483647也可以 4byte=32bit;4294967296个数
        int aInt=2147483647;
        System.out.println("aInt:"+aInt);
        Integer aInteger3 = 127;
        Integer aInteger4 = 127;
        Integer aInteger1 = aInteger3+1;
        Integer aInteger2 = aInteger3+1;

        System.out.println("aInteger1==aInteger2:"+(aInteger1==aInteger2));
        System.out.println("aInteger3==aInteger4:"+(aInteger3==aInteger4));
        long aLong=-1844674407370955161L;
        System.out.println("aLong:"+aLong);

        float aFloat=-1.1f;
        System.out.println("aFloat:"+aFloat);

        double aDouble=-1.1;
        System.out.println("aDouble:"+aDouble);

        boolean aBoolean=true;
        System.out.println("aBoolean:"+aBoolean);

        char aChar='1';
        System.out.println("aChar:"+aChar);
    }

}
