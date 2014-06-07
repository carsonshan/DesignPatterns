package dajiao.Visitor.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Expression
 */
public class SequenceExpression extends Expression {

    Expression exp1;
    Expression exp2;

    public SequenceExpression(Expression exp1, Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean match(Context context) {
        return (exp1.match(context) && exp2.match(context));
    }
}
