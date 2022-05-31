package aula02ExercicioMagic;

public class AttackCard extends Card{

    protected int power;
    protected int resistance;

    public int getPower() {
        return power;
    }

    public int getResistance() {
        return resistance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public AttackCard(String name, Type type, int cost, int power, int resistance) {
        super();
        this.power = power;
        this.resistance = resistance;
    }
}
