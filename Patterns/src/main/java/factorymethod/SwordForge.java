package factorymethod;

import strategy.weapon.Sword;
import strategy.weapon.Weapon;

public class SwordForge extends WeaponForge{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
