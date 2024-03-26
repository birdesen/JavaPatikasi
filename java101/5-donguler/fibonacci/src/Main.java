import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int f1 = 0, f2 = 1, f3;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(f1 + " ");
            } else if (i == 2) {
                System.out.print(f2 + " ");
            } else {
                f3 = f1 + f2;
                System.out.print(f3 + " ");
                f1 = f2;
                f2 = f3;
            }
            System.out.print(" ");
        }

    }
}
