package com.StrategicDesignPattern.demo.Strategy;

public class Day {
   private DayInterface dayInterface;

    public Day(DayInterface dayInterface) {
        this.dayInterface=dayInterface;
    }

    public String  get()
   {
       return dayInterface.CurrentDay();
   }
}
