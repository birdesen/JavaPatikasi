import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dort = 1, bes = 1;
        System.out.print("Bir sınır sayısı giriniz: ");
        int n = input.nextInt();

        while (bes <= n) {
            dort *= 4;
            bes *= 5;
            if (dort <= n) {
                System.out.println(dort);
            }
            if (bes <= n) {
                System.out.println(bes);
            }

        }


    }
}