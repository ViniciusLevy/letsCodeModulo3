package aula02ExercicioMagic;

enum Type {ATTACK, SPECIAL_ATTACK}

public abstract class Card {

    protected String name;
    protected Type type;
    protected int cost;

    public abstract String getName();
    public abstract Type getType();
    public abstract int getCost();

    public Card() {}

}
