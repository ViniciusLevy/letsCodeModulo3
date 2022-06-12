package exerciciolivraria;

public interface IStock {

    void addRegistredProducts(Stock stock);
    void showStockedProducts();
    void showStockedProductsBySort(String sort);
    boolean stockedProductExists(String sort);


}
