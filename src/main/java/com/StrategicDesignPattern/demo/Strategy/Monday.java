package com.StrategicDesignPattern.demo.Strategy;

public class Monday implements DayInterface {

    @Override
    public String CurrentDay() {
        return "Today Is Monday";
    }
}
