import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz(N): ");
        int n = input.nextInt();
        System.out.print("Alt küme eleman sayısını giriniz(r): ");
        int r = input.nextInt();

        int nFak = 1, rFak = 1, nrFak = 1;

        for (int i = 1; i <= n; i++) {
            nFak *= i;
        }
        for (int i = 1; i <= r; i++) {
            rFak *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            nrFak *= i;
        }

        System.out.println("(" + n + "," + r + ")" + " = " + (nFak / (rFak * nrFak)));


    }
}
