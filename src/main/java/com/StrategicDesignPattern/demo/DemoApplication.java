package com.StrategicDesignPattern.demo;

import com.StrategicDesignPattern.demo.Car.Car;
import com.StrategicDesignPattern.demo.Car.CarFactory;
import com.StrategicDesignPattern.demo.Car.CarType;
import com.StrategicDesignPattern.demo.Car.Swift;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class DemoApplication {
     static Logger logger= LogManager.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


//		CarType carType=new Swift();
//		logger.debug(carType.getCar());


		logger.info("With factory Pattern");
		CarFactory carFactory=new CarFactory();
		logger.debug(carFactory.getCarType("mini").getCar());
		logger.debug(carFactory.getCarType("sedan").getCar());
		logger.debug(carFactory.getCarType("ev").getCar());
		logger.debug(carFactory.getCarType("other").getCar());
	}
}
