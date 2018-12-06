package aoc.day2;

import java.util.List;

public class DayTwoPartTwo {

    public static String run(List<String> values) {
        int minIndexLeft = -1;
        int minIndexRight = -1;
        int minEditDistance = Integer.MAX_VALUE;


        for (int i = 0; i < values.size() - 1; i++) {
            for (int j = i + 1; j < values.size(); j++) {
                String left = values.get(i);
                String right = values.get(j);
                int editDistance = getEditDistance(left, right);
                if (editDistance < minEditDistance) {
                    minEditDistance = editDistance;
                    minIndexLeft = i;
                    minIndexRight = j;
                }
            }
        }

        return getCommonLetters(values.get(minIndexLeft), values.get(minIndexRight));
    }


    public static String getCommonLetters(String left, String right) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) == right.charAt(i)) {
                sb.append(left.charAt(i));
            }
        }
        return sb.toString();
    }

    public static int getEditDistance(String left, String right) {
        int diff = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                diff++;
            }
        }
        return diff;
    }
}
