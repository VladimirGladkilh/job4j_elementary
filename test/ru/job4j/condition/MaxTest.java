package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void when2Ravno1Then1() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void when1MaxFrom3() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }
    @Test
    public void when2MaxFrom3() {
        int result = Max.max(3, 20, 1);
        assertThat(result, is(20));
    }
    @Test
    public void when3MaxFrom3() {
        int result = Max.max(3, 2, 10);
        assertThat(result, is(10));
    }
    @Test
    public void when1MaxFrom4() {
        int result = Max.max(3, 2, 1, 0);
        assertThat(result, is(3));
    }
    @Test
    public void when3MaxFrom4() {
        int result = Max.max(3, 2, 10, 0);
        assertThat(result, is(10));
    }
}
