package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int result = FindLoop.indexOf(new int[] {5, 4, 3, 2}, 5);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6ThenMinus1() {
        int result = FindLoop.indexOf(new int[] {5, 4, 3, 2}, 6);
        int expect = -1;
        assertThat(result, is(expect));
    }
}