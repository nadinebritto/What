package Assignment3;

public class Sundae extends IceCream {
    private String dessertName;
    private String topping;
    private double price;
    private double toppingPrice;
    private double tax = 0.26;

    public Sundae(String typeOfDessert, double Unitprice, String toppingItem, double ToppingPrice) {
        super(typeOfDessert, Unitprice);
        dessertName = typeOfDessert;
        price = Unitprice;
        topping = toppingItem;
        toppingPrice = ToppingPrice;
    }

    public double CalculateItemCost() {
        return price + toppingPrice;
    }

    public double findSalesTax() {
        return CalculateItemCost() * tax;
    }
}


//not certain about declaring toppings;