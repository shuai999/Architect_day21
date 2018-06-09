package cn.novate.architect_day21.simple3;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/6/9 18:49
 * Version 1.0
 * Params:
 * Description:    大杯咖啡
*/

public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + mAdditives + "咖啡");
    }
}
