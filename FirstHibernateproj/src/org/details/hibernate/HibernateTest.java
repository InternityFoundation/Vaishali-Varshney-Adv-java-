package org.details.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.student.details.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				UserDetails user=new UserDetails();
				user.setUserId(1);
				user.setUserName("vaishali");
				
			SessionFactory sf=	new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();//takes the configuration file
			Session session=sf.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			}
			

	}

