import java.util.Random;
import java.util.Scanner;

public class Mine {
    int rowNumber;
    int colNumber;
    String [][] map;
    String [][] game;

    Mine(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[this.rowNumber][this.colNumber];
        this.game = new String[this.rowNumber][this.colNumber];
    }

    void run() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < this.map.length; i++) {
            for (int j = 0; j < this.map[i].length; j++) {
                this.map[i][j] = "-";
                this.game[i][j] = "-";
            }
        }
        int mine = (this.rowNumber * this.colNumber) / 4;
        while (mine > 0) {
            Random random = new Random();
            int r = random.nextInt(this.rowNumber);
            int c = random.nextInt(this.colNumber);
            if (this.map[r][c].equals("*")) {
                mine++;
            } else {
                this.map[r][c] = "*";
            }
            mine--;
        }

        boolean cont = true;

        while (cont) {
            System.out.println("==========================");
            print(this.game);
            System.out.print("Satır numarası giriniz: ");
            int rrow = input.nextInt();
            System.out.print("Sütun numarası giriniz: ");
            int ccol = input.nextInt();
            int row = rrow - 1;
            int col = ccol - 1;
            if (this.map[row][col].equals("*")) {
                System.out.println("Oyunu kaybettiniz");
                cont = false;

            } else{
                int mines = 0;

                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (i >= 0 && i < this.map.length && j >= 0 && j < this.map.length) {
                            if (this.map[i][j].equals("*")) {
                                mines++;
                            }
                        }
                    }
                }
                this.game[row][col] = Integer.toString(mines);
            }
            if(isWin()){
                print(this.game);
                System.out.println("Tebrikler kazandınız");
                cont = false;
            }

        }
        for (int i = 0; i < this.game.length; i++) {
            for (int j = 0; j < this.game[i].length; j++) {
                if (this.map[i][j].equals("*")) {
                    this.game[i][j] = this.map[i][j];
                }
            }
        }
        print(this.game);
    }
    boolean isWin(){
        for(int i = 0; i<this.game.length; i++){
            for(int j = 0; j<this.game[0].length; j++){
                if(this.map[i][j] =="-"){
                    if(this.game[i][j] == "-"){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    void print(String arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}