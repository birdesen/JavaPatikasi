import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sınır sayısı seçiniz: ");
        int n = input.nextInt();
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            double har = 1 / i;
            sum += har;
            System.out.println(har + ", ");
        }
        System.out.println("Toplam = " + sum);
    }
}
