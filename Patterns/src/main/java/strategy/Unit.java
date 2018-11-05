package strategy;

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

    void heatWithPrimaryWeapon(){
        primaryWeapon.heat();
    }

    void heatWithSecondaryWeapon(){
        if(nonNull(secondaryWeapon)){
            secondaryWeapon.heat();
        } else{
            System.out.println("There is no secondary weapon.");
        }
    }
}
