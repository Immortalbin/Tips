package factorymethod;

import strategy.weapon.Axe;
import strategy.weapon.Weapon;

public class AxeForge extends WeaponForge {
    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
