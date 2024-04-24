public class Main {

    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {5, 2, 4, 6, 1, 88, 88, 6, 9, 9, 2, 5, 4, 6};
        int[] dublicate = new int[list.length];
        int starterIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (!isFind(dublicate, list[i])) {
                        if (list[i] % 2 == 0) {
                            dublicate[starterIndex++] = list[i];
                        }
                    }
                }
            }
        }
        for (int i : dublicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}
