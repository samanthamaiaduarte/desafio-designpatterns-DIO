package com.smd.gof.complexbuilder.cars;

import com.smd.gof.complexbuilder.components.Engine;
import com.smd.gof.complexbuilder.components.Transmission;
import com.smd.gof.complexbuilder.components.TripComputer;

public class Car {
	private final CarType carType;
	private final Integer seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private double fuel;
	
	public Car(CarType carType, Integer seats, Engine engine, Transmission transmission, TripComputer tripComputer) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		this.fuel = 0;
	}
	
	public CarType getCarType() {
		return carType;
	}
	
	public Integer getSeats() {
		return seats;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Transmission getTransmission() {
		return transmission;
	}
	
	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public double getFuel() {
		return this.fuel;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
}
