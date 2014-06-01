package dajiao.Decorator.MotoX;

/**
 * Author       : mooncake
 * Created on   : 14-6-1
 * Package Name : dajiao.Decorator.MotoX
 */
public class BackCustomize extends Customize{

    public String color;

    public BackCustomize(MotoXMobile mobile, String color, int cost){
        this.mobile = mobile;
        this.cost = cost;
        this.color = color;
    }

    @Override
    public void Describe(){
        this.mobile.Describe();
        System.out.print(" BackCover{ Color " + color + " } ");
    }

    @Override
    public int Cost() {
        return mobile.Cost() + cost;
    }

}
