package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DBConnections {

public static SessionFactory getConnection(){ 
	
	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();  
	return sf;
}
	
	
}
