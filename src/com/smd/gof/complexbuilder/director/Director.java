package com.smd.gof.complexbuilder.director;

import com.smd.gof.complexbuilder.builders.CarBuilder;
import com.smd.gof.complexbuilder.cars.Car;
import com.smd.gof.complexbuilder.cars.CarType;
import com.smd.gof.complexbuilder.components.Engine;
import com.smd.gof.complexbuilder.components.Transmission;
import com.smd.gof.complexbuilder.components.TripComputer;

public class Director {
	
	public Car constructSportCar(Integer seats, Double volume, Transmission transmission) {
		CarBuilder builder = new CarBuilder();
		return builder
				.carType(CarType.SPORT)
				.seats(seats)
				.engine(new Engine(volume))
				.transmission(transmission)
				.tripComputer(new TripComputer())
				.build();
	}
	
	public Car constructCityCar(Double volume, Transmission transmission) {
		CarBuilder builder = new CarBuilder();
		return builder
				.carType(CarType.CITY)
				.seats(5)
				.engine(new Engine(volume))
				.transmission(transmission)
				.tripComputer(new TripComputer())
				.build();
	}
	
	public Car constructSUV(Double volume, Transmission transmission) {
		CarBuilder builder = new CarBuilder();
		return builder
				.carType(CarType.SUV)
				.seats(7)
				.engine(new Engine(volume))
				.transmission(transmission)
				.tripComputer(new TripComputer())
				.build();
	}
	
}
