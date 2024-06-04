package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> list = new LinkedList<>();
        list.add("Birdesen");
        list.add("Oge");
        list.add("10");
        list.add("Nisan");
        list.add("1990");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
