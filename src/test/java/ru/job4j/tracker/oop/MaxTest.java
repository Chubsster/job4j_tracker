package ru.job4j.tracker.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.oop.Max;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2To3Then3() {
        int expected = 3;
        Max max = new Max();
        int max1 = max.max(1, 2, 3);
        Assertions.assertEquals(expected, max1);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int expected = 4;
        Max max = new Max();
        int max1 = max.max(1, 2, 3, 4);
        Assertions.assertEquals(expected, max1);
    }

}
