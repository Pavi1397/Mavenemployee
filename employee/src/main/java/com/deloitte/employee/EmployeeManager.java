package com.deloitte.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeManager {

	public static void main(String[] args) {
				SessionFactory sf = new Configuration().
									configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();

					Employee emp = new Employee(105,"Mary",6700);
				
					Session ssn = sf.openSession();
					Transaction tx = ssn.beginTransaction();
					ssn.save(emp);
					tx.commit();
					ssn.close();

	}

}
