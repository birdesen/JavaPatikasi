import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[]{10, 20, 20, 10, 10, 20, 5, 20};


        for (int i = 0; i < list.length; i++) {
            int sekans = 1;
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    sekans++;
                    list[j]= 0;
                }
            }
            if (list[i]!= 0){
                System.out.println(list[i] + " sayısı " + sekans + " kere tekrar etmiştir.");
            }

        }
    }
}
