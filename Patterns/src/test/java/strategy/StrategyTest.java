package strategy;

import org.testng.annotations.Test;
import strategy.weapon.Bow;
import strategy.weapon.Knife;
import strategy.weapon.Spear;
import strategy.weapon.Sword;

@Test
public class StrategyTest {

    public void testStrategy(){
        Unit bowman = new Unit(new Bow(), new Knife());
        Unit spearman = new Unit(new Spear(), new Sword());
        bowman.heatWithPrimaryWeapon();
        bowman.heatWithSecondaryWeapon();
        spearman.heatWithPrimaryWeapon();
        spearman.heatWithSecondaryWeapon();
    }

}
