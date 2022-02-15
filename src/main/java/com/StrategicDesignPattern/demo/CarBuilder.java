package com.StrategicDesignPattern.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

     Logger logger= LogManager.getLogger(DemoApplication.class);

    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setCarType(String carType) {
        this.carType = carType;
        return this;
    }

    public CarBuilder setFuelType(String fuelType) {
        FuelType = fuelType;
        return this;
    }

    public CarBuilder setEngineCC(String engineCC) {
        this.engineCC = engineCC;
        return this;
    }

    public CarBuilder setSunroof(String sunroof) {
        this.sunroof = sunroof;
        return this;
    }

    public CarBuilder setInteriorType(String interiorType) {
        this.interiorType = interiorType;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car getCarObject()
    {
        Car car=new Car(name,carType,FuelType,engineCC,sunroof,interiorType,color);
        return car;
    }


    protected void finalize()
    {
        logger.debug("Garbage collector is running");
    }
}
