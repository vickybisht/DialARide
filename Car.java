package com.hackercode.utilities;

public class Car {
	private int capacity;
	private int location;
	private int revenue;
	
	private int []passengerlocation;
	public Car() {
		passengerlocation = new int[5];
		capacity = 5;
	}
	private int cartime;
	public int getCarTime() {
		return cartime;
	}
	public void setCarTime(int i) {
		this.cartime = i;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	public int[] getPassengerlocation() {
		return passengerlocation;
	}
	public void setPassengerlocation(int[] passengerlocation) {
		this.passengerlocation = passengerlocation;
	}
	public void Passengerlocationreset() {
		for(int i=0;i<10;i++) {
			passengerlocation[i]=0;
		}
		
	}
	
}
