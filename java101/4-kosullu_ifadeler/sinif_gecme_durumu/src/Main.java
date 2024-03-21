import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fzk, turk, kim, muz, ders = 0, toplam = 0;
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            ders++;
            toplam += mat;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fzk = input.nextInt();
        if (fzk >= 0 && fzk <= 100) {
            ders++;
            toplam += fzk;
        }
        System.out.print("Türkçe notunuzu giriniz: ");
        turk = input.nextInt();
        if (turk >= 0 && turk <= 100) {
            ders++;
            toplam += turk;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextInt();
        if (kim >= 0 && kim <= 100) {
            ders++;
            toplam += kim;
        }
        System.out.print("Müzik notunuzu giriniz: ");
        muz = input.nextInt();
        if (muz >= 0 && muz <= 100) {
            ders++;
            toplam += muz;
        }

        double ort = toplam / ders;
        if (ort >= 55) {
            System.out.println("Tebrikler, ortalamanız " + ort + "\nSınıfı geçtiniz");
        } else {
            System.out.println("Ortalamanız " + ort + "\nSınıfta kaldınız");
        }
    }
}
