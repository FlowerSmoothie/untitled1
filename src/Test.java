import AbstractClass.*;
import Class.*;
import Interfaces.*;


public class Main {

    private static void helloMsg(){
        System.out.println("The best lab")
    }

    public static void main(String[] args) {
        helloMsg();

        Weapon obj1 = new FlyingKnife();
        System.out.println(obj1.giveDamageToEnemy(10, 15));

        MagicWeapon obj2 = new MagicBook();
        System.out.println(obj2.giveMagicDamage(90, 80));
        System.out.println(obj2.giveDamageToEnemy(13, 12));

        MagicBook obj3 = new MagicBook();
        System.out.println(obj3.giveDamageToEnemy(10, 19));
        System.out.println(obj3.giveMagicDamage(10, 19));

        MagicWand obj4 = new RainbowRod();
        System.out.println(obj4.giveDamageToEnemy(10, 19));

        MagicWand obj5 = new VenomStaff();
        System.out.println(obj5.giveDamageToEnemy(10, 19));

    }


}