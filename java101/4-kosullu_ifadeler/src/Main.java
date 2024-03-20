import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fzk, kim, turk, tar, muz;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fzk = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turk = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tar = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = input.nextInt();

        int toplam = mat + fzk + kim + turk + tar + muz;

        double ort = toplam / 6.0;

        System.out.println("Ortalamanız: " + ort);

        String durum = (ort > 60) ? "Sınıfı geçtiniz" : "Sınıfta kaldınız";
        System.out.println(durum);


    }
}
