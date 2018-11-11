package factorymethod2;

import factorymethod2.armor.ArmorType;
import org.testng.annotations.Test;
import strategy.Unit;
import strategy.weapon.Bow;
import strategy.weapon.Sword;

import static org.testng.Assert.*;

@Test
public class AbstractFactoryTest {

    private UnitCreator unitFactory;

    public  void testSwordsmanFactoryCreatesSwordsmanWithSwordAndMailArmor(){
        unitFactory = new SwordsmanCreator();
        Unit swordsman  = unitFactory.createUnit();
        assertEquals(swordsman.getArmor().getArmorType(), ArmorType.MAIL);
        assertSame(swordsman.getPrimaryWeapon().getClass(), Sword.class);
    }

    public  void testArcherFactoryCreatesArchersWithBowAndLightArmor(){
        unitFactory = new ArcherCreator();
        Unit archer  = unitFactory.createUnit();
        assertEquals(archer.getArmor().getArmorType(), ArmorType.LEATHER);
        assertSame(archer.getPrimaryWeapon().getClass(), Bow.class);
    }

}
