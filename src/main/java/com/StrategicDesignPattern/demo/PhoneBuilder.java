package com.StrategicDesignPattern.demo;

import java.nio.channels.Pipe;

public class PhoneBuilder {
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


    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(String Ram) {
        this.Ram = Ram;
        return this;
    }

    public PhoneBuilder setProcessor(String Processor) {
        this.Processor = Processor;
        return this;
    }

    public PhoneBuilder setScreenSize(String ScreenSize) {
        this.ScreenSize = ScreenSize;
        return this;
    }

    public PhoneBuilder setNumberOfCameras(String NumberOfCameras) {
        this.NumberOfCameras =NumberOfCameras;
        return this;
    }
    public Phone getPhone()
    {
        return new Phone(OS,Ram,Processor,ScreenSize,NumberOfCameras);
    }
}
