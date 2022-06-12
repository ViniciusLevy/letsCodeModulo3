package exerciciolivraria;

import java.util.ArrayList;
import java.util.List;

public class Books extends Product {

    private List<String> genres;
    private String author;
    private String publisher;


    Books(String sort, String name, int id, double price, List<String> genres, String author, String publisher) {
        super(sort, name, id, price);
        this.genres = genres;
        this.author = author;
        this.publisher = publisher;
    }

    public List<String> getGenres() {
        return new ArrayList<String>(genres);
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return  "Sort: " + getSort() + " | " +
                " Name: " + getName() + " | " +
                " id: " + getId() + " | " +
                " Price: R$ " + getPrice() + " | " +
                " Genres: " + getGenres() + " | " +
                " Author: " + getAuthor() + " | " +
                " Publisher: " + getPublisher() + " | [END]";
    }
}
