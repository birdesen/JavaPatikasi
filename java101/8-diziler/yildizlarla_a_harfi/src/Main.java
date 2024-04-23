public class Main {
    public static void main(String[] args) {
        String[][] a = new String[6][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0 || i == 2) {
                    a[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    a[i][j] = " * ";
                } else {
                    a[i][j] = "   ";
                }
            }
        }
        for (String[] row : a) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
