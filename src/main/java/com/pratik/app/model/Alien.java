package com.pratik.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//this annotation tells spring that it has to manage this object
@Component
public class Alien {
	//we already added annotation component to laptop class
	//autowired tells spring that its spring's responsibility
	//too search this laptop object inside the container
	@Value("26")
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Autowired
//	@Qualifier("desktop")
	Computer com;
	public Computer getCom() {
		return com;
	}
	@Autowired
	@Qualifier("desktop")
	public void setCom(Computer com) {
		this.com = com;
	}
	public void code() {
		com.compile();
	}
}
