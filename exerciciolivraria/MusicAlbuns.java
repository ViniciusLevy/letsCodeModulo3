package exerciciolivraria;

import java.util.List;

public class MusicAlbuns extends Product {

    private String band;
    private List<String> genres;
    private List<String> labels;

    public MusicAlbuns(String sort, String name, int id, double price, String band, List<String> genres, List<String> labels) {
        super(sort, name, id, price);
        this.band = band;
        this.genres = genres;
        this.labels = labels;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return  "Sort: " + getSort() + " | " +
                " Name: " + getName() + " | " +
                " id: " + getId() + " | " +
                " Price: R$ " + getPrice() + " | " +
                " Band: " + getBand() + " | " +
                " Genres: " + getGenres() + " | " +
                " Labels: " + getLabels() + " | [END]";

    }
}
