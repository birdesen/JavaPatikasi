import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". elemanı giriniz: ");
            int x = input.nextInt();
            list[i] = x;
        }
        int min = list[0];
        int starterIndex = 0;
        int[] dublicate = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
