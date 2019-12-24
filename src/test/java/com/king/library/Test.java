package com.king.library;

/**
 * @date: 2019/12/14 20:41
 * @author: duanyong
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        String s="aaaaa";
        int i=0;
        while(true){
            s += s+"============================================"+i;
        }
    }

    public static void test01(){
        test01();
        System.out.println("test01 over");
    }

    public static void test02(){

        System.out.println("test02 over");
    }
}
