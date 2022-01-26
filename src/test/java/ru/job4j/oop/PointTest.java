package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to02then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when01to02then1() {
        double expected = 1;
        Point a = new Point(0, 1);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when30to04then5() {
        double expected = 5;
        Point a = new Point(3, 0);
        Point b = new Point(0, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when302to047then7dot07() {
        double expected = 7.07;
        Point a = new Point(3, 0, 2);
        Point b = new Point(0, 4, 7);
        double dist3d = a.distance3d(b);
        Assert.assertEquals(expected, dist3d, 0.01);
    }

    @Test
    public void when731to950then3() {
        double expected = 3;
        Point a = new Point(7, 3, 1);
        Point b = new Point(9, 5, 0);
        double dist3d = a.distance3d(b);
        Assert.assertEquals(expected, dist3d, 0.01);
    }
}