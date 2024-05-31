package com.smd.gof.complexbuilder;

import com.smd.gof.complexbuilder.cars.Car;
import com.smd.gof.complexbuilder.components.Transmission;
import com.smd.gof.complexbuilder.director.Director;

public class Application {

	public static void main(String[] args) {
		Director director = new Director();
		
		Car sport = director.constructSportCar(2, 2.0, Transmission.MANUAL);
		sport.getTripComputer().setCar(sport);
		sport.setFuel(50.0);
		sport.getEngine().on();
		sport.getTripComputer().showStatus();
		
		Car city = director.constructCityCar(1.6, Transmission.SEMI_AUTOMATIC);
		city.getTripComputer().setCar(city);
		city.setFuel(45.0);
		city.getEngine().on();
		city.getTripComputer().showStatus();
		
		Car suv = director.constructSUV(3.0, Transmission.AUTOMATIC);
		suv.getTripComputer().setCar(suv);
		suv.setFuel(55.0);
		suv.getEngine().on();
		suv.getTripComputer().showStatus();

	}

}
