package dajiao.Decorator.Normal;

import dajiao.Decorator.Normal.Component;
import dajiao.Decorator.Normal.Decorator;

/**
 * Author       : mooncake
 * Created on   : 14-6-1
 * Package Name : dajiao
 */
public class ConcreteDecoratorB extends Decorator {
    public int addedState;

    public ConcreteDecoratorB(Component component, int addedState){
        this.component = component;
        this.addedState = addedState;
    }

    @Override
    public void Operation(){
        // do something with addedState
    }
}
