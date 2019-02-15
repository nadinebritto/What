package Assignment3;

public class Candy extends DessertItem {
    private String dessertName;
    private double Price;
    private double quantity;
    private double tax = 0.26;

    public Candy(String typeofDessert, double UnitPrice, double amount){
       dessertName = typeofDessert;
       Price = UnitPrice;
       quantity = amount;
    }

    public double  CalculateItemCost() {
        return (Price * quantity);
    }

    @Override
    public double findSalesTax() {
        return CalculateItemCost() * tax;
    }
}




