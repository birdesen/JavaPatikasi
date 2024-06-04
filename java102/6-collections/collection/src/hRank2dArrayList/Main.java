package hRank2dArrayList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();

        for(int i = 0 ; i<n ; i ++){
            matrix.add(new ArrayList<Integer>());
            int d = input.nextInt();
            for(int j = 0 ; j<d ; j++){
                int z = input.nextInt();
                matrix.get(i).add(j, z);
            }
        }
        int q = input.nextInt();
        for(int k = 1 ; k<=q ; k ++){
            try{
                int x = input.nextInt();
                int y = input.nextInt();
                System.out.print(matrix.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.print("ERROR!");
            }
        }


    }
}

