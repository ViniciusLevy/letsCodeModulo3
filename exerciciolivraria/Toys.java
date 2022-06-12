package exerciciolivraria;

public class Toys extends Product {

    private String type;

    public Toys(String sort, String name, int id, double price, String type) {
        super(sort, name, id, price);
        this.type = type;
    }

    public String getSort() {
        return type;
    }

    public void setSort(String sort) {
        this.type = sort;
    }

    @Override
    public String toString() {
        return  "Sort: " + getSort() + " | " +
                " Name: " + getName() + " | " +
                " id: " + getId() + " | " +
                " Price: R$ " + getPrice() + " | " +
                " Type: " + getSort() + " | [END]";
    }
}
