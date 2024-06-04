package hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hsMap = new HashMap<>();

        hsMap.put("TR", "Türkiye");
        hsMap.put("EN", "İngiltere");
        hsMap.put("GR", "Almanya");

        hsMap.remove("GR");
        System.out.println(hsMap.get("GR"));

    }
}
