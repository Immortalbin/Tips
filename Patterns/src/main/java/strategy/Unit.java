package strategy;

import lombok.AllArgsConstructor;
import strategy.weapon.Weapon;

@AllArgsConstructor
class Unit {
    private Weapon primaryWeapon;
    private Weapon secondaryWeapon;

    void heatWithPrimaryWeapon(){
        primaryWeapon.heat();
    }

    void heatWithSecondaryWeapon(){
        secondaryWeapon.heat();
    }
}
