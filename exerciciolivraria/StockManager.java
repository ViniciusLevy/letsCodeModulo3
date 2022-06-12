package exerciciolivraria;

import java.util.ArrayList;
import java.util.List;

public class StockManager implements IStock{

    private List<Stock> stockedProducts = new ArrayList<>();


    public List<Stock> getStockedProducts() {
        return stockedProducts;
    }

    public void setStockedProducts(List<Stock> stockedProducts) {
        this.stockedProducts = stockedProducts;
    }

    @Override
    public void addRegistredProducts(Stock stock) {
        stockedProducts.add(stock);
    }

    public void deleteRegistredProducts(Stock stock) {

    }

    @Override
    public void showStockedProducts() {
        System.out.println("PRODUCTS IN STOCK");
        for (int i = 0; i < stockedProducts.size(); i++) {
            System.out.println(stockedProducts.get(i));
            System.out.println();
        }
    }

    @Override
    public boolean stockedProductExists(String sort) {
        for (Stock stockedProduct : stockedProducts) {
            if (stockedProduct.getProduct().getSort().equalsIgnoreCase(sort)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void showStockedProductsBySort(String sort) {

        if (stockedProductExists(sort)) {
            System.out.println("PRODUCTS IN STOCK BY SORT: ");
            for (Stock stockedProduct : stockedProducts) {
               if (stockedProduct.getProduct().getSort().equalsIgnoreCase(sort)) {
                   System.out.println(stockedProduct);
               }
            }
        } else {
            System.out.println("PRODUCT NOT FOUND");
        }

    }




}
