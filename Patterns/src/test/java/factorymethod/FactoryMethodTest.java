package factorymethod;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test
public class FactoryMethodTest {

    Armory armory = new Armory();

    public void testFactoryMethod(){
        WeaponForge axeForge = new AxeForge();
        WeaponForge swordForge = new SwordForge();
        armory.createNewWeapon(axeForge);
        armory.createNewWeapon(axeForge);
        armory.createNewWeapon(axeForge);
        armory.createNewWeapon(axeForge);
        armory.createNewWeapon(swordForge);
        armory.getListOfWeapons();
    }

}
