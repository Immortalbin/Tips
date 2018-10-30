package strategy;

class Unit {
    FightingStrategy strategy;

    Unit(FightingStrategy strategy){
        this.strategy = strategy;
    }

    void fight(){
        strategy.heat();
    }
}
