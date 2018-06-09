package cn.novate.architect_day21.simple2.status;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 17:38
 * Version 1.0
 * Params:
 * Description:    订单状态下调用对应的方法
*/

public interface OrderOperateStatus {
    // 支付
    void pay() ;
    // 发货
    void deliverGoods() ;
}
