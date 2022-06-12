package exerciciolivraria;

import java.util.Collections;

public class Teste {

    public static void main(String[] args) {

        ProductManager pm = new ProductManager();

        Cashier cashier = new Cashier(1000);

        cashier.balance();

        Books b1 = new Books("Book", "Livro Um", 1, 123.91,
                Collections.singletonList("action"), "José", "rocco");
        pm.addProduct(b1);
        Books b2 = new Books("Book", "Livro Dois", 2, 223.30,
                Collections.singletonList("action"), "José", "rocco");
        pm.addProduct(b2);

        Movies m1 = new Movies("Movie", "Movie", 3, 33.45, "one",
                Collections.singletonList("José"), Collections.singletonList("Drama"), Collections.singletonList("Roberto"));
        pm.addProduct(m1);

        MusicAlbuns mb1 = new MusicAlbuns("Music","Music", 4, 42.50,
                "Band", Collections.singletonList("pop"), Collections.singletonList("blue"));
        pm.addProduct(mb1);

//        pm.viewProduct(b1);
//        pm.viewProduct(m1);
//        pm.viewProduct(mb1);

//        pm.updateProduct(3);
//        pm.viewProduct(mb1);

//        pm.deleteProduct(1);
//        System.out.println(pm.registredProducts);

//        pm.listProducts();

        Stock bookStock = new Stock(25, b1);
        Stock bookStock2 = new Stock(225, b2);
        Stock movieStock = new Stock(30, m1);
        Stock musicStock = new Stock(40, mb1);

        StockManager manager = new StockManager();

        manager.addRegistredProducts(bookStock);
        manager.addRegistredProducts(bookStock2);
        manager.addRegistredProducts(movieStock);
        manager.addRegistredProducts(musicStock);

//        manager.showStockedProducts();

        manager.showStockedProductsBySort("Book");

        Purchase purchase1 = new Purchase();

        purchase1.selectProduct(manager, 1, 1);
        purchase1.selectProduct(manager, 2, 1);
        purchase1.selectProduct(manager, 3, 1);
        purchase1.selectProduct(manager, 4, 1);

        manager.showStockedProductsBySort("Book");

        purchase1.showPurchaseTotal();

        cashier.purchaseIncome(purchase1);
        cashier.balance();

        Purchase purchase2 = new Purchase();
        purchase2.selectProduct(manager, 1, 20);
        purchase2.selectProduct(manager, 2, 1);
        purchase2.selectProduct(manager, 3, 1);
        purchase2.selectProduct(manager, 4, 1);

        purchase2.showPurchaseTotal();

        cashier.purchaseIncome(purchase2);

        manager.showStockedProductsBySort("Book");

        cashier.balance();



    }
}
