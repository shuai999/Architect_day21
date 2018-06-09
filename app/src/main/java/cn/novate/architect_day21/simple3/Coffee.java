package cn.novate.architect_day21.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 18:43
 * Version 1.0
 * Params:
 * Description:    咖啡的抽象类：算是基类，让大杯、中杯、小杯都继承自基类
*/

public abstract class Coffee {

    // 咖啡的接口
    protected CoffeeAdditives mAdditives ;
    public Coffee(CoffeeAdditives coffeeAdditives){
        this.mAdditives = coffeeAdditives ;
    }

    // 生成一杯咖啡
    public abstract void makeCoffee() ;
}
