import java.util.Scanner;

public class Main {
    static boolean isPrime(int n, int i) {
        if (n < 2)
            return false;
        if (i == 1)
            return true;
        else {
            if (n % i == 0)
                return false;
            else
                return isPrime(n, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scan.nextInt();
        if (isPrime(n, n - 1) == false)
            System.out.print(n + " asal değildir");
        else
            System.out.print(n + " asaldır");
    }
}