import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");
        int kdvsizTutar = input.nextInt();

        /* double kdvOrani = 0.18 */
        double kdvOrani = (kdvsizTutar<1000) ? 0.18 : 0.08;
        System.out.println("KDV oranı: " + kdvOrani);

        double kdvTutari = kdvsizTutar * kdvOrani;
        System.out.println("KDV tutarı: " + kdvTutari);

        double kdvliTutar = kdvTutari + kdvsizTutar;
        System.out.println("KDV'li tutar: " + kdvliTutar);












    }
}
