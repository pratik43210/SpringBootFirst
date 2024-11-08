package com.pratik.app.service;

import org.springframework.stereotype.Service;

import com.pratik.app.model.Laptop;

@Service
public class LaptopService {
	public void addLaptop(Laptop lap) {
		System.out.println("add method called");
	}
	
	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
}
