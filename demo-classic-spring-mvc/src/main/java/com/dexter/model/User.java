package com.dexter.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
	private String name;
	private int age;

	private String email;

	private LocalDate doj;

	private String gender;

	private boolean employed;

	private String creditCardNumber;

	private long employeeId;

	private float salary;

	private LocalDateTime updatedOn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isEmployed() {
		return employed;
	}

	public void setEmployed(boolean employed) {
		this.employed = employed;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				", email='" + email + '\'' +
				", dob=" + doj +
				", gender='" + gender + '\'' +
				", employed=" + employed +
				", creditCardNumber='" + creditCardNumber + '\'' +
				", employeeId=" + employeeId +
				", salary=" + salary +
				", updatedOn=" + updatedOn +
				'}';
	}
}
