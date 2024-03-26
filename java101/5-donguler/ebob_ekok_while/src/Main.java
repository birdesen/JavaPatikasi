import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        System.out.print("1. sayı giriniz: ");
        int n1 = inputt.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int n2 = inputt.nextInt();
        int b = 1;
        int ebob = 1;
        while (b <= n1) {
            if (n1 % b == 0 & n2 % b == 0) {
                ebob = b;
            }
            b++;
        }
        System.out.println("Ebob = " + ebob);
        int ekok = (n1 * n2) / ebob;
        System.out.println("Ekok = " + ekok);


    }
}
