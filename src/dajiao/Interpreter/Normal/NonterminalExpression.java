package dajiao.Interpreter.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Normal
 */
public class NonterminalExpression extends AbstractExpression{
    AbstractExpression exp1;
    AbstractExpression exp2;

    public NonterminalExpression(AbstractExpression exp1, AbstractExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public void Interpret(Context context) {
        exp1.Interpret(context);
        exp2.Interpret(context);
    }
}
