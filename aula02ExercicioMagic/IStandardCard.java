package aula02ExercicioMagic;

public interface IStandardCard {

    String getName();
    void setName(String name);
    CardsType getType();
    void setType(CardsType type);
    int getManaCost();
    void setManaCost(int manaCost);

}
