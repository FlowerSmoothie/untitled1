package Class;

import AbstractClass.MagicWand;

public class VenomStaff extends MagicWand {
    @Override
    public int giveDamageToEnemy(int damage, int enemyDefence) {
        return damage + enemyDefence;
    }

    @Override
    public int giveMagicDamage(int damage, int enemyDefence) {
        return damage - enemyDefence;
    }

    @Override
    protected int damageGiven(int damage, int seconds) {
        return damage * seconds;
    }
}
