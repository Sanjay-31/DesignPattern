package com.StrategicDesignPattern.demo.Car;


public class CarFactory {

    public CarType getCarType(String s)
    {
        if(s.equals("ev"))
        {
            return new Tesla();
        }
        else if(s.equals("mini"))
        {
            return new Swift();
        }
        else if(s.equals("sedan"))
        {
            return new Verna();
        }
        else return new Other();
    }
}
