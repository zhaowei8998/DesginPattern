package com.zhaowei.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }
}

interface IReceiver{
    String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息：emailTemplate";
    }
}
class Weixin implements IReceiver{
    public String getInfo(){
        return "微信信息：weixinlTemplate";
    }
}
/**
 * 方式二
 */
class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}