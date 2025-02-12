import java.util.*;

public class Character {
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies = new ArrayList<>();

    public Character(String type, AttackStrategy attackStrategy, DefenseStrategy... defenseStrategies) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies.addAll(Arrays.asList(defenseStrategies));
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}
