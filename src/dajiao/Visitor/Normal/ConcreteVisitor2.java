package dajiao.Visitor.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.Normal
 */
public class ConcreteVisitor2 extends Visitor{
    @Override
    public void VisitConcreteElementA(ConcreteElementA elementA) {
        System.out.println("Visitor2 adding operation to elementA");
        elementA.OperationA();
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB elementB) {
        System.out.println("Visitor2 adding operation to elementB");
        elementB.OperationB();
    }
}
