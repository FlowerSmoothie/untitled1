package AbstractClass;

import Interfaces.MagicWeapon;

public abstract class MagicWand implements MagicWeapon {

    protected abstract int damageGiven(int damage, int seconds);
}
