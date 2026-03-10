import java.util.*;

class ClassLab03 {
    static int add(int n) {
        int m = 5;
        int sum = 5 * n;
        System.out.println("sum: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert number: ");
        int n = sc.nextInt();
        System.out.println("Number: " + n);
        int re = add(n);
        System.out.println("Double: " + (re * re));
    }
}
