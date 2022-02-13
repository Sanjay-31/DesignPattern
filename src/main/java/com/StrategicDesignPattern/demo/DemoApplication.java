package com.StrategicDesignPattern.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
       Phone phone=new PhoneBuilder().setOS("Android")
			   .setProcessor("Snapdragon")
			   .setRam("3GB").getPhone();
	       System.out.println(phone.toString());
	}
}
