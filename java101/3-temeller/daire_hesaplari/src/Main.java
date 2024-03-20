import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        int r = input.nextInt();

        double PI = 3.14;
        double cevre = 2 * PI * r;
        System.out.println("Çevre: " + cevre);
        double alan = PI * r * r;
        System.out.println("Alan: " + alan);

        System.out.print("Daire diliminin açısını giriniz: ");
        int aci = input.nextInt();
        double dilimAlan = (PI * r * r * aci) / 360;
        System.out.println("Daire diliminin alanı: " + dilimAlan);
    }
}
