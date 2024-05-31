package com.smd.gof.simplebuilder;

import java.time.LocalDate;

public class Application {

	public static void main(String[] args) {
		Person john = new Person.builder()
										.name("John")
										.surname("Green")
										.nickname("Johnny")
										.document("12345678900")
										.birthDate(LocalDate.of(1990, 5, 5))
										.email("johngreen@gmail.com")
										.build();
		
		System.out.println(john);
	}

}
