package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 20;
        int c;
        try {
            System.out.print("Bölme işlemi: ");
            System.out.println(b / a);
            System.out.print("Tam sayı giriniz:");
            c = input.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik hata algılandı");
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Yanlış tipte veri girildi");
            System.out.println(e.getMessage());
        } catch (Exception e) {         // genel tüm hata ifadeleri için kullanılır
            System.out.println("Hata alındı");
            System.out.println(e.getMessage());
        } finally {      // içine yazılan ifade mutlaka çalışır
            System.out.println("bu kısım kesinlikle çalışacak");
        }
        System.out.println("Program bitti");

    }
}

