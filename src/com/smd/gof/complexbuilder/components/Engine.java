package com.smd.gof.complexbuilder.components;

public class Engine {
	private final double volume;
	private double odometer;
	private boolean started;
	
	public Engine(double volume) {
		this.volume = volume;
		this.odometer = 0;
	}
	
	public void on() {
		started = true;
	}
	
	public void off() {
		started = false;
	}
	
	public boolean isStarted() {
		return started;
	}
	
	public void go(double kilometer) {
		if(started) {
			this.odometer = kilometer;
		} else {
			System.err.println("Cannot go(), you must star engine first!");
		}
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double getOdometer() {
		return odometer;
	}
}
