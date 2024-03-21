import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int temp = input.nextInt();
        if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz");

        } else if (temp >= 5 && temp < 10) {
            System.out.println("Sinemaya gidebilisiniz");

        } else if (temp >= 10 && temp <= 15) {
            System.out.println("Sinemaya gidebilir veya piknik yapabilirsiniz");

        } else if (temp > 15 && temp <= 25) {
            System.out.println("Piknik yapabilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}
