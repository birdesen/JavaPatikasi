import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int b = input.nextInt();

        int sum = 1;

        for (int i = 0; i <= b; i++) {
            if (i == 0) {
                sum *= 1;
            } else {
                sum *= a;
            }
        }

        System.out.println(a + " ^ " + b + " = " + sum);


    }
}
