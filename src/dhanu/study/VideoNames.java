package dhanu.study;

import java.util.*;
import java.util.stream.Collectors;

public class VideoNames {

    /*Given a list L of video names and their watch rates,
    write a function that will return the videos with the top 10 watch rates.
    Video names may appear more than once.Example:
    L = [(‘abc’, 10), (‘def’, 15), (‘ghi’, 10), (‘abc’, 12), …, (‘xyz’,100)]
    The function should return [‘xyz’, ‘abc’, …, ‘def’, ‘ghi’]*/

    public static List<String> getTopWatchRates(List<Map.Entry<String, Integer>> watchList) {

        // populate map by aggregating rates for the same video name
        Map<String, Integer> videoMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : watchList) {
            String name = entry.getKey();
            int rate = entry.getValue();
            videoMap.put(name, videoMap.getOrDefault(name, 0) + rate);
        }

        //sort map based on watch rate
        List<Map.Entry<String, Integer>> sortedList = videoMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();

        //fetch top 10 from the list
        return sortedList.subList(0, Math.min(9, sortedList.size())).stream().map(x -> x.getKey()).collect(Collectors.toList());

        /*List<String> top = new ArrayList<>();
        for (int i = 0; i < Math.min(10, sortedList.size()); i++) {
            top.add(sortedList.get(i).getKey());
        }

        return top;*/
    }

    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> videoList = Arrays.asList(
                new AbstractMap.SimpleEntry<>("abc", 10),
                new AbstractMap.SimpleEntry<>("def", 15),
                new AbstractMap.SimpleEntry<>("ghi", 10),
                new AbstractMap.SimpleEntry<>("abc", 12),
                new AbstractMap.SimpleEntry<>("xyz", 100)
        );

        System.out.println(getTopWatchRates(videoList));

    }
}
