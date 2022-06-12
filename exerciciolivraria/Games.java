package exerciciolivraria;

public class Games extends Product {

    private String distributor;
    private String genre;
    private String studio;

    public Games(String sort, String name, int id, double price) {
        super(sort, name, id, price);
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return  "Sort: " + getSort() + " | " +
                " Name: " + getName() + " | " +
                " id: " + getId() + " | " +
                " Price: R$ " + getPrice() + " | " +
                " Distributor: " + getDistributor() + " | " +
                " Genre " + getGenre() + " | " +
                " Studio " + getStudio() + " | [END]";
    }
}
