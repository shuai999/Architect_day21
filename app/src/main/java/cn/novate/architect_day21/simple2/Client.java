package cn.novate.architect_day21.simple2;


/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 18:29
 * Version 1.0
 * Params:
 * Description:    状态设计模式测试订单状态
*/

public class Client {
    public static void main(String[] args){

        // 创建Order订单对象
        Order order = new Order() ;
        // 先调用支付，再调用发货
        order.pay();
        order.deliverGoods();
    }
}
