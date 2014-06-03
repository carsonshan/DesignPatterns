package dajiao.Interpreter.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Expression
 */
public class Context {
    StringBuilder str;

    public Context(String str){
        this.str = new StringBuilder();
        this.str.append(str.toCharArray());
    }

    public String getNChar(int size){
        if(str.length() < size){
            return null;
        }

        return this.str.substring(0, size);
    }

    public void removeNChar(int size){
        try{
            this.str.delete(0, size);
        }catch(Exception e){
        }
    }
}
