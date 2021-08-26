package com.greatlearning.main;

import com.greatlearning.models.Customer;
import com.greatlearning.services.BankingService;

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingService bankingService = new  BankingService();

	Customer customer1 = new Customer("password", 123456, 1888);
//	Customer customer2 = new Customer(password: "abc", bankAccountNo: 12346);

	Scanner sc = new Scanner(System.in);
	String password;
	int bankAccountNo;
	
	System.out.println("Welcome to the login page");
	System.out.println();
	System.out.println("Enter your account number");
	bankAccountNo=sc.nextInt();
	System.out.println("Enter your password");
	password=sc.next();
	
	Customer loggedInCustomer = new Customer(password, bankAccountNo, bankAccountNo);
	loggedInCustomer.setPassword(password);
	loggedInCustomer.setBankAccountNo(bankAccountNo);
	
	if(validateCustomer(loggedInCustomer, customer1)) {
		loggedInCustomer = customer1;
		int option=0;
		do {
			System.out.println();
			System.out.println("============");
			System.out.println("1. Deposit");
			System.out.println("2.Withdrawal");
			System.out.println("3. Transfer");
			System.out.println("4. Logout");
			System.out.println("========");
			option = sc.nextInt();
switch(option) {
case 0:
	option = 0;
	bankingService.logout();
	break;
case 1:
	bankingService.deposit(loggedInCustomer);
	break;
case 2:
	bankingService.withdrwal(loggedInCustomer,  "withdrwal");
	break;
case 3:
	bankingService.transfer(loggedInCustomer);
	break;	
case 4:
	bankingService.logout1();
	break;		
	}
}while(option!=0);
	}
	else {
		System.out.println("");
	}
	}

	private static boolean validateCustomer(Customer loggedInCustomer, Customer customer1) {
		// TODO Auto-generated method stub
		return loggedInCustomer.getBankAccountNo()== customer1.getBankAccountNo() && loggedInCustomer.getPassword().equals(customer1.getPassword());
	}

}
