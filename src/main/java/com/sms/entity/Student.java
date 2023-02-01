package com.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_system")
public class Student {
	
	@Id
	private int id;
	private String name;
	private String classroom;
	private String email;
	private int age;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String classroom, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.classroom = classroom;
		this.email = email;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {

		return "id: " + id +"\t" + "name: "+name+"\t"+"classroom: "+classroom+"\t"+"email: "+email+"\t"+"age: "+age;
		
	}
	
}
