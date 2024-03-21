import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Uçak bileti ücretini hesaplamak için;");
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        int km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipinizi giriniz Tek Yön(1) / Gidiş-Dönüş(2): ");
        int tip = input.nextInt();
        if (km < 0 || yas < 0 || !(tip == 1 || tip == 2)) {
            System.out.println("Hatalı veri girdiniz");
        } else {
            double ucret = km * 0.10;
            if (yas < 12) {
                ucret *= 0.5;
            } else if (yas >= 12 && yas < 24) {
                ucret *= 0.9;
            } else if (yas > 65) {
                ucret *= 0.7;
            }
            if (tip == 2) {
                ucret *= 0.8;
                ucret *= 2;
            }
            System.out.println("bilet ücretiniz: " + ucret);
        }


    }
}
