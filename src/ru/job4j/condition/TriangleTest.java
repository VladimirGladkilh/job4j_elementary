package ru.job4j.condition;

import org.junit.Test;

import javax.annotation.PostConstruct;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(2, 0);
        Point cp = new Point(0, 2);
        Triangle triangle = new Triangle(ap, bp, cp);
        boolean result = triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

}
