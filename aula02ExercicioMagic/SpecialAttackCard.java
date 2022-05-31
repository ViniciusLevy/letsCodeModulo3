package aula02ExercicioMagic;

enum Effects {STUN, BLEED, POISON}

public class SpecialAttackCard extends AttackCard{

    protected Effects effect;

    public Effects getEffect() {
        return effect;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Type getType() {
        return super.getType();
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public int getPower() {
        return super.getPower();
    }

    @Override
    public int getResistance() {
        return super.getResistance();
    }

    public SpecialAttackCard(String name, Type type, int cost, int power, int resistance, Effects effect) {
        super(name, type, cost, power, resistance);
        this.effect = effect;
    }
}
