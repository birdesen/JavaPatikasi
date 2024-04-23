public class Main {
    public static void main(String[] args) {
        int arr[] = {56, 34, 1, 8, 101, -2, -33};

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Dizinin en küçük elemanı: " + min
                + "\nDizinin en büyük elemanı: " + max);
    }
}
