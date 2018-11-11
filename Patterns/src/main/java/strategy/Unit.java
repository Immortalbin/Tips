package strategy;

import factorymethod2.armor.Armor;
import lombok.Getter;
import lombok.Setter;
import strategy.weapon.Weapon;

import static java.util.Objects.nonNull;

public class Unit {
    @Getter
    @Setter
    private Weapon primaryWeapon;

    @Getter
    @Setter
    private Weapon secondaryWeapon;

    @Getter
    @Setter
    private Armor armor;

    void heatWithPrimaryWeapon(){
        if(nonNull(primaryWeapon)){
            primaryWeapon.heat();
        } else{
            System.out.println("There is no primary weapon.");
        }
    }

    void heatWithSecondaryWeapon(){
        if(nonNull(secondaryWeapon)){
            secondaryWeapon.heat();
        } else{
            System.out.println("There is no secondary weapon.");
        }
    }
}
