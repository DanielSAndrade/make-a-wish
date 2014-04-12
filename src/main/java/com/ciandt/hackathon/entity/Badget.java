package com.ciandt.hackathon.entity;

public class Badget {

	private String name;
	private long value;

	public Badget() {
		super();
	}

	public Badget(String name, long value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

}
