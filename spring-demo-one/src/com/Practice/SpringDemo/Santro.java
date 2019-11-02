package com.Practice.SpringDemo;

public class Santro implements Car{
	
	CarClass carClass;
	
	@Override
	public String getCarDetails() {
		return "Santro";
	}
	
	public void start() {
		System.out.println("In start method of Santro Class");
	}
	
	public void stop() {
		System.out.println("In stop method of Santro Class");
	}
	public void setCarClass(CarClass carclass) {
		this.carClass = carclass;
	}
	
	public String getCarClass() {
		return carClass.getCarClass();
	}
}
