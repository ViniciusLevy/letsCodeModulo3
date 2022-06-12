package exerciciolivraria;

public interface IProductManager {

    void addProduct(Product product);
    boolean productExists(int id);
    void viewProduct(Product product);
    void updateProduct(int id);
    void deleteProduct(int id);
    void listProducts();

}
