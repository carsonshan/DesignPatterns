package dajiao.Visitor.DispatchTest;

/**
 * Author       : mooncake
 * Created on   : 14-6-6
 * Package Name : dajiao.Visitor.DispatchTest
 */
public class Test {
    public static void main(String[] args){
        Animal animal;
        Cat cat;
        Dog dog;
        Food food;
        Mutton mutton;
        Fish fish;

        dog = new Dog();
        mutton = new Mutton();
        food = new Fish();
        animal = new Cat();

        animal.eat(mutton);
        animal.eat(food);

        dog.eat(mutton);
        dog.eat(food);
    }
}
