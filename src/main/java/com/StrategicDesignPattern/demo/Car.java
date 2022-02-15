package com.StrategicDesignPattern.demo;

public class Car {
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

    public Car(String name, String carType, String fuelType, String engineCC, String sunroof, String interiorType, String color) {
        this.name = name;
        this.carType = carType;
        FuelType = fuelType;
        this.engineCC = engineCC;
        this.sunroof = sunroof;
        this.interiorType = interiorType;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carType='" + carType + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", engineCC='" + engineCC + '\'' +
                ", sunroof='" + sunroof + '\'' +
                ", interiorType='" + interiorType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCarType() {
        return carType;
    }

    public String getFuelType() {
        return FuelType;
    }

    public String getEngineCC() {
        return engineCC;
    }

    public String getSunroof() {
        return sunroof;
    }

    public String getInteriorType() {
        return interiorType;
    }

    public String getColor() {
        return color;
    }
}