package dajiao.Visitor.DispatchTest;

/**
 * Author       : mooncake
 * Created on   : 14-6-6
 * Package Name : dajiao.Visitor.DispatchTest
 */
public class Animal {
    public void eat(Food food){
        System.out.println("Animal eat Food");
        System.out.println(food.getClass().toString());
    }

    public void eat(Fish fish){
        System.out.println("Animal eat Fish");
        System.out.println(fish.getClass().toString());
    }

    public void eat(Mutton mutton){
        System.out.println("Animal eat Mutton");
        System.out.println(mutton.getClass().toString());
    }
}
