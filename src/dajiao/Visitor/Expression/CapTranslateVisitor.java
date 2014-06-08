package dajiao.Visitor.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-9
 * Package Name : dajiao.Visitor.Expression
 */
public class CapTranslateVisitor extends ExpressionVisitor{
    @Override
    public void visit(LiteralExpression literalExpression) {
        literalExpression.setStr(literalExpression.getStr().toUpperCase());
    }

    @Override
    public void visit(RepetitionExpression repetitionExpression) {
        super.visit(repetitionExpression);
    }

    @Override
    public void visit(SequenceExpression sequenceExpression) {
        super.visit(sequenceExpression);
    }

    @Override
    public void visit(AlternationExpression alternationExpression) {
        super.visit(alternationExpression);
    }
}
