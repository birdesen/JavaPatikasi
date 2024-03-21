import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int b = input.nextInt();
        System.out.print("Toplama için +" +
                "\nÇıkarma için -" +
                "\nÇarpma için *" +
                "\nBölme için /" +
                "\nMod alma için %" +
                "\nYapmak istediğiniz işlemi seçiniz: ");

        char islem = input.next().charAt(0);

        switch (islem) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                switch (b) {
                    case 0:
                        System.out.println("Bir sayının sıfıra bölümü tanımızdır.");
                        break;
                    default:
                        System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a % b));
                break;
            default:
                System.out.println("Geçersiz giriş yaptınız");
        }
    }
}
