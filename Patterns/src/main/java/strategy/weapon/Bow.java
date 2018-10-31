package strategy.weapon;

public class Bow implements Weapon {
    @Override
    public void heat() {
        System.out.println("Shooting an arrow!");
    }
}
