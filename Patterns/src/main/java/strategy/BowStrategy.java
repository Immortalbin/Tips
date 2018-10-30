package strategy;

public class BowStrategy implements FightingStrategy {
    @Override
    public void heat() {
        System.out.println("Shooting an arrow!");
    }
}
