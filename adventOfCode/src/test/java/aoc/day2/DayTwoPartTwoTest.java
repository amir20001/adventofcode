package aoc.day2;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class DayTwoPartTwoTest {

    @Test
    public void testEditDistance() {
        Assert.assertEquals(2, DayTwoPartTwo.getEditDistance("abcde", "axcye"));
    }

    @Test
    public void testGetCommonLetters() {
        assertEquals("fgij", DayTwoPartTwo.getCommonLetters("fghij", "fguij"));
    }

    @Test
    public void run() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(getClass().getResource("/d2p1-input.txt").getPath()), StandardCharsets.UTF_8);
        System.out.println(DayTwoPartTwo.run(lines));
    }
}