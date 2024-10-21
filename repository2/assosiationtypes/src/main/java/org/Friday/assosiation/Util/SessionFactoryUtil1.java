package org.Friday.assosiation.Util;

import org.Friday.assosiationtype.manytomany.MilkBrand;
import org.Friday.assosiationtype.manytomany.MilkProduct;
import org.Friday.assosiationtype.manytoone.IPLTeams;
import org.Friday.assosiationtype.manytoone.Players;
import org.Friday.assosiationtype.onetomany.BankDetails;
import org.Friday.assosiationtype.onetomany.Customer;
import org.Friday.assosiationtype.onetoone.Robot;
import org.Friday.assosiationtype.onetoone.RobotInformation;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil1 {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory1() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.setProperties(SqlConnectionUtil.getMysqlDataBaseProperties());
			
			configuration.addAnnotatedClass(Customer.class);//one to many
			configuration.addAnnotatedClass(BankDetails.class);//one to many
			
			configuration.addAnnotatedClass(Robot.class);//one to one
			configuration.addAnnotatedClass(RobotInformation.class);//one to one
			
			configuration.addAnnotatedClass(IPLTeams.class);//many to one
			configuration.addAnnotatedClass(Players.class);//many to one
			
			configuration.addAnnotatedClass(MilkBrand.class); // many to many
			configuration.addAnnotatedClass(MilkProduct.class); // many to many
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}

}
