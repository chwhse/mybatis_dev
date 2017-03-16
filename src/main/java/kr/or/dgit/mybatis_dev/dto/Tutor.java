package kr.or.dgit.mybatis_dev.dto;

import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private List<Course> courses;
	private Gender gender;
	
	public Tutor() {}
	public Tutor(int tutorId, String name, String email,  Gender gender) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public Tutor(int tutorId, String name, String email, PhoneNumber phone, List<Course> courses, Gender gender) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.courses = courses;
		this.gender = gender;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s %s %s %s", tutorId, name, email,
				phone, courses, gender);
	}
	
	
}
