package Interfaces;

public interface ThrowingWeapon extends MeeleeWeapon, RangedWeapon, SummonerWeapon {
    public void throwItem(String itemType);
}
