import java.util.*;
//class1
class ClassLab04 {
    public static void main(String[] args) {
        //create object
        Calculate c = new Calculate();
        c.add();
    }
}
//class2
class Calculate {
    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int n = sc.nextInt();
        System.out.println("Number: " + n);
    }
}

