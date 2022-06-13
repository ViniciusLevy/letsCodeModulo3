package exerciciolivraria;

public class Cashier implements ICashier{

    private double cash;
    private Purchase purchase;

    public Cashier(double cash) {
        setCash(cash);
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }


    @Override
    public void balance() {
        System.out.println("BALANCE: R$ " + getCash());
        System.out.println();
    }

    @Override
    public void purchaseIncome(Purchase purchase) {
        cash += purchase.getTotalFinal();
        System.out.println("Purchase Income added to balance: R$ " + purchase.getTotalFinal());
        System.out.println();
    }
}
