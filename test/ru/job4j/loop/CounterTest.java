package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumByEventFromTwoToSeven() {
        int rsl = Counter.sumByEven(2, 7);
        int expected = 12;
        assertThat(rsl, is(expected));
    }
}
