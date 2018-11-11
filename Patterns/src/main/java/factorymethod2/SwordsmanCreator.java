package factorymethod2;

import factorymethod2.armor.Armor;
import factorymethod2.armor.MediumArmor;
import strategy.Unit;
import strategy.weapon.Sword;
import strategy.weapon.Weapon;

public class SwordsmanCreator implements UnitCreator {

    @Override
    public Unit createUnit() {
        Unit swordsman = new Unit();
        swordsman.setArmor(createArmor());
        swordsman.setPrimaryWeapon(createWeapon());
        return swordsman;
    }

    private Weapon createWeapon() {
        return new Sword();
    }

    private Armor createArmor() {
        return new MediumArmor();
    }
}
