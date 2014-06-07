package dajiao.Visitor.CounterStrike;

/**
 * Author       : mooncake
 * Created on   : 14-6-8
 * Package Name : dajiao.Visitor.CounterStrike
 */
public class CounterTerrorist extends Player{
    public CounterTerrorist(String name){
        this.blood = 100;
        this.name = name;
    }

    @Override
    public void AttackBy(Weapon weapon) {
        weapon.Attack(this);
    }

    public void BeingAttack(int bloodLessen){
        if(bloodLessen >= this.blood){
            this.blood = 0;
            System.out.println("the CounterTerrorist " + this.name + " is Dead!");
        }else{
            this.blood -= bloodLessen;
            System.out.println("the CounterTerrorist " + this.name + " cutting " +
                    String.valueOf(bloodLessen) + " blood!");
        }
    }
}
