package aoc.day1;

import java.util.List;

public class DayOnePartOne {

    public static int run (List<Integer> values){
        int total =0;
        for (Integer value : values) {
            total=total+value;
        }
        return total;
    }
}
