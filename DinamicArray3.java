import java.util.*;
public class DinamicArray3 {
    public static void main(String[] args) {
        //ArrayList
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println("ArrayList: "+arrayList);
        System.out.println("+ "+(arrayList.get(0)+arrayList.get(1)));

        Vector <Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        System.out.println("Vector: "+v);
        System.out.println("+ "+(v.get(0)+v.get(1)));
      
    }
}

