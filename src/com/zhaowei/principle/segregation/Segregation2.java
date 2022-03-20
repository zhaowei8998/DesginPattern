package com.zhaowei.principle.segregation;

/**
 * 使用接口隔离
 * 把接口拆分
 * b c实现需要的方法
 * 接口隔离原则：客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
 */
public class Segregation2 {
    public static void main(String[] args) {
        C2 c = new C2();
        c.depend1(new A2());
        c.depend2(new A2());
        c.depend3(new A2());
        D2 d = new D2();
        d.depend1(new B2());
        d.depend4(new B2());
        d.depend5(new B2());
    }
}

interface Interface21 {
    void operation1();

}

interface Interface22 {
    void operation2();

    void operation3();
}

interface Interface23 {
    void operation4();

    void operation5();
}

class A2 implements Interface21, Interface22 {

    @Override
    public void operation1() {
        System.out.println("A类实现了接口1");
    }

    @Override
    public void operation2() {
        System.out.println("A类实现了接口2");
    }

    @Override
    public void operation3() {
        System.out.println("A类实现了接口3");
    }
}

class B2 implements Interface21, Interface23 {
    @Override
    public void operation1() {
        System.out.println("B类实现了接口1");
    }

    @Override
    public void operation4() {
        System.out.println("B类实现了接口4");
    }

    @Override
    public void operation5() {
        System.out.println("B类实现了接口5");
    }
}

class C2 {
    public void depend1(Interface21 interface21) {
        interface21.operation1();
        System.out.println("c类使用了operation1");
    }

    public void depend2(Interface22 interface22) {
        interface22.operation2();
        System.out.println("c类使用了operation2");
    }

    public void depend3(Interface22 interface22) {
        interface22.operation3();
        System.out.println("c类使用了operation3");
    }
}

class D2 {
    public void depend1(Interface21 interface21) {
        interface21.operation1();
        System.out.println("d类使用了operation1");
    }

    public void depend4(Interface23 interface23) {
        interface23.operation4();
        System.out.println("d类使用了operation4");
    }

    public void depend5(Interface23 interface23) {
        interface23.operation5();
        System.out.println("d类使用了operation5");
    }
}