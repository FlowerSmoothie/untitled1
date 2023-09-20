package Class;


import AbstractClass.Knife;
import Interfaces.ThrowingWeapon;
import Interfaces.EnchantedItem;

public class FlyingKnife extends Knife implements EnchantedItem, ThrowingWeapon {

    @Override
    public void attackWithKnife(boolean isItPossibleToHoldLeftMouseButton) {
        System.out.println("method 9 " + isItPossibleToHoldLeftMouseButton);
    }

    @Override
    public int giveDamageToEnemy(int damage, int enemyDefence) {
        return damage - enemyDefence;
    }

    @Override
    public int giveMagicDamage(int damage, int enemyDefence) {
        return damage - enemyDefence;
    }

    @Override
    public String fromWhichSideEnemyWasDamaged(String playerDirection) {
        return playerDirection + " " + playerDirection;
    }

    @Override
    public void shoot(String bulletType) {
        System.out.println(bulletType + " " + bulletType);
    }

    @Override
    public int summonDamageGivenToEnemy(int damage, int enemyDefence) {
        return damage - enemyDefence;
    }

    @Override
    public void shine() {
        System.out.println("void f8");
    }

    @Override
    public void throwItem(String itemType) {
        System.out.println(itemType + " " + itemType);
    }
}
