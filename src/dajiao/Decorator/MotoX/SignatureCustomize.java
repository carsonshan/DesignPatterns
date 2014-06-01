package dajiao.Decorator.MotoX;

/**
 * Author       : mooncake
 * Created on   : 14-6-1
 * Package Name : dajiao.Decorator.MotoX
 */
public class SignatureCustomize extends Customize{

    public String signature;

    public SignatureCustomize(MotoXMobile mobile, String signature, int cost){
        this.mobile = mobile;
        this.cost = cost;
        this.signature = signature;
    }

    @Override
    public void Describe() {
        this.mobile.Describe();
        System.out.print(" Signature{ " + signature + " } ");
    }

    @Override
    public int Cost() {
        return this.mobile.Cost() + this.cost;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
