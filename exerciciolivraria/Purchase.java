package exerciciolivraria;

public class Purchase implements IPurchase {

    private double total;

    @Override
    public void selectProduct(StockManager manager, int id, int quantity) {
        for (Stock stock: manager.getStockedProducts()) {
            if (stock.getProduct().getId() == id) {
                total += stock.getProduct().getPrice() * quantity;
                stock.setQuantity(stock.getQuantity() - quantity);
            }
        }
    }

    @Override
    public void showPurchaseTotal() {
        System.out.println("TOTAL PURCHASE: " + total);
        System.out.println();
    }


    public double getTotal() {
        return total;
    }

    public void setTotalPerProduct(double totalPerProduct) {
        this.total = totalPerProduct;
    }
}
