package com.corsojava.helloapi.model;

public class Saluto {
	private int id;
	private String message;
	
	public Saluto(String name) {
		super();
		this.id=1;
		this.message = "Ciao "+ name+"!";
	}
	
	public Saluto() {
		super();
		this.id=1;
		this.message = "Ciao!";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
