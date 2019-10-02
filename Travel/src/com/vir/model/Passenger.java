package com.vir.model;

public class Passenger {
	private int passengerId,age;
	private String passengerName,gender,seatNo;
	private  float fare;
	public Passenger(int passengerId, int age, String passengerName, String gender, String seatNo, float fare) {
		super();
		this.passengerId = passengerId;
		this.age = age;
		this.passengerName = passengerName;
		this.gender = gender;
		this.seatNo = seatNo;
		this.fare = fare;
	}
	public Passenger() {
		super();
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
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", age=" + age + ", passengerName=" + passengerName
				+ ", gender=" + gender + ", seatNo=" + seatNo + ", fare=" + fare + "]";
	}
		
 	
}
