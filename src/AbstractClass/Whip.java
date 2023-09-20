package AbstractClass;

import Interfaces.RangedWeapon;
import Interfaces.SummonerWeapon;

public abstract class Whip implements RangedWeapon, SummonerWeapon {

    public abstract void attackWithWhip(String whipType);
}
