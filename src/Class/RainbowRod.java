package Class;

import AbstractClass.MagicWand;

public class RainbowRod extends MagicWand {

    public RainbowRod() {
    }
    @Override
    public int giveDamageToEnemy(int damage, int enemyDefence)
    {
        return damage - enemyDefence;
    }
    @Override
    public int giveMagicDamage(int damage, int enemyDefence)
    {
        return damage * enemyDefence - damage;
    }

    @Override
    protected int damageGiven(int damage, int seconds)
    {
        return damage + damage * seconds + seconds;
    }
}
