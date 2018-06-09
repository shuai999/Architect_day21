package cn.novate.architect_day21.simple2;

import cn.novate.architect_day21.simple2.status.OrderOperateStatus;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 18:03
 * Version 1.0
 * Params:
 * Description:    在执行完某个状态下的方法之后，然后设置当前订单的状态
*/

public class BaseOrder {
    protected OrderOperateStatus mStatus ;

    public void setStatus(OrderOperateStatus status){
        this.mStatus = status ;
    }
}
