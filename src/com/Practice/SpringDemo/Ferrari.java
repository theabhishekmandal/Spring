package com.Practice.SpringDemo;

public class Ferrari implements Car{
	
	CarClass carClass;
	
	@Override
	public String getCarDetails() {
		return "Ferrari";
	}
	
	public void setCarClass(CarClass carclass) {
		this.carClass = carclass;
	}
	
	public String getCarClass() {
		return carClass.getCarClass();
	}
}
