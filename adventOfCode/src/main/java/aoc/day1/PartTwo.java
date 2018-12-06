package aoc.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartTwo {

    public static int run(List<Integer> lines) {
        Set<Integer> totals = new HashSet<>();
        Integer total = 0;
        while (true) {
            for (Integer line : lines) {
                total = total + line;
                if(totals.contains(total)){
                    return total;
                }else {
                    totals.add(total);
                }
            }
        }
    }
}
