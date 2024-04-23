import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int n = input.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        double h = n / sum;

        System.out.println(n + " elemanlı dizinin harmonik ortalaması: " + h);

    }
}
