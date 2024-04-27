import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Oyunun boyutlarını belirlemek için;");
        System.out.print("Satır sayısı giriniz: ");
        int row = input.nextInt();
        System.out.print("Sütun sayısı giriniz: ");
        int col = input.nextInt();
        Mine mine = new Mine(row,col);
        mine.run();

    }
}