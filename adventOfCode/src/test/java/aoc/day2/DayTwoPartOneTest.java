package aoc.day2;

import aoc.day1.DayOnePartOne;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DayTwoPartOneTest {

    @Test
    public void run() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(getClass().getResource("/d2p1-input.txt").getPath()), StandardCharsets.UTF_8);
        System.out.println(DayTwoPartOne.run(lines));
    }

}