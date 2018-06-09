package cn.novate.architect_day21.simple2.status;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 17:40
 * Version 1.0
 * Params:
 * Description:    付款状态下的操作
*/

public class PaidStatus implements OrderOperateStatus {

    @Override
    public void pay() {
        // 付款之后，在付款状态下的类就不能重复付款
        System.out.println("不要重复支付");
    }

    @Override
    public void deliverGoods() {
        // 付款之后，就需要发货
        System.out.println("发货成功");
    }
}
