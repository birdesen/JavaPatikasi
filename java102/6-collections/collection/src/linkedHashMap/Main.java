package linkedHashMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lHMap = new LinkedHashMap<>();
        lHMap.put(1, "Birdesen");
        lHMap.put(3, "10");
        lHMap.put(2, "Oge");
        lHMap.put(5, "1990");
        lHMap.put(4, "Nisan");
        for (String values : lHMap.values()){
            System.out.println(values);
        }

        TreeMap<Integer, Student> tMap = new TreeMap<>(new OrderNoComparator());
        tMap.put(1, new Student("Ayşe", 90));
        tMap.put(3, new Student("Fatma", 75));
        tMap.put(2, new Student("Ali", 60));
        tMap.put(4, new Student("Veli", 95));

        for (Student values : tMap.values()){
            System.out.println(values.getName());
        }


    }
}
