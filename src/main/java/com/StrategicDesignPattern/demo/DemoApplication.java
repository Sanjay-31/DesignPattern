package com.StrategicDesignPattern.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class DemoApplication {
     static Logger logger= LogManager.getLogger(DemoApplication.class);
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
		logger.info(car1.toString());


	   //Car 2
	   Car car2=new CarBuilder()
			   .setName("Tesla")
			   .setCarType("Sedan")
			   .setFuelType("Electric vehicle")
			   .setSunroof("Has a Sunroof")
			   .setColor("Black").getCarObject();

		logger.info(car2.toString());
	}
}
