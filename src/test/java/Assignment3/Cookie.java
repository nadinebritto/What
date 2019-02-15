package Assignment3;

public class Cookie extends DessertItem {
    private String dessertName;
    private double Price;
    private double quantity;
    private double tax = 0.26;

    public Cookie(String typeofDessert, double UnitPrice, double amount){
        dessertName = typeofDessert;
        Price = UnitPrice;
        quantity = amount;
    }

    @Override
    public double  CalculateItemCost() {

        return ((Price/12) * quantity);
    }

    @Override
    public double findSalesTax() {
        return CalculateItemCost() * tax;
    }
}

