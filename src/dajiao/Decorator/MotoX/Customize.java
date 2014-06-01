package dajiao.Decorator.MotoX;

/**
 * Author       : mooncake
 * Created on   : 14-6-1
 * Package Name : dajiao.Decorator.MotoX
 */
public abstract class Customize extends MotoXMobile{
    public MotoXMobile mobile;

    @Override
    public abstract void Describe();

    @Override
    public abstract int Cost();

}
