import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Dik üçgende hipotenüs hesabı:
        System.out.print("1. dik kenarı yazınız: ");
        int a = input.nextInt();
        System.out.print("2. dik enarı yazınız: ");
        int b = input.nextInt();
        double hip = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs: " + hip); */

        //kenarları verilen üçgenin alanı:
        System.out.print("1. kenarı yazınız: ");
        int a = input.nextInt();
        System.out.print("2. kenarı yazınız: ");
        int b = input.nextInt();
        System.out.print("3. kenarı yazınız: ");
        int c = input.nextInt();
        double u = (a + b + c) / 2.0;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı: " + alan);


    }
}
