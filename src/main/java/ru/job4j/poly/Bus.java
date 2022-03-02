package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
    }

    @Override
    public void passengers(int number) {
    }

    @Override
    public double refuel(int fuel) {
        return fuel * 52.89;
    }
}
