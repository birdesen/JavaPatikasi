import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0, sayi;
        do {
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi % 4 == 0) {
                sum += sayi;
            }
        } while (sayi % 2 == 0);

        System.out.println("Dördün katı olan sayıların toplamı: " + sum);

    }
}
