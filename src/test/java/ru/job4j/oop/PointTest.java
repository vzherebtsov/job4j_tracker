package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when12to24then2dot23() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when22to23then1() {
        double expected = 1;
        Point a = new Point(0, 1);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when35to12then3dot60() {
        double expected = 5;
        Point a = new Point(3, 0);
        Point b = new Point(0, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}