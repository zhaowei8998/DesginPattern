# 设模式七大原则
3. 依赖倒转(倒置)原则
```
Dependence Iversion Principle：
高层模块不应该依赖低层模块，二者都应该依赖其抽象
抽象不应该依赖细节，细节应该依赖抽象
依赖倒转(倒置)的中心思想就是面向接口编程
设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在Java中，抽象是指接口或者抽象类，细节就是实现类
使用接口或抽象类的目的是制定好规范，而不涉及任何具体操作，把细节展现的任务交给他们的实现类去完成
依赖关系的三种传递方式：
    1、接口传递
    2、构造方法传递
    3、setter方式传递
    代码：src/com/zhaowei/principle/inversion/improve/DependecyPass.java
注意事项和细节：
    1、底层模块尽量都要有抽象类或接口，或两者都有，程序稳定性更好
    2、变量的声明类型尽量是抽象类或者接口，这样我们的变量引用和实际对象直接，就存在一个缓冲层，利于程扩展和优化
```