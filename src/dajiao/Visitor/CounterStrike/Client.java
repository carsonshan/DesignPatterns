package dajiao.Visitor.CounterStrike;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.CounterStrike
 */
public class Client {
    static Weapon weapon;
    static Player player;
    static AttackPair attackPair;

    public static void main(String[] args){
        Queue<AttackPair> attackQueue = new LinkedBlockingQueue<AttackPair>();

        Player ter1 = new Terrorist("xiaoming");
        Weapon ter1Wp = new AK47();
        Player ter2 = new Terrorist("xiaoli");
        Weapon ter2Wp = new DesertEagle();
        Player cTer = new CounterTerrorist("xiaohong");
        Weapon cTerWp = new M4A1();
        Weapon cTerWp2 = new Grenade();

        // the war start...
        attackQueue.add(new AttackPair(ter1, cTerWp));
        attackQueue.add(new AttackPair(cTer, ter2Wp));
        attackQueue.add(new AttackPair(ter2, cTerWp));
        attackQueue.add(new AttackPair(ter2, ter1Wp));
        attackQueue.add(new AttackPair(ter1, cTerWp2));

        // we won't simulate the consumer
        // just take the exact number of the attackPair
        for(int i= 0; i<5;i++){
            attackPair = attackQueue.poll();
            attackPair.getPlayer().AttackBy(attackPair.getWeapon());
        }
        // game over! Couter-Terrorist Win!
    }
}
