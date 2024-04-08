package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.job4j.oop.Point;

import static java.awt.geom.Point2D.distance;
import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    public void when00To20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when22to42then2() {
        double expected = 2;
        int x1 = 2;
        int y1 = 4;
        int x2 = 2;
        int y2 = 2;
        double output = distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenMinus32toMinus62then9dot43() {
        double expected = 9.43;
        int x1 = -3;
        int y1 = -6;
        int x2 = 2;
        int y2 = 2;
        double output = distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when5Minus1to64then6dot32() {
        double expected = 6.32;
        int x1 = 5;
        int y1 = 6;
        int x2 = -1;
        int y2 = 4;
        double output = distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when01to00to00then1() {
        int expected = 1;
        Point c = new Point(0, 1, 0);
        Point d = new Point(0, 0, 0);
        double dist = c.distance3d(d);
        Assert.assertEquals(expected, dist, 0.01);
    }
}
