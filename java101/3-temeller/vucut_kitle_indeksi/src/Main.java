import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double boy = input.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        int kilo = input.nextInt();


        double index = kilo / (boy * boy);

        System.out.println("Vücut kütle indeksiniz: " + index);


    }
}
