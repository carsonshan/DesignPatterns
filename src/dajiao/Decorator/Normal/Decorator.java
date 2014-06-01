package dajiao.Decorator.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-5-31
 * Package Name : dajiao
 */
public class Decorator extends Component {

    public Component component;

    public Decorator(){
    }

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void Operation(){
        component.Operation();
    }

}
