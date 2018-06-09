package cn.novate.architect_day21.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 18:49
 * Version 1.0
 * Params:
 * Description:    小杯咖啡
*/

public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + mAdditives + "咖啡");
    }
}
