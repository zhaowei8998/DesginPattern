package com.zhaowei.principle.segregation;

/**
 *
 * 没有使用接口隔离
 * B c 实现多余的方法
 */
public class Segregation1 {
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class A implements Interface1 {

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

    @Override
    public void operation4() {
        System.out.println("A类实现了接口4");
    }

    @Override
    public void operation5() {
        System.out.println("A类实现了接口5");
    }
}

class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("B类实现了接口1");
    }

    @Override
    public void operation2() {
        System.out.println("B类实现了接口2");
    }

    @Override
    public void operation3() {
        System.out.println("B类实现了接口3");
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

class C {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
        System.out.println("c类使用了operation1");
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
        System.out.println("c类使用了operation2");
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
        System.out.println("c类使用了operation3");
    }
}

class D {
    public void depend1(Interface1 interface1) {
        interface1.operation1();
        System.out.println("d类使用了operation1");
    }

    public void depend4(Interface1 interface1) {
        interface1.operation4();
        System.out.println("d类使用了operation4");
    }

    public void depend5(Interface1 interface1) {
        interface1.operation5();
        System.out.println("d类使用了operation5");
    }
}