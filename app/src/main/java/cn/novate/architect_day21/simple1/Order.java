package cn.novate.architect_day21.simple1;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 17:22
 * Version 1.0
 * Params:
 * Description:    假设现在写了3种状态，在第一个版本3个状态已经够了；
 *                 但是在第二个版本，增加了很多的状态，比如新增待评价状态或者其他的状态，那么就需要在下边新增好几个方法，并且每个方法中都会新增
 *                 if...else...判断，比较麻烦，那么这个时候，就可以采用状态设计模式
*/

public class Order {
    // 默认待付款状态
    public final int OBLIGATION = 1 ;
    // 已付款
    public final int PAID = 2 ;
    // 待收货
    public final int WAITRECEIVING = 3 ;

    // 订单状态
    public int mStatus = OBLIGATION ;

    // 付款
    public void pay(){
        if (mStatus == OBLIGATION){
            // 付款之后，将状态置为已付款状态
            mStatus = PAID ;
            System.out.println("付款");
        }else{
            System.out.println("不在状态");
        }
    }

    // 发货
    public void deliverGoods(){
        if (mStatus == PAID){
            // 付款之后，将状态置为已付款状态
            mStatus = WAITRECEIVING ;
            System.out.println("发货");
        }else{
            System.out.println("不在状态");
        }
    }
}
