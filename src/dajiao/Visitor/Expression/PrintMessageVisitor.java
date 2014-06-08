package dajiao.Visitor.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-9
 * Package Name : dajiao.Visitor.Expression
 */
public class PrintMessageVisitor extends ExpressionVisitor{
    @Override
    public void visit(LiteralExpression literalExpression) {
        System.out.println("the current node is " + literalExpression.getClass().toString());
        System.out.println("so the str of current terminal node is " + literalExpression.getStr());
    }

    @Override
    public void visit(RepetitionExpression repetitionExpression) {
        System.out.println("the current node is " + repetitionExpression.getClass().toString());
    }

    @Override
    public void visit(SequenceExpression sequenceExpression) {
        System.out.println("the current node is " + sequenceExpression.getClass().toString());
    }

    @Override
    public void visit(AlternationExpression alternationExpression) {
        System.out.println("the current node is " + alternationExpression.getClass().toString());
    }
}
