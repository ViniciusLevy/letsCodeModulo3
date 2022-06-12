package exerciciolivraria;

import java.util.List;

public interface IPurchase {

    void selectProduct(StockManager stockManager, int id, int quantity);
    public void showPurchaseTotal();

}
