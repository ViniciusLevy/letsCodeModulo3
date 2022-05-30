package aula02ExercicioMagic;

public class StandardCard implements IStandardCard{

    protected String name;
    protected CardsType type;
    protected int manaCost;

    public StandardCard(String name, CardsType type, int manaCost) {
        setName(name);
        setType(type);
        setManaCost(manaCost);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public CardsType getType() {
        return type;
    }

    @Override
    public void setType(CardsType type) {
        this.type = type;
    }

    @Override
    public int getManaCost() {
        return manaCost;
    }

    @Override
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

}
