package factorymethod2;

import factorymethod2.armor.Armor;
import factorymethod2.armor.LightArmor;
import strategy.Unit;
import strategy.weapon.Bow;
import strategy.weapon.Weapon;

public class ArcherCreator implements UnitCreator {

    @Override
    public Unit createUnit() {
        Unit archer = new Unit();
        archer.setPrimaryWeapon(createWeapon());
        archer.setArmor(createArmor());
        return archer;
    }

    private Weapon createWeapon() {
        return new Bow();
    }

    private Armor createArmor() {
        return new LightArmor();
    }
}
