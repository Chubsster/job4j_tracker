package ru.job4j.tracker.oop;

import org.junit.jupiter.api.Test;
import ru.job4j.oop.Max;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void whenMax2To2To2Then3() {
        int left = 2;
        int right = 2;
        int third = 3;
        int result = Max.max(left, right, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}