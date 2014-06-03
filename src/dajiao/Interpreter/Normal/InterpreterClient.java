package dajiao.Interpreter.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Normal
 */
public class InterpreterClient{
    public static Context context;
    public static AbstractExpression exp;

    public static void main(String[] args){

        context = new Context();

        AbstractExpression exp1 = new TerminalExpression("aa");
        AbstractExpression exp2 = new TerminalExpression("bb");
        AbstractExpression exp3 = new NonterminalExpression(exp1, exp2);
        exp = new NonterminalExpression(exp2, exp1);

        exp.Interpret(context);
        System.out.println(context.getStr());
    }
}
