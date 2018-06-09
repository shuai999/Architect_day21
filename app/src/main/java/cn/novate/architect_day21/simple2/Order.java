package cn.novate.architect_day21.simple2;

import cn.novate.architect_day21.simple2.status.ObligationStatus;
import cn.novate.architect_day21.simple2.status.OrderOperateStatus;
import cn.novate.architect_day21.simple2.status.PaidStatus;
import cn.novate.architect_day21.simple2.status.WaitReceivingStatus;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 18:04
 * Version 1.0
 * Params:
 * Description:    订单的所有状态的类
*/

public class Order extends BaseOrder implements OrderOperateStatus {

    public Order(){
        // 默认的状态
        mStatus = new ObligationStatus() ;
    }


    @Override
    public void pay() {
        mStatus.pay();
        // 当前下的状态调用支付，然后把当前状态设置为已支付的状态
        setStatus(new PaidStatus());
    }

    @Override
    public void deliverGoods() {
        mStatus.deliverGoods();
        // 发货之后，把状态置为待收货状态
        setStatus(new WaitReceivingStatus());
    }
}
