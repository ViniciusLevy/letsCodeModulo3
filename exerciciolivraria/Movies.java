package exerciciolivraria;

import java.util.List;

public class Movies extends Product {

    private String studio;
    private List<String> directors;
    private List<String> genres;
    private List<String> producers;

    public Movies(String sort, String name, int id, double price, String studio, List<String> directors, List<String> genres, List<String> producers) {
        super(sort, name, id, price);
        this.studio = studio;
        this.directors = directors;
        this.genres = genres;
        this.producers = producers;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getProducers() {
        return producers;
    }

    public void setProducers(List<String> producers) {
        this.producers = producers;
    }

    @Override
    public String toString() {
        return  "Sort: " + getSort() + " | " +
                " Name: " + getName() + " | " +
                " id: " + getId() + " | " +
                " Price: R$ " + getPrice() + " | " +
                " Studio: " + getStudio() + " | " +
                " Directors: " + getDirectors() + " | " +
                " Genres: " + getGenres() + " | " +
                " Producers: " + getProducers() + " | [END]";
    }
}
