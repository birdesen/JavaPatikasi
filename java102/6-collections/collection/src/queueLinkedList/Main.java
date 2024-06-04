package queueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> qList = new LinkedList<>();
        qList.add("Birdesen");
        qList.add("Oge");
        qList.add("10");
        qList.add("Nisan");
        qList.add("1990");
        Iterator<String> itr = qList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
