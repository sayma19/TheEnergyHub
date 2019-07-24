package training.sample.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import training.sample.model.LoginClass;

@Repository
public class LoginDao {
	

	@Autowired
	SessionFactory sf;
	Scanner sc=new Scanner(System.in);
	
	 public void insertlog(LoginClass log) {
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(log);
		tx.commit();
		s.close();
		
	}
}
