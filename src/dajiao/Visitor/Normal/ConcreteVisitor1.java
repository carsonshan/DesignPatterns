package dajiao.Visitor.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.Normal
 */
public class ConcreteVisitor1 extends Visitor{
    @Override
    public void VisitConcreteElementA(ConcreteElementA elementA) {
        System.out.println("Visitor1 adding operation to ConcreteElementA");
        elementA.OperationA();
    }

    @Override
    public void VisitConcreteElementB(ConcreteElementB elementB) {
        System.out.println("Visitor1 adding operation to ConcreteElementB");
        elementB.OperationB();
    }
}
