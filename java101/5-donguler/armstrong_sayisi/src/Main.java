import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int basS = 0;
        int nYeni = n;
        int sum = 0;

        while (nYeni != 0) {
            nYeni /= 10;
            basS++;
        }

        nYeni = n;
        for (int i = 1; i <= basS; i++) {
            int rakam = nYeni % 10;
            nYeni /= 10;
            int us = 1;
            for (int j = 1; j <= basS; j++) {
                us *= rakam;
            }
            sum += us;
        }

        if (n == sum) {
            System.out.println("Armstrong sayısıdır.");
        } else {
            System.out.println("Armstrong sayısı değildir.");
        }

    }
}
