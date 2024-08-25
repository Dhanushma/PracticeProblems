package dhanu.study.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    // First unique character of a string. E.g. aabdcce . Output : d

        public int firstUniqueChar(String s) {

            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }

            int start = 0;
            int index = -1;
            while(start< s.length()){
                if(map.get(s.charAt(start)) == 1) {
                    index = start;
                    break;
                }
                start ++;
            }
            return index;

        }

}
