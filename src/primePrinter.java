import java.util.Scanner;

public class primePrinter {

    public static void printPrime(int n) {
        int factor = 0;
        int length = n;
        if(length==1){
            System.out.println(2);
        }
        else {
            for (int i = 2; i < length * length; i++) {
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        factor++;
                    }
                }
                if (factor < 2) {
                    n--;
                }
                if (n <= 0) {
                    System.out.print(i + " ");
                    return;
                }
                factor = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int n = scanner.nextInt();
        printPrime(n);
        scanner.close();
    }
}