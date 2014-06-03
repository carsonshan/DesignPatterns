package dajiao.Interpreter.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Normal
 */
public class TerminalExpression extends AbstractExpression{

    String str;

    public TerminalExpression(String str){
        this.str = str;
    }
    @Override
    public void Interpret(Context context) {
        context.appendStr(this.str);
    }
}
