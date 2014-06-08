package dajiao.Visitor.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Expression
 */
public class ExpressionClient {

    public static Context context;
    public static Expression exp;
    public static ExpressionVisitor visitor;

    public static void main(String[] args){
        context = new Context("appleappleorangeappledog ");

        Expression exp1 = new LiteralExpression("apple");
        Expression exp2 = new LiteralExpression("orange");
        Expression exp3 = new AlternationExpression(exp1, exp2);
        exp1 = new RepetitionExpression(exp3);
        exp3 = new LiteralExpression("dog");
        exp = new SequenceExpression(exp1,exp3);

        System.out.println(exp.match(context));

        visitor = new PrintMessageVisitor();
        exp.Accept(visitor);
        visitor = new CapTranslateVisitor();
        exp.Accept(visitor);
        visitor = new PrintMessageVisitor();
        exp.Accept(visitor);
    }
}
