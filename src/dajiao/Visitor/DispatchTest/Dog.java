package dajiao.Visitor.DispatchTest;

/**
 * Author       : mooncake
 * Created on   : 14-6-6
 * Package Name : dajiao.Visitor.DispatchTest
 */
public class Dog extends Animal{
    @Override
    public void eat(Food food){
        System.out.println("Dog eat Food");
        System.out.println(food.getClass().toString());
    }
    @Override
    public void eat(Fish fish){
        System.out.println("Dog eat Fish");
        System.out.println(fish.getClass().toString());
    }
    @Override
    public void eat(Mutton mutton){
        System.out.println("Dog eat Mutton");
        System.out.println(mutton.getClass().toString());
    }
}
