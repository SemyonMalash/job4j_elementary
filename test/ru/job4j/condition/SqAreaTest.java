package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K30Then63() {
        int expected = 63;
        int p = 49;
        int k = 7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP32K6Then24() {
        int expected = 24;
        int p = 32;
        int k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}