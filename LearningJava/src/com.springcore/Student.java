// package com.springcore;

public class Student {
	private int id;
	private String name;
	private String Address;
	
	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.Address = address;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAddress() {
		return Address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}