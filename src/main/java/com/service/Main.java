package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.dao.DBOperations;
import com.daoimpl.DBOperationsImpl;
import com.entities.AdressEntity;
import com.entities.StudentEntity;
import com.util.DBConnections;
 
public class Main {
 
public static void main(String[] args) {
	
DBOperationsImpl d = new DBOperationsImpl();
//d.addStudent();
d.getAllStudents();	
}
 

}
