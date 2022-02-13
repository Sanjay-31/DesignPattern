package com.StrategicDesignPattern.demo;

import javax.servlet.http.PushBuilder;

public class Phone {
    //imp
    private String OS;
    //imp
    private String Ram;
    //imp
    private String Processor;
    //optional
    private String ScreenSize;
    //optional
    private String NumberOfCameras;

    public Phone(String OS, String ram, String processor, String screenSize, String numberOfCameras) {
        this.OS = OS;
        Ram = ram;
        Processor = processor;
        ScreenSize = screenSize;
        NumberOfCameras = numberOfCameras;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", Ram='" + Ram + '\'' +
                ", Processor='" + Processor + '\'' +
                ", ScreenSize='" + ScreenSize + '\'' +
                ", NumberOfCameras='" + NumberOfCameras + '\'' +
                '}';
    }

}