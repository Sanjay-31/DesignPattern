package com.StrategicDesignPattern.demo;

public class CarBuilder {

    //imp
    private String name;
    //imp
    private String carType;
    //imp
    private String FuelType;
    //imp
    private String engineCC;
    //optional
    private String sunroof;
    //optional
    private String interiorType;
    //optional
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public void setEngineCC(String engineCC) {
        this.engineCC = engineCC;
    }

    public void setSunroof(String sunroof) {
        this.sunroof = sunroof;
    }

    public void setInteriorType(String interiorType) {
        this.interiorType = interiorType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car getCarObject()
    {
        Car car=new Car(name,carType,FuelType,engineCC,sunroof,interiorType,color);
        return car;
    }
}
