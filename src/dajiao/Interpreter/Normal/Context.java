package dajiao.Interpreter.Normal;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Normal
 */
public class Context {
    StringBuilder str;

    public Context(){
        this.str = new StringBuilder();
    }

    public void appendStr(String str){
        this.str.append(str.toCharArray());
    }

    public String getStr(){
        return str.toString();
    }
}
