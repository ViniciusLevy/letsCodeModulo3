package exerciciolivraria;

public interface IPurchase {

    void selectProduct(StockManager stockManager, int id, int quantity, Customer customer);
    void showPurchaseTotal();

}
