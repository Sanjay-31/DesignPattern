package com.StrategicDesignPattern.demo.Strategy;

public class Wednesday implements DayInterface{
    @Override
    public String CurrentDay() {
        return "Today is Wednesday";
    }
}
