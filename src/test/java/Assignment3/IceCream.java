package Assignment3;

public class IceCream extends DessertItem {
    private String dessertName;
    private double price;
    private double tax = 0.26;

    public IceCream(String typeOfDessert, double unitprice){
        dessertName = typeOfDessert;
        price = unitprice;
    }

    public double  CalculateItemCost() {
        return price;
    }

    public double findSalesTax() {
        return CalculateItemCost() * tax;
    }

}
