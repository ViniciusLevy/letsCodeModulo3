package exerciciolivraria;

import java.util.ArrayList;
import java.util.List;

public class Purchase implements IPurchase {

    private double totalFinal;
    private double totalBookPurchase;
    private double generalPurchase;
    private Customer customer;

    @Override
    public void selectProduct(StockManager manager, int id, int quantity, Customer customer) {
        List<Stock> StockCopy = new ArrayList<>(manager.getStockedProducts());
        for (Stock stock: StockCopy) {
                if (stock.getProduct().getId() == id) {
                    if (stock.getProduct() instanceof Books){
                        totalBookPurchase += stock.getProduct().getPrice() * quantity;
                        stock.setQuantity(stock.getQuantity() - quantity);
                        if (totalBookPurchase >= 200) {
                            totalBookPurchase = totalBookPurchase * 85/100;
                            System.out.println("15% off with $200 on book purchases");
                        }
                    } else if (stock.getProduct() instanceof AdultProduct && !customer.customerIsAdult()) {
                        System.out.println(stock.getProduct().getName() + " - WARNING - CUSTOMER UNDER AGE, YOU MUST BE OVER 18 - PURCHASE BLOCKED");
                        continue;
                    } else {
                        generalPurchase += stock.getProduct().getPrice() * quantity;
                        stock.setQuantity(stock.getQuantity() - quantity);
                    }
                }
            }
    }

    @Override
    public void showPurchaseTotal() {
        System.out.println("GENERAL PURCHASE: " + generalPurchase);
        System.out.println("BOOKS PURCHASE: " + totalBookPurchase);
        totalFinal = generalPurchase + totalBookPurchase;
        System.out.println("TOTAL FINAL: " + totalFinal);
        System.out.println();
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public double getTotalBookPurchase() {
        return totalBookPurchase;
    }

    public double getGeneralPurchase() {
        return generalPurchase;
    }
}
