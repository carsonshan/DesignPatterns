package dajiao.Visitor.Normal;

import java.util.ArrayList;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.Normal
 */
public class Client {
    static Element element;
    static Visitor visitor;
    public static void main(String[] args){
        ArrayList<Element> list = new ArrayList<Element>();

        // Object Structure
        list.add(new ConcreteElementA());
        list.add(new ConcreteElementB());
        list.add(new ConcreteElementA());
        list.add(new ConcreteElementB());

        // iterate the structure using ConcreteVisitor1
        // which simulate a operation 1 on every element
        // in object structure(the list)
        visitor = new ConcreteVisitor1();
        for(Element element : list){
            element.Accept(visitor);
        }
    }
}
