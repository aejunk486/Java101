import java.util.*;

public class DinamicArray5{
    public static void main(String arg[]){

        ArrayList<String> product = new ArrayList<>();
        ArrayList<Integer> position = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str;
     
        int count=0, st=0, x=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Input Product: ");
            str = sc.next();
            product.add(str);
        }
    
        for (int j = 0; j < 3; j++) {
            if (product.get(j).equalsIgnoreCase("coke")) {
                count = count+1;
            } else{
                    position.add(j);
            }
            System.out.println("Product List "+j+": "+ product.get(j));
    
        }
        System.out.println("Count "+count); 
        System.out.println("Postion "+position);
        while (count>=0 ) {
            x = position.get(st);
            System.out.println("product (x): "+product.get(x));
            product.remove(x);
            count--;
            System.out.println("Count in loop "+count); 
        }

        System.out.println(product);

    }
}