package dajiao.Visitor.CounterStrike;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.CounterStrike
 */
public class AttackPair {
    private Player player;
    private Weapon weapon;

    public AttackPair(Player player, Weapon weapon){
        this.player = player;
        this.weapon = weapon;
    }

    public Player getPlayer() {
        return player;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
