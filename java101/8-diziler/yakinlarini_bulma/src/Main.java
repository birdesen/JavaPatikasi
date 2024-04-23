import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int list[] = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi: " + Arrays.toString(list));

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int min = list[0];
        int max = list[0];

        for (int i : list) {

            if (i < min) {
                min = i;
            }
            if (i > n) {
                if (i > max) {
                    max = i;
                }
            }
        }

        int lessThanN = min;
        int moreThanN = max;

        for (int i : list) {

            if (i < n) {
                if (i > lessThanN)
                    lessThanN = i;
            }
            if (i > n) {
                if (i < moreThanN) {
                    moreThanN = i;
                }
            }
        }

        if (n < min) {
            System.out.println(n + " sayısından küçük sayı bulunmamaktadır!");
        } else {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + lessThanN);
        }
        if (n > max) {
            System.out.println(n + " sayısından büyük sayı bulunmamaktadır!");
        } else {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + moreThanN);
        }

    }
}