package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNisLessThan0() {
        //Fact fact = new Fact();
        //fact.calc(4);
        new Fact().calc(-3);
    }
}