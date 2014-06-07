package dajiao.Visitor.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.Normal
 */
public class ConcreteElementA extends Element{
    @Override
    public void Accept(Visitor visitor) {
        visitor.VisitConcreteElementA(this);
    }

    public void OperationA(){
        System.out.println("here is OperationA");
    }
}
