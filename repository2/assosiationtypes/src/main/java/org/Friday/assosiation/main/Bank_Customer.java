package org.Friday.assosiation.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.Friday.assosiation.repository.AssosiationRepository1;
import org.Friday.assosiationtype.onetomany.BankDetails;
import org.Friday.assosiationtype.onetomany.Customer;

public class Bank_Customer {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter records how much you wank ?");
		int records=scan.nextInt();
		for(int i=1;i<=records;i++) {
		AssosiationRepository1 repository1 = new AssosiationRepository1();
		
		BankDetails bank1 = new BankDetails();
		bank1.setAccountNumber("457855478112");
		bank1.setAccountOpendate(new Date(21-02-1868));
		bank1.setAccountType("savings");
		bank1.setBankName("BankOfBaroda");
		bank1.setBankSector("private");
		bank1.setBranch("markapuram");
		
		BankDetails bank2= new BankDetails();
		bank2.setAccountNumber("457855478845");
		bank2.setAccountOpendate(new Date(13-05-2002));
		bank2.setAccountType("savings");
		bank2.setBankName("ICICI");
		bank2.setBankSector("private");
		bank2.setBranch("guntur");
		
		ArrayList<BankDetails> list = new ArrayList<BankDetails>();
		list.add(bank1);
		list.add(bank2);
		
		Customer cust1 = new Customer();
		cust1.setAddress("markapuram");
		cust1.setContact("+919618346935");
		cust1.setDateofBirth(new Date(01-01-2001));
		cust1.setName("Geetha");
		cust1.setPassword("geetha1234");
		cust1.setUserId("RCF541245");
		cust1.setBankdetailsList(list);
		repository1.saveCustomerDetails(cust1);
		
		}
	}
}
