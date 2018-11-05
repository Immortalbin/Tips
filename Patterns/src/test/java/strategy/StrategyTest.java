package strategy;

import org.testng.annotations.Test;
import strategy.weapon.Bow;
import strategy.weapon.Knife;
import strategy.weapon.Spear;

@Test
public class StrategyTest {

    public void testStrategy(){
        Unit bowman = new Unit();
        bowman.setPrimaryWeapon(new Bow());
        bowman.setSecondaryWeapon(new Knife());
        Unit spearman = new Unit();
        spearman.setPrimaryWeapon(new Spear());
        bowman.heatWithPrimaryWeapon();
        bowman.heatWithSecondaryWeapon();
        spearman.heatWithPrimaryWeapon();
        spearman.heatWithSecondaryWeapon();
    }

}
