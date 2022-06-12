package exerciciolivraria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements IProductManager{

    protected List<Product> registredProducts = new ArrayList<>();

    @Override
    public boolean productExists(int id) {
        for (Product product : registredProducts) {
            if (product.getId() == id) {
               return true;
            }
        }
        return false;
    }

    @Override
    public void addProduct(Product product) {
        if (!productExists(product.getId())) {
            registredProducts.add(product);
        }
    }

    @Override
    public void viewProduct(Product product) {
        if (productExists(product.getId())) {
            System.out.println("|| PRODUCT INFORMATION ||: ");
            System.out.println(product);
            System.out.println();
        }
    }

    @Override
    public void updateProduct(int id) {

        for (Product product: registredProducts) {

            if (product.getId() == id) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the new Name: ");
                product.setName(scanner.nextLine());

                System.out.println("Enter the new Price: ");
                product.setPrice(scanner.nextDouble());
                scanner.nextLine();

                if (product instanceof Books) {

                    System.out.println("Enter the new Genres: ");
                    ((Books) product).setGenres(Collections.singletonList(scanner.nextLine()));

                    System.out.println("Enter the new Author: ");
                    ((Books) product).setAuthor(scanner.nextLine());

                    System.out.println("Enter the new Publisher: ");
                    ((Books) product).setPublisher(scanner.nextLine());

                } else if (product instanceof Movies) {

                    System.out.println("Enter the new Studio: ");
                    ((Movies) product).setStudio(scanner.nextLine());

                    System.out.println("Enter the new Directors: ");
                    ((Movies) product).setDirectors(Collections.singletonList(scanner.nextLine()));

                    System.out.println("Enter the new Genres: ");
                    ((Movies) product).setGenres(Collections.singletonList(scanner.nextLine()));

                    System.out.println("Enter the new Producers: ");
                    ((Movies) product).setProducers(Collections.singletonList(scanner.nextLine()));

                } else if (product instanceof MusicAlbuns) {

                    System.out.println("Enter the new Band: ");
                    ((MusicAlbuns) product).setBand(scanner.nextLine());

                    System.out.println("Enter the new Genres: ");
                    ((MusicAlbuns) product).setGenres(Collections.singletonList(scanner.nextLine()));

                    System.out.println("Enter the new Labels: ");
                    ((MusicAlbuns) product).setLabels(Collections.singletonList(scanner.nextLine()));

                } else if (product instanceof Games) {

                    System.out.println("Enter the new Distributor: ");
                    ((Games) product).setDistributor(scanner.nextLine());

                    System.out.println("Enter the new Genre: ");
                    ((Games) product).setGenre(scanner.nextLine());

                    System.out.println("Enter the new Studio: ");
                    ((Games) product).setStudio(scanner.nextLine());

                } else if (product instanceof Toys) {

                    System.out.println("Enter new Type: ");
                    ((Toys) product).setSort(scanner.nextLine());
                }

            } else {
                System.out.println("Product not found!");
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (Product product: registredProducts) {
            if (product.getId() == id) {
                registredProducts.remove(product.getId() - 1);
                System.out.println("Product Deleted");
                break;
            }
        }
    }

    @Override
    public void listProducts() {
        System.out.println("PRODUCTS REGISTRED: ");
        for (int i = 0; i < registredProducts.size(); i++) {
            System.out.println(registredProducts.get(i));
            System.out.println();
        }
    }

}
