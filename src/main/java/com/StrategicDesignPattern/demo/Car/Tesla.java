package com.StrategicDesignPattern.demo.Car;

public class ElectricVehicle implements CarType{
    @Override
    public String getCar() {
        return "Tesla";
    }
}
