package com.zhaowei.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("==============");

        B b = new B();
        System.out.println("11-3="+b.func1(11,3));
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("1-8="+b.func2(11,3));
        System.out.println("11-3="+b.func3(11,3));
        System.out.println("1-8="+b.func3(1,8));
        System.out.println("1-8="+b.func4(11,3));

    }
}
class A{
    public int func1(int a,int b) {
        return a-b;
    }
}
class B extends A{
    public int func1(int a,int b) {
        return a+b;
    }
    public int func2(int a,int b) {
        return func1(a,b)+9;
    }
    public int func3(int a,int b) {
        return super.func1(a,b);
    }
    public int func4(int a,int b) {
        return func3(a,b)+9;
    }
}
