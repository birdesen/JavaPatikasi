package arrayList;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(null);
        liste.add(4);
        liste.add(4);
        liste.add(4);
        liste.add(4); // kendini tekrar eden  sayıları tutar
        liste.add(5);
        System.out.println(liste.indexOf(10));
        // geriye -1 döndürüyorsa listede yoktur

        System.out.println("3 indisli eleman: " + liste.get(3));

        for (Integer element : liste) {
            //System.out.println(element);
        }


    }
}
