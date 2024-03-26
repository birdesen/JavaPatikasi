import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enb = 0, enk = 0;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayı: ");
            int a = input.nextInt();

            if (i == 1) {
                enb = a;
                enk = a;
            } else {
                if (a > enb) {
                    enb = a;
                }
                if (a < enk) {
                    enk = a;
                }
            }
        }
        System.out.println("En büyük = " + enb);
        System.out.println("En küçük = " + enk);

    }
}
