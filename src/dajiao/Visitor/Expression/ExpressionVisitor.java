package dajiao.Visitor.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-9
 * Package Name : dajiao.Visitor.Expression
 */
public class ExpressionVisitor {
    public void visit(LiteralExpression literalExpression){}
    public void visit(RepetitionExpression repetitionExpression){}
    public void visit(SequenceExpression sequenceExpression){}
    public void visit(AlternationExpression alternationExpression){}
}
