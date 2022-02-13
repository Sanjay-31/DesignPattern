package com.StrategicDesignPattern.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		//object should be immutable that is objects should not be modified after they have been created.
//		Car car=new Car("Audi A6","Sedan",
//				"Diesel","2000 CC",
//				"Has A Sunroof",
//				"Luxury","Blue");

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
	   Car car2=new CarBuilder()
			   .setName("Tesla")
			   .setCarType("Sedan")
			   .setFuelType("Electric vehicle")
			   .setSunroof("Has a Sunroof")
			   .setColor("Black").getCarObject();

		System.out.println(car2.toString());
	}
}
