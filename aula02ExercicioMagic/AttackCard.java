package aula02ExercicioMagic;

public class AttackCard extends StandardCard implements IAttackCard{

    private int attackPoints;
    private int defensePoints;

    public AttackCard(String name, CardsType type, int manaCost, int attackPoints, int defensePoints) {
        super(name,type, manaCost);
        setAttackPoints(attackPoints);
        setDefensePoints(defensePoints);
    }

    @Override
    public int getAttackPoints() {
        return attackPoints;
    }

    @Override
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    @Override
    public int getDefensePoints() {
        return defensePoints;
    }

    @Override
    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

}
