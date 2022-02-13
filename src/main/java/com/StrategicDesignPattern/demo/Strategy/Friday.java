package com.StrategicDesignPattern.demo.Strategy;

public class Friday implements DayInterface{
    @Override
    public String CurrentDay() {
        return "Today is Firday";
    }
}
