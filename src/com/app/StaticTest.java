package com.app;

public class StaticTest {
    public static void main(String[] args) {

        StaticSub obj=new StaticSub();
        obj.num=5;
        obj.print();

        StaticSuper.num=10;
        obj.print();
        System.out.println(StaticSub.num);

        obj.m2();
        StaticSuper.m1();
        StaticSub.m1();

       // StaticSuper.m2();//impossible



    }


}
