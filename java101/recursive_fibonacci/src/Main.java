import java.util.Scanner;

public class Main {
    static int fibonacci(int n) {

        if (n == 1) {
            return 0;

        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için bir eleman sayısı giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
