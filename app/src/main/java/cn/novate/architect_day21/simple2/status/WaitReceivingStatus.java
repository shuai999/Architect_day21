package cn.novate.architect_day21.simple2.status;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 17:40
 * Version 1.0
 * Params:
 * Description:    待收货状态下的操作
*/

public class WaitReceivingStatus implements OrderOperateStatus {

    @Override
    public void pay() {
        // 待收货状态下，就不能再付款了，因为已经付款了
        System.out.println("不在状态");
    }

    @Override
    public void deliverGoods() {
        // 待收货状态下，就不能在发货了，因为已经发货了
        System.out.println("不在状态");
    }
}
