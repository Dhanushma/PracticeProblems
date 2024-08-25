package dhanu.study;

import java.util.HashMap;
import java.util.Map;

public class WinnerElection {
    public static void main(String[] args) {
        String[] votes = {"John", "Jamy", "John", "Catty", "John", "Jamy", "Jamy"};
        System.out.println(getWinner(votes));
    }

    public static String getWinner(String[] names) {

        Map<String, Integer> namemap = new HashMap<>();

        for (String name : names) {
            namemap.put(name, namemap.getOrDefault(name, 0) + 1);
        }

        int max = 0;
        String result = "";
        for (Map.Entry<String, Integer> entry : namemap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
            if (entry.getValue() == max) {
                max = entry.getValue();
                result = findSmallest(result, entry.getKey());
            }
        }
        return result;
    }

    private static String findSmallest(String name1, String name2) {
        if (name1.compareTo(name2) > 0) {
            return name2;
        }
        return name1;
    }

}
