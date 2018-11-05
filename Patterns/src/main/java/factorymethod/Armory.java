package factorymethod;

import lombok.Getter;
import strategy.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Armory {

    @Getter
    private List<Weapon> weapons = new ArrayList<>();

    void createNewWeapon(WeaponForge weaponForge){
        weapons.add(weaponForge.createWeapon());
    }

    void getListOfWeapons(){
        weapons.forEach(System.out::println);
    }
}
