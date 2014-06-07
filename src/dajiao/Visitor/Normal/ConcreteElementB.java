package dajiao.Visitor.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.Normal
 */
public class ConcreteElementB extends Element{
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementB(this);
    }

    public void OperationB(){
        System.out.println("Here is OperationB");
    }
}
