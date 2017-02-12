package com.entities;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_TABLE")

@NamedNativeQueries({
	@NamedNativeQuery(name = "UPDATE_STUDENT",query = "update STUDENT_TABLE set FNAME = ?, LNAME = ?,GENDER= ?,AGE= ?,STANDERD= ?, STREET = ?,CITY= ?,STATE= ?,ZIP= ?,sub1= ?,sub2= ?,sub3= ?"),
	@NamedNativeQuery(name = "SHOW_ALL_STUDENTS", query = "select * from STUDENT_TABLE"),
	@NamedNativeQuery(name = "DELETE_STUDENT", query = "delete from STUDENT_TABLE where id = ?")
})
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;

	@Column(name = "FNAME")
	private String fname;
	
	@Column(name = "LNAME")
	private String lname;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "STANDERD")
	private String standerd;
	
	@Embedded
	private AdressEntity studentAdress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MarksEntity marks;


	public StudentEntity() {
	}


	public StudentEntity(String fname, String lname, String gender, int age, String standerd,
			AdressEntity studentAdress, MarksEntity marks) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.standerd = standerd;
		this.studentAdress = studentAdress;
		this.marks = marks;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getStanderd() {
		return standerd;
	}


	public void setStanderd(String standerd) {
		this.standerd = standerd;
	}


	public AdressEntity getStudentAdress() {
		return studentAdress;
	}


	public void setStudentAdress(AdressEntity studentAdress) {
		this.studentAdress = studentAdress;
	}


	public MarksEntity getMarks() {
		return marks;
	}


	public void setMarks(MarksEntity marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age="
				+ age + ", standerd=" + standerd + ", studentAdress=" + studentAdress + ", marks=" + marks
				+ ", getId()=" + getId() + ", getFname()=" + getFname() + ", getLname()=" + getLname()
				+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + ", getStanderd()=" + getStanderd()
				+ ", getStudentAdress()=" + getStudentAdress() + ", getMarks()=" + getMarks() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
