package com.smd.gof.simplebuilder;

import java.time.LocalDate;

public class Person {
	private String name;
	private String surname;
	private String nickname;
	private String document;
	private LocalDate birthDate;
	private String email;
	
	private Person(String name, String surname, String nickname, String document, LocalDate birthDate, String email) {
		this.name = name;
		this.surname = surname;
		this.nickname = nickname;
		this.document = document;
		this.birthDate = birthDate;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBithDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", nickname=" + nickname + ", document=" + document
				+ ", birthDate=" + birthDate + ", email=" + email + "]";
	}

	static class builder {
		private String name;
		private String surname;
		private String nickname;
		private String document;
		private LocalDate birthDate;
		private String email;
		
		public builder name(String name) {
			this.name = name;
			return this;
		}
		
		public builder surname(String surname) {
			this.surname = surname;
			return this;
		}
		
		public builder nickname(String nickname) {
			this.nickname = nickname;
			return this;
		}
		
		public builder document(String document) {
			this.document = document;
			return this;
		}
		
		public builder birthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
			return this;
		}
		
		public builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Person build() {
			return new Person(name, surname, nickname, document, birthDate, email);
		}
		
	}	
}
