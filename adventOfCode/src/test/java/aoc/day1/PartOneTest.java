package aoc.day1;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class PartOneTest {



    @Test
    public void runData() throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(getClass().getResource("/d1p1-input.txt").getPath()), StandardCharsets.UTF_8);
        System.out.println(PartOne.run(strings.stream().map(Integer::parseInt).collect(Collectors.toList())));
    }
}