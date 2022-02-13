package com.StrategicDesignPattern.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//Car 1
		CarBuilder carBuilder=new CarBuilder();
		carBuilder.setName("WagonR");
		carBuilder.setCarType("Micro");
		carBuilder.setFuelType("Petrol");
		carBuilder.setEngineCC("1000 CC");
		carBuilder.setColor("White");

		Car car1= carBuilder.getCarObject();
        System.out.println(car1.toString());

		System.out.println("---------");

	   //Car 2
	   CarBuilder carBuilder1=new CarBuilder();
	   carBuilder1.setName("Tesla");
	   carBuilder1.setCarType("Sedan");
	   carBuilder1.setFuelType("Electric vehicle");
	   carBuilder1.setSunroof("Has a Sunroof");
	   carBuilder1.setColor("Black");

	   Car car2=carBuilder1.getCarObject();
		System.out.println(car2.toString());
	}
}
