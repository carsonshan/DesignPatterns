package dajiao.Decorator.MotoX;

/**
 * Author       : mooncake
 * Created on   : 14-6-1
 * Package Name : dajiao.Decorator.MotoX
 */
public class MotoXTest {

        static MotoXMobile mobile;
    public static void main(String[] args){
        mobile = new SignatureCustomize(
                new WirelessChargingCustomize(
                        new BackCustomize(
                                new MotoX(399), "red", 29), 50), "mooncake", 30);
        ((SignatureCustomize)mobile).setSignature("dajiao");

        mobile.Describe();
        System.out.println();
        System.out.println("the customized Moto X cost " + mobile.Cost() + " USD");
    }
}
