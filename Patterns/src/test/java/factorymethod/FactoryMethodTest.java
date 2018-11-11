package factorymethod;

import org.testng.annotations.Test;

@Test
public class FactoryMethodTest {


    public void testFactoryMethod(){
        Armory armory = new Armory();
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
