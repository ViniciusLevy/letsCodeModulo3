package aula02ExercicioMagic;

public class SpecialAttackCard extends AttackCard implements ISpecialAttackCard {

    private Effects effect;

    public SpecialAttackCard(
            String name,
            CardsType type,
            int manaCost,
            int attackPoints,
            int defensePoints,
            Effects effect) {
        super(name, type, manaCost, attackPoints, defensePoints);
        setEffect(effect);
    }

    @Override
    public Effects getEffect() {
        return effect;
    }

    @Override
    public void setEffect(Effects effect) {
        this.effect = effect;
    }
}
