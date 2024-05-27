import java.util.*;
public class GenerateBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the desired number");
        int n = sc.nextInt();
        generateBinaryNumbers(n);
    }

    public static void generateBinaryNumbers(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        while (queue.size() <= n) {
            String binaryNumber = queue.poll();
            System.out.println(binaryNumber);

            String childBinaryNumber0 = binaryNumber + "0";
            queue.add(childBinaryNumber0);

            String childBinaryNumber1 = binaryNumber + "1";
            queue.add(childBinaryNumber1);
        }
    }
}
