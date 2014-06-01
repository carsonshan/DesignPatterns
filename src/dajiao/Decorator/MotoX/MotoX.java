package dajiao.Decorator.MotoX;

/**
 * Author       : mooncake
 * Created on   : 14-6-1
 * Package Name : dajiao.Decorator.MotoX
 */
public class MotoX extends MotoXMobile{

    public MotoX(int cost){
        this.cost = cost;
    }

    @Override
    public void Describe() {
        System.out.print("Moto X with");
    }

    @Override
    public int Cost(){
        return cost;
    }
}
