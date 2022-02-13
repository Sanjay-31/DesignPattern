package com.StrategicDesignPattern.demo.Strategy;

public class Tuesday implements DayInterface
{
    @Override
    public String CurrentDay() {
        return "Today is Tuesday";
    }
}
