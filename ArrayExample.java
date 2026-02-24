public class ArrayExample {
    public static void main(String[] args) {
        
        int[] scores = {85, 92, 78, 64, 90};

        System.out.println("score of std 1: " + scores[0]); // 85

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double average = (double) sum / scores.length;

        System.out.println("Total score: " + sum);
        System.out.println("average: " + average);
    }
}