public class Main {
    public static void main(String[] args) {
        String[][] b = new String[7][4];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (j == 0) {
                    b[i][j] = " * ";
                } else if ((i == 0 || i == 3 || i == 6) && (j != 3)) {
                    b[i][j] = " * ";
                } else if ((j == 3) && (i == 1 || i == 2 || i == 4 || i == 5)) {
                    b[i][j] = " * ";
                } else {
                    b[i][j] = "   ";
                }
            }
        }
        for (String[] row : b) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();

        }
    }
}
