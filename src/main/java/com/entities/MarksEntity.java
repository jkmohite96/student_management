package com.entities;

import javax.persistence.*;

@Entity
@Table(name = "MARKS_TABLE")
public class MarksEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int mId;
	
	@Column
	private int sub1;
	
	@Column
	private int sub2;
	
	@Column
	private int sub3;
	//private float avg;

	@OneToOne(mappedBy = "marks")
	private StudentEntity std;
	
	public StudentEntity getStd() {
		return std;
	}

	public void setStd(StudentEntity std) {
		this.std = std;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	

}
