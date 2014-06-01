package dajiao.Decorator.Normal;

import dajiao.Decorator.Normal.Component;
import dajiao.Decorator.Normal.Decorator;

/**
 * Author       : mooncake
 * Created on   : 14-5-31
 * Package Name : dajiao
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA (Component component){
        super(component);
    }

    @Override
    public void Operation(){
        this.component.Operation();
        this.AddedBehavior();
    }

    // special behavior of the decorator
    public void AddedBehavior(){
        // do something here
    }
}
