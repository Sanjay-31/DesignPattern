package com.StrategicDesignPattern.demo.Strategy;

public class JuniorEngineer implements Post {
    @Override
    public String JobDescription() {
        return "Getting Started in Programming";
    }

    @Override
    public int MinExperience() {
        return 1;
    }


}
