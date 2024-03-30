import java.util.Scanner;
public class Main {
    static void pattern(int n, int i) {

        if (i > 0) {
            System.out.print(i + " ");
            pattern(n, i - 5);
        } else {
            System.out.print(i + " ");
            tersPattern(n, i + 5);
        }
    }

    static void tersPattern(int n, int i) {
        if (i > 0 && i < n) {
            System.out.print(i + " ");
            tersPattern(n, i + 5);

        } else if (i == n) {
            System.out.print(n + " ");

        }
    }
        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("N sayısı: ");
            int b = input.nextInt();
            pattern(b, b);

        }
    }
