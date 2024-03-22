import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int k = input.nextInt();
        int count = 0, sum = 0;

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                count++;
                sum += i;
                System.out.println(sum);
            }
        }
        double average = sum / count;
        System.out.println("Ortalama: " + average);


    }
}
