import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fzk, kim, tur, tar, muz;

        System.out.println("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fzk = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kim = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        tur = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tar = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muz = input.nextInt();
        int toplam = mat + fzk + kim + tur + tar + muz;
        double ort = toplam / 6.0;

        String sonuc = (ort > 60) ? "Geçtiniz" : "Kaldınız";

        System.out.println(sonuc);

    }
}
