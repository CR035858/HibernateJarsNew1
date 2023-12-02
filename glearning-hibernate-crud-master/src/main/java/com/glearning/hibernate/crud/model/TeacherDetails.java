package com.glearning.hibernate.crud.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher_details")
public class TeacherDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	private String adhaarNumber;
	
	private LocalDate dob;
	
	private String city;
	
	/*@OneToOne
	@JoinColumn(name="teacher_id")
	private Teacher teacher;*/
	
	
	@OneToOne(mappedBy ="teacherDetails",cascade=CascadeType.ALL)
	private Teacher teacher;
	
	//@MapsId // copy the primary key value to this column
	TeacherDetails(){}
	public TeacherDetails(String adhaarNumber, LocalDate dob, String city){
		this.adhaarNumber = adhaarNumber;
		this.dob = dob;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdhaarNumber() {
		return adhaarNumber;
	}

	public void setAdhaarNumber(String adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "TeacherDetails [id=" + id + ", adhaarNumber=" + adhaarNumber + ", dob=" + dob + ", city=" + city + "]";
	}

}
