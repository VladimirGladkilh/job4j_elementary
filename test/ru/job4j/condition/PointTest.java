package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {
    @Test
    public void distance() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 2;
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance3D() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        int z1 = 0;
        int z2 = 0;
        double expected = 2;
        Point first = new Point(x1, y1, z1);
        Point second = new Point(x2, y2, z2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}
