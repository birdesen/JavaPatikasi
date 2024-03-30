import java.util.Scanner;

public class Main {
    static void toplama() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    static void cikarma() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    static void carpma() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    static void bolme() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        double a = input.nextInt();
        double b;
        do {
            System.out.print("İkinci sayıyı giriniz: ");
            b = input.nextInt();
            if (b == 0) {
                System.out.println("Bir sayı sıfıra bölünmez!");
            }
        }
        while (b == 0);
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    static void usAlma() {
        Scanner input = new Scanner(System.in);
        System.out.print("taban sayısını giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int b = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        System.out.println(a + " ^ " + b + " = " + sonuc);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        System.out.println(a + " % " + b + " = " + (a % b));
    }

    static void faktoriyel() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a = input.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            sonuc *= i;
        }
        System.out.println(a + "!" + " = " + sonuc);
    }

    static void dikdortgen() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenarı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        int b = input.nextInt();
        System.out.println("Çevresi = " + (2 * (a + b)));
        System.out.println("Alanı = " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "+ Toplama işlemi" +
                "\n- Çıkarma işlemi" +
                "\n* Çarpma işlemi" +
                "\n/ Bölme işlemi" +
                "\n^ Üslü sayı hesaplama" +
                "\n% Mod alma" +
                "\n! Faktoriyel Hesaplma" +
                "\nD Dikdörtgen alan ve çevre hesabı" +
                "\nÇ Çıkış";

        char select;
        do {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select = input.next().charAt(0);
            switch (select) {
                case '+':
                    toplama();
                    break;
                case '-':
                    cikarma();
                    break;
                case '*':
                    carpma();
                    break;
                case '/':
                    bolme();
                    break;
                case '^':
                    usAlma();
                    break;
                case '%':
                    mod();
                    break;
                case '!':
                    faktoriyel();
                    break;
                case 'D':
                    dikdortgen();
                    break;
                case 'Ç':
                    System.out.println("Görüşmek üzere!");
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız lütfen tekrar deneyiniz!");
            }

        } while (select != 'Ç');
    }
}
