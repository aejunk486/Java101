import java.util.ArrayList;
import java.util.Vector;

public class Homework01{

    public static void main(String[] args) {

        ArrayList<String> productName = new ArrayList<>();
        Vector<Double> price = new Vector<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        double sum =0;
       
        productName.add("Laptop");
        price.add(25000.0);
        quantity.add(1);

        productName.add("Mouse");
        price.add(500.0);
        quantity.add(2);

        productName.add("Keyboard");
        price.add(1500.0);
        quantity.add(1);

        productName.add("USB Cable");
        price.add(200.0);
        quantity.add(0);   
        System.out.println("product: "+productName);
        System.out.println("price: "+price);
        System.out.println("quantity: "+quantity);

        
    }
}