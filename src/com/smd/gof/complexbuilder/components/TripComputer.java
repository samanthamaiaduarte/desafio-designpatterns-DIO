package com.smd.gof.complexbuilder.components;

import com.smd.gof.complexbuilder.cars.Car;

public class TripComputer {
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void showFuel() {
		System.out.println("Fuel level: " + car.getFuel());
	}
	
	public void showStatus() {
		if(this.car.getEngine().isStarted())
			System.out.println("Car " + car.getCarType().toString() + " is started");
		else
			System.out.println("Car isn't started");
	}
}
