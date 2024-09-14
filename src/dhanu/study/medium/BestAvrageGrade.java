package dhanu.study.medium;

import java.util.*;
import java.util.stream.Collectors;

public class BestAvrageGrade {
//  Find the best average grade.
//  Given a list of student test scores
//  Each student may have more than one test score in the list.

    public static Integer bestAvgGrade(String[][] scores) {
        Map<String, List<String>> markMap = new HashMap<>();
        int maxAvg = 0;

        for (String[] namemark : scores) {
            String student = namemark[0];
            String mark = namemark[1];
            if (markMap.containsKey(student)) {
                markMap.get(student).add(mark);
            } else {
                List<String> list = new ArrayList<>();
                list.add(mark);
                markMap.put(student, list);
            }
        }

        for (String student : markMap.keySet()) {
            double avg = markMap.get(student).stream().mapToInt(Integer::parseInt).average().getAsDouble();
            if (avg > maxAvg) {
                maxAvg = (int) avg;
            }
        }


        // or
        Map<String, List<Integer>> studentScores = Arrays.stream(scores).collect(Collectors.groupingBy(score -> score[0], Collectors.mapping(score -> Integer.parseInt(score[1]), Collectors.toList())));
        OptionalDouble bestAverage = studentScores.values().stream()
                .mapToDouble(sc -> sc.stream().mapToInt(Integer::intValue).average().orElse(0))
                .max();
        return maxAvg;


    }

    public static boolean pass() {
        String[][] s1 = {{"Rohan", "84"},
                {"Sachin", "102"},
                {"Ishan", "55"},
                {"Sachin", "18"}};

        return bestAvgGrade(s1) == 84;
    }

    public static void main(String[] args) {
        if (pass()) {
            System.out.println("Pass");
        } else {
            System.out.println("Some Fail");
        }
    }
}
