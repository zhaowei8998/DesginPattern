package com.zhaowei.principle.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：emailTemplate";
    }
}

/**
 * 完成Person的接收消息
 * 方式一 分析
 * 1。简单
 * 2。如果我们接收的是微信，短信等 则新增类，同时person也要增加相应的接收方法
 * 3。解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
 *  因为Email，weixin 等属于接收的范围。他们各自实现IReceiver 接口就OK，这样我们就符合依赖倒转原则
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}