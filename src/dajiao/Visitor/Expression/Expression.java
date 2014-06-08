package dajiao.Visitor.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Expression
 */
public abstract class Expression {
    public abstract boolean match(Context context);
    public void Accept(ExpressionVisitor visitor){}
}
