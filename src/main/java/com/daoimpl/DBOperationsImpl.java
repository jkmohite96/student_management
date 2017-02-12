package com.daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.DBOperations;
import com.entities.AdressEntity;
import com.entities.MarksEntity;
import com.entities.StudentEntity;
import com.util.DBConnections;

public class DBOperationsImpl implements DBOperations {
	Scanner sc = new Scanner(System.in);	
	
	public void addStudent()
	{
		
		System.out.println(" enter Student Firstname");
		String sfname = sc.next();
		System.out.println(" enter Student Lastname");
		String slname = sc.next();
		System.out.println(" enter Student Age");
		int sage = sc.nextInt();
		System.out.println(" enter Student gender");
		String sgender = sc.next();
		System.out.println(" enter Student Standerd");
		String standard = sc.next();

		//Adress Details
		
		System.out.println(" enter Student street");
		String sstreet = sc.next();
		System.out.println(" enter Student city");
		String scity = sc.next();
		System.out.println(" enter Student state");
		String sstate = sc.next();
		System.out.println(" enter Student zipcode");
		int szip = sc.nextInt();
		
		//Marks Details
		MarksEntity mark = new MarksEntity();
		
		System.out.println(" enter marks of sub1 :");
		mark.setSub1(sc.nextInt());
		
		System.out.println(" enter marks of sub2 :");
		mark.setSub2(sc.nextInt());

		System.out.println(" enter marks of sub3 :");
		mark.setSub3(sc.nextInt());
		
		AdressEntity adress = new AdressEntity(sstreet, scity, sstate, szip);
		
		Session session = DBConnections.getConnection().openSession();
		Transaction tx = session.beginTransaction();

		StudentEntity student = new StudentEntity(sfname, slname, sgender, sage, standard, adress, mark);
		
		session.save(student);
		session.flush();
		tx.commit();
		
	}

	public void updateStudent() {
		
		Session session = DBConnections.getConnection().openSession();
		Transaction tx = session.beginTransaction();

		SQLQuery query = (SQLQuery) session.getNamedQuery("UPDATE_STUDENT");
		

		
	
	}

	public void deleteStudent() {

		
	}

	public List getAllStudents() {
		
		Session session = DBConnections.getConnection().openSession();
		Transaction tx = session.beginTransaction();

		SQLQuery query = (SQLQuery) session.getNamedQuery("SHOW_ALL_STUDENTS");
		query.addEntity(StudentEntity.class);
		List <StudentEntity> stds = query.list();    
		for (StudentEntity studentEntity : stds) {
			System.out.println("sasasasas");
			System.out.println(studentEntity);
		}
		
		tx.commit();
		session.flush();
		session.close();
		return null;
		
	}

}
