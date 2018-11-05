package factorymethod;

import strategy.weapon.Weapon;

/** Общий интерфей для производителя оружия */
public abstract class WeaponForge {

    abstract Weapon createWeapon();




}
