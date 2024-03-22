import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int bas = 0, sum = 0, newN = n;

        while (newN != 0) {
            bas = newN % 10;
            newN /= 10;
            sum += bas;
        }
        System.out.println(n + " sayısını basamak sayılarının toplamı " + sum + "'dır");
    }
}
