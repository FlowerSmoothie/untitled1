package Class;

import Interfaces.MagicWeapon;

public class MagicBook implements MagicWeapon {

    public int giveDamageToEnemy(int damage, int enemyDefence)
    {
        return (damage * enemyDefence) + enemyDefence;
    }

    public int giveMagicDamage(int damage, int enemyDefence)
    {
        return damage + damage - enemyDefence;
    }

}
