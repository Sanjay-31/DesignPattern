package com.StrategicDesignPattern.demo.Strategy;

public class SeniorEngineer implements Post {
    @Override
    public String JobDescription() {
        return "Leading The team";
    }

    @Override
    public int MinExperience() {
        return 5;
    }
}
