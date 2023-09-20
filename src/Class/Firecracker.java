package Class;

import AbstractClass.Whip;
import Interfaces.ThrowingWeapon;

public class Firecracker extends Whip implements ThrowingWeapon {
    @Override
    public void attackWithWhip(String whipType) {
        System.out.println("void f11" + whipType);
    }

    @Override
    public int giveDamageToEnemy(int damage, int enemyDefence) {
        return damage -  2 * enemyDefence;
    }

    @Override
    public void throwItem(String itemType) {
        System.out.println("void f10" + itemType);
    }

    @Override
    public String fromWhichSideEnemyWasDamaged(String playerDirection) {
        return playerDirection + " " + playerDirection + " " + playerDirection;
    }

    @Override
    public void shoot(String bulletType) {
        System.out.println("void f4" + bulletType);
    }

    @Override
    public int summonDamageGivenToEnemy(int damage, int enemyDefence) {
        return damage - enemyDefence;
    }
}
