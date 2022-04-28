package com.lessayer.entity;
import java.util.ArrayList;
import java.util.List;

public class Dog {
	
	public enum Size {
		SMALL, MEDIUM, LARGE
	}
	
	public enum Status {
		HEALTHY, SICK, UNDERTREAT, UNDERDIAGNOSIS
	}
	
	protected String name;
	protected Integer age;
	protected Size size;
	protected Status status;
	
	public Dog(String name, Integer age, Size size, Status status) {
		this.name = name;
		this.age = age;
		this.size = size;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Size getSize() {
		return size;
	}
	
	public Status getStauts() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void printDog() {
		System.out.println(name + ", " + age + ", " + size.toString() + ", " + status.toString());
	}
	
	public static List<Dog> createRoster() {
		
		List<Dog> roster = new ArrayList<>();
		roster.add(new Dog("BUDDY", 2, Size.LARGE, Status.HEALTHY));
		roster.add(new Dog("SIMBA", 8, Size.MEDIUM, Status.HEALTHY));
		roster.add(new Dog("JOEY", 1, Size.SMALL, Status.HEALTHY));
		roster.add(new Dog("THEO", 7, Size.LARGE, Status.SICK));
		roster.add(new Dog("RAMBO", 10, Size.SMALL, Status.UNDERTREAT));
		roster.add(new Dog("MARLEY", 5, Size.MEDIUM, Status.UNDERDIAGNOSIS));
		return roster;
		
	}
	
}
