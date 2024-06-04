package linkedHashMap;

import java.util.Comparator;

public class OrderNoComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1,Integer o2){
        return o1 - o2;
    }
}
