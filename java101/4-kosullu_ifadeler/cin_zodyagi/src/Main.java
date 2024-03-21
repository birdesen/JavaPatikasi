import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int year = input.nextInt();
        int mod = year % 12;
        switch (mod) {
            case 0:
                System.out.println("Maymun burcusunuz");
                break;
            case 1:
                System.out.println("Horoz burcusunuz");
                break;
            case 2:
                System.out.println("Köpek burcusunuz");
                break;
            case 3:
                System.out.println("Domuz burcusunuz");
                break;
            case 4:
                System.out.println("Fare burcusunuz");
                break;
            case 5:
                System.out.println("Öküz burcusunuz");
                break;
            case 6:
                System.out.println("Kaplan burcusunuz");
                break;
            case 7:
                System.out.println("Tavşan burcusunuz");
                break;
            case 8:
                System.out.println("Ejderha burcusunuz");
                break;
            case 9:
                System.out.println("Yılan burcusunuz");
                break;
            case 10:
                System.out.println("At burcusunuz");
                break;
            case 11:
                System.out.println("Koyun burcusunuz");
                break;
        }
    }
}
