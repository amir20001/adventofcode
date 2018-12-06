package aoc.day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayTwoPartOne {

    public static int run(List<String> values) {
        int twoCount = 0;
        int threeCount = 0;
        for (String value : values) {
            if(hasThresholdCount(value, 2)){
                twoCount++;
            }
            if(hasThresholdCount(value, 3)){
                threeCount++;
            }
        }
        return twoCount * threeCount;
    }

    private static boolean hasThresholdCount(String s, int threshold) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer count = counts.getOrDefault(c, 0);
            count++;
            counts.put(c, count);
        }

        for (Integer value : counts.values()) {
            if (value == threshold) {
                return true;
            }
        }
        return false;
    }
}
