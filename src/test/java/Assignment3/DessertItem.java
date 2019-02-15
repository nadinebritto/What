package Assignment3;

public abstract class DessertItem {
    private double UnitPrice;
    private double amount;
    private double tax = 0.32;

    public double CalculateItemCost() {
        double  price = UnitPrice * amount;
        return price;
    }


   public abstract double findSalesTax();

}