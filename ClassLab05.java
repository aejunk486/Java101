import java.util.*;
//class1
class ClassLab05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int n = sc.nextInt();
        System.out.println("Number: " + n);

        //create object
        Calculate c = new Calculate();
        double d = c.add(n);
        System.out.println("result: "+d);
    }
}
//class2
class Calculate {
    double add(int n) {
        double z = 10.5;

        return z*n;
    }
}

