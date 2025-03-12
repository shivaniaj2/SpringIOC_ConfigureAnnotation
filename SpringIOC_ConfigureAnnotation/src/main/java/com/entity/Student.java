package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	@Value("1")
	private int stud_id;
	@Value("Aish")
	private String stud_name;
	@Value("96.9")
	private float stud_percentage;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stud_id, String stud_name, float stud_percentage) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_percentage = stud_percentage;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public float getStud_percentage() {
		return stud_percentage;
	}
	public void setStud_percentage(float stud_percentage) {
		this.stud_percentage = stud_percentage;
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_percentage=" + stud_percentage
				+ "]";
	}
}
