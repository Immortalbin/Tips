package factorymethod2.armor;

public class MediumArmor extends Armor{

    public MediumArmor() {
        this.setArmorType(ArmorType.MAIL);
        this.setArmorValue(5);
    }
}
