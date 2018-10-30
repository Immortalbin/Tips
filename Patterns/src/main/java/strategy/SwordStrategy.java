package strategy;

public class SwordStrategy implements FightingStrategy {
    @Override
    public void heat() {
        System.out.println("Attack with sword!");
    }
}
