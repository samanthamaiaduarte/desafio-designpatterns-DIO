package com.smd.gof.complexbuilder.builders;

import com.smd.gof.complexbuilder.cars.Car;
import com.smd.gof.complexbuilder.cars.CarType;
import com.smd.gof.complexbuilder.components.Engine;
import com.smd.gof.complexbuilder.components.Transmission;
import com.smd.gof.complexbuilder.components.TripComputer;

public class CarBuilder {
	private CarType carType;
	private Integer seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	
	public CarBuilder carType(CarType carType) {
		this.carType = carType;
		return this;
	}
	
	public CarBuilder seats(Integer seats) {
		this.seats = seats;
		return this;
	}
	
	public CarBuilder engine(Engine engine) {
		this.engine = engine;
		return this;
	}
	
	public CarBuilder transmission(Transmission transmission) {
		this.transmission = transmission;
		return this;
	}
	
	public CarBuilder tripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
		return this;
	}
	
	public Car build() {
		return new Car(carType, seats, engine, transmission, tripComputer);
	}
}
