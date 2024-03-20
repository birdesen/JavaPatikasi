import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen km'yi yazınız: ");
        int km = input.nextInt();

        double tutar = 10 + (2.20 * km);

        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Taksimetre ücreti: " + tutar + "'dır");


    }
}
