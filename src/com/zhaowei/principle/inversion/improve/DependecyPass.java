package com.zhaowei.principle.inversion.improve;

/**
 * 依赖关系传递的三种方式和应用案例
 * 方式一：通过接口传递实现依赖
 * 方式二：通过构造方法传递
 * 方式三：通过setter传递依赖
 */
public class DependecyPass {
    //方式一：通过接口传递实现依赖
//    public static void main(String[] args) {
//        OpenAndClose opneAndClose = new OpenAndClose();
//        ChanghongTV changhongTV = new ChanghongTV();
//        opneAndClose.open(changhongTV);
//    }
    //方式二：通过构造方法传递
//    public static void main(String[] args) {
//        ChanghongTV changhongTV = new ChanghongTV();
//        OpenAndClose openAndClose = new OpenAndClose(changhongTV);
//        openAndClose.open();
//    }
    //方式三：通过setter传递依赖
    public static void main(String[] args) {
        ChanghongTV changhongTV = new ChanghongTV();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changhongTV);
        openAndClose.open();
    }
}

//方式一：通过接口传递实现依赖
//电视的接口
//interface ITV{
//    public void play();
//}
////开关的接口
//interface IOpenAndClose{
//    public void open(ITV tv);//抽象方法，接收接口
//}
//class ChanghongTV implements ITV{
//    @Override
//    public void play() {
//        System.out.println("长虹电视打开了");
//    }
//}
//class OpenAndClose implements IOpenAndClose{
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}
//方式二：通过构造方法传递依赖
//interface ITV{
//    public void play();
//}
//interface IOpenAndClose{
//    public void open();
//}
//class ChanghongTV implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视用方法二打开了");
//    }
//}
//class OpenAndClose implements IOpenAndClose{
//    public ITV tv;
//    public OpenAndClose(ITV tv){
//        this.tv = tv;
//    }
//    @Override
//    public void open() {
//        tv.play();
//    }
//}
//方式三：通过setter方式传递依赖
interface ITV {
    public void play();
}

interface IOpenAndClose {

    public void setTv(ITV tv);

    public void open();

}

class OpenAndClose implements IOpenAndClose{

    private ITV tv;

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }


}
class ChanghongTV implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视用方法三打开了");
    }
}