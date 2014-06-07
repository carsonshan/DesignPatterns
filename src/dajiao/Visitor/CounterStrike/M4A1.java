package dajiao.Visitor.CounterStrike;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.CounterStrike
 */
public class M4A1 extends Weapon{
    @Override
    public void Attack(Terrorist terrorist) {
        terrorist.BeingAttack(80);
    }

    @Override
    public void Attack(CounterTerrorist counterTerrorist) {
        counterTerrorist.BeingAttack(70);
    }
}
