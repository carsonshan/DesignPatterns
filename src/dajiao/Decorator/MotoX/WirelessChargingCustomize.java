package dajiao.Decorator.MotoX;

/**
 * Author       : mooncake
 * Created on   : 14-6-1
 * Package Name : dajiao.Decorator.MotoX
 */
public class WirelessChargingCustomize extends Customize{

    public WirelessChargingCustomize(MotoXMobile mobile, int cost){
        this.mobile = mobile;
        this.cost = cost;
    }

    @Override
    public void Describe() {
        this.mobile.Describe();
        System.out.print(" Wireless Charging ");
    }

    @Override
    public int Cost() {
        return this.mobile.Cost() + this.cost;
    }
}

