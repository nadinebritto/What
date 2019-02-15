package Assignment3;
import java.util.ArrayList;


public class Checkout {

    private double tax = 0.26;

    ArrayList<DessertItem> Items = new ArrayList<DessertItem>();

    public static void main (String[] args){

    }


    public void add(DessertItem newItem) {

        Items.add(newItem);
    }

    public int numberofItems(){

        return Items.size();
    }

    public double totalCost(){
        double receipt = 0.0;
        for(int z = 0; z < Items.size(); z++){
            receipt += Items.get(z).CalculateItemCost();
        }
        return receipt;

    }

    public double totalTax(){
        double Tax = 0.0;
        for(int k = 0; k < Items.size(); k++){
            Tax += Items.get(k).findSalesTax();
        }
        return Tax;
    }

}
