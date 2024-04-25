import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matris = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println("Matris: ");
        System.out.println(Arrays.toString(matris[0]));
        System.out.println(Arrays.toString(matris[1]));

        int[][] transpoze = new int[matris[0].length][matris.length];

        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[0].length; j++) {
                transpoze[i][j] = matris[j][i];

            }
        }
        System.out.println("Transpoze: ");

        System.out.println(Arrays.toString(transpoze[0]));
        System.out.println(Arrays.toString(transpoze[1]));
        System.out.println(Arrays.toString(transpoze[2]));


    }
}
