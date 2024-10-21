package org.Friday.assosiation.repository;

import org.Friday.assosiation.Util.SessionFactoryUtil1;
import org.Friday.assosiationtype.manytomany.MilkBrand;
import org.Friday.assosiationtype.manytoone.IPLTeams;
import org.Friday.assosiationtype.onetomany.Customer;
import org.Friday.assosiationtype.onetoone.Robot;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AssosiationRepository1 {

	public void saveCustomerDetails(Customer customer) {
		SessionFactory sessionFactory1 = SessionFactoryUtil1.getSessionFactory1();
		Session session = sessionFactory1.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(customer);
		transaction.commit();
	}
	public void saveRobotDetails(Robot robot) {
		SessionFactory sessionFactory1 = SessionFactoryUtil1.getSessionFactory1();
		Session session = sessionFactory1.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(robot);
		transaction.commit();
	}
	public void saveTeamInformation(IPLTeams iplteam) {
		SessionFactory sessionFactory1 = SessionFactoryUtil1.getSessionFactory1();
		Session session = sessionFactory1.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(iplteam);
		transaction.commit();

	}
	public void saveBrands(MilkBrand brand) {
		SessionFactory sessionFactory1 = SessionFactoryUtil1.getSessionFactory1();
		Session session = sessionFactory1.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(brand);
		transaction.commit();

	}
	
	
}
