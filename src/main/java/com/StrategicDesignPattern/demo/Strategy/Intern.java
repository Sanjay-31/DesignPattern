package com.StrategicDesignPattern.demo.Strategy;

public class Intern implements Post {
    @Override
    public String JobDescription() {
        return "Learning";
    }

    @Override
    public int MinExperience() {
        return 0;
    }
}
