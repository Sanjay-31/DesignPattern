package com.StrategicDesignPattern.demo;

import com.StrategicDesignPattern.demo.Strategy.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Intern intern=new Intern();
		JuniorEngineer juniorEngineer=new JuniorEngineer();
		SeniorEngineer seniorEngineer=new SeniorEngineer();
		Employee A=new Employee("A",intern);
		Employee B=new Employee("B",juniorEngineer);
		Employee C=new Employee("C",seniorEngineer);

		System.out.println(A.getJobDescription());
		System.out.println(A.MinExperience());

		System.out.println("/ --------- /");

		System.out.println(B.getJobDescription());
		System.out.println(B.MinExperience());


		System.out.println("/ --------- /");
		System.out.println("/ Promoting junior to Senior /");


		B.PromoteTo(seniorEngineer);
		System.out.println(B.getJobDescription());
		System.out.println(B.MinExperience());
	}

}
