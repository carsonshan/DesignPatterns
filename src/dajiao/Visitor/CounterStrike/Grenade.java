package dajiao.Visitor.CounterStrike;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.CounterStrike
 */
public class Grenade extends Weapon{
    @Override
    public void Attack(Terrorist terrorist) {
        terrorist.BeingAttack(40);
    }

    @Override
    public void Attack(CounterTerrorist counterTerrorist) {
        counterTerrorist.BeingAttack(40);
    }
}
