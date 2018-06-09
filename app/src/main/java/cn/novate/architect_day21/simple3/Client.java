package cn.novate.architect_day21.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 18:55
 * Version 1.0
 * Params:
 * Description:    桥接设计模式测试类
*/

public class Client {
    public static void main(String[] args){

        // 小杯的加糖咖啡
        Sugar sugar = new Sugar() ;
        SmallCoffee smallCoffee = new SmallCoffee(sugar) ;
        smallCoffee.makeCoffee();


        // 大杯的原味咖啡
        // 一个对象依赖于另一个对象，所依赖的是接口，它们之间没有紧密的联系
        Original original = new Original() ;
        LargeCoffee largeCoffee = new LargeCoffee(original) ;
        largeCoffee.makeCoffee();


        MiddleCoffee middleCoffee = new MiddleCoffee(original) ;
        middleCoffee.makeCoffee();
    }
}
