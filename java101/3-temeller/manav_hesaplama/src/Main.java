import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

        System.out.println("Meyveler ve kg fiyatları;" +
                "\nArmut: " + armut +
                "\nElma: " + elma +
                "\nDomates: " + domates +
                "\nMuz: " + muz +
                "\nPatlıcan: " + patlican);
        System.out.print("Kaç kg armut? ");
        int a = input.nextInt();
        System.out.print("Kaç kg elma? ");
        int e = input.nextInt();
        System.out.print("Kaç kg domates? ");
        int d = input.nextInt();
        System.out.print("Kaç kg muz? ");
        int m = input.nextInt();
        System.out.print("Kaç kg patlıcan? ");
        int p = input.nextInt();

        double toplam = (armut * a) + (elma * e) + (domates * d) + (muz * m) + (patlican * p);
        System.out.println("Toplam tutar: " + toplam);

    }
}
