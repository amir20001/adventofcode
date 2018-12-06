package aoc.day1;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DayOnePartOneTest {



    @Test
    public void run() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(getClass().getResource("/d1p1-input.txt").getPath()), StandardCharsets.UTF_8);
        System.out.println(DayOnePartOne.run(lines.stream().map(Integer::parseInt).collect(Collectors.toList())));
    }
}