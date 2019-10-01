package com.vir.model;

public class Passenger {
	private int passengerId,age,seatNo;
	private String passengerName,gender;
	private  float fare;
	public Passenger(int passengerId, int age, int seatNo, String passengerName, String gender, float fare) {
		super();
		this.passengerId = passengerId;
		this.age = age;
		this.seatNo = seatNo;
		this.passengerName = passengerName;
		this.gender = gender;
		this.fare = fare;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	public Passenger() {
		super();
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", age=" + age + ", seatNo=" + seatNo + ", passengerName="
				+ passengerName + ", gender=" + gender + ", fare=" + fare + "]";
	}
	
 	
}
