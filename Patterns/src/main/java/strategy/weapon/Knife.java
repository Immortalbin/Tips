package strategy.weapon;

public class Knife implements Weapon {
    @Override
    public void heat() {
        System.out.println("Attack with knife");
    }
}
