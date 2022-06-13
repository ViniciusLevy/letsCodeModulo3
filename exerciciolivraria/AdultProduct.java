package exerciciolivraria;

public class AdultProduct extends Product{

    final String RATING = "Adult Content";


    protected AdultProduct(String sort, String name, int id, double price) {
        super(sort, name, id, price);
    }

    public String getRATING() {
        return RATING;
    }

    @Override
    public String toString() {
        return  " Sort: " + getSort() + " | " +
                " Name: " + getName() + " | " +
                " id: " + getId() + " | " +
                " Price: R$ " + getPrice() + " | " +
                " Rating: " + getRATING() + " | [END]";
    }
}
