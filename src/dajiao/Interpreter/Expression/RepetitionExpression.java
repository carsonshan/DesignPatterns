package dajiao.Interpreter.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Expression
 */
public class RepetitionExpression extends Expression{

    Expression exp;

    public RepetitionExpression(Expression exp){
        this.exp = exp;
    }

    @Override
    public boolean match(Context context) {
        while(exp.match(context)){
        }
        return true;
    }
}
