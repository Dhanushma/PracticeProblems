package dhanu.study.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ApacheLog {

    public static String findTopIpaddress(String[] lines) {

        Map<String, Integer> map = new HashMap<>();
        for( String log : lines) {
            String ip = log.substring(0, 8);

            map.put(ip, map.getOrDefault(ip, 0) + 1);
        }
        System.out.println(map);

        return map.entrySet().stream().min(Map.Entry.comparingByValue(Comparator.reverseOrder())).get().getKey();
    }

    public static void main(String[] args) {

        String lines[] = new String[] {
                "10.0.0.1 - log entry 1 11",
                "10.0.0.1 - log entry 2 213",
                "10.0.0.2 - log entry 133132" };
        String result = findTopIpaddress(lines);

        if (result.equals("10.0.0.1")) {
            System.out.println("Test passed");

        } else {
            System.out.println("Test failed");

        }

    }
}
