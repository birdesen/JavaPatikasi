package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();

        hset.add(10);
        hset.add(20);
        hset.add(10);
        hset.add(30);

        for (Integer n : hset){
            System.out.println(n);
        }
        System.out.println(hset.isEmpty());
        System.out.println(hset.contains(20));
        hset.remove(10);
        // hset.clear();
        // hset.clone();

        Iterator<Integer> itr = hset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(hset.size());
        
    }
}
