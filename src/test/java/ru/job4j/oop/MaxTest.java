package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOfThreeNumbers() {
        int first = 1;
        int second = 2;
        int third = 0;
        int result = Max.max(first, second, third);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxOfFourthNumbers() {
        int first = 1;
        int second = 7;
        int third = 0;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}