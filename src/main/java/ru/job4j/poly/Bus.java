package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров: " + number);
    }

    @Override
    public double refuel(int fuel) {
        return fuel * 52.89;
    }
}
