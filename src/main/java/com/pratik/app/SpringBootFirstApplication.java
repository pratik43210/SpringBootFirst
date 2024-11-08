package com.pratik.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pratik.app.model.Alien;
import com.pratik.app.model.Laptop;
import com.pratik.app.service.LaptopService;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);
		
		Alien obj=context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.code();
		
//		Alien obj1=context.getBean(Alien.class);
//		obj1.code();
//		
		Laptop lap=context.getBean(Laptop.class);
//		lap.compile();
		
		LaptopService service=context.getBean(LaptopService.class);
		service.addLaptop(lap);
	}

}
