package cn.novate.architect_day21.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 17:37
 * Version 1.0
 * Params:
 * Description:
*/

public class Client {
    public static void main(String[] args){

        Order order = new Order() ;
        order.pay();
        order.deliverGoods();
        // 打印结果：正常的情况
//        付款
//        发货
    }
}
