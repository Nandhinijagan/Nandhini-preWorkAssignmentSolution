package com.greatlearning.services;

import java.util.Scanner;

import com.greatlearning.models.Customer;
import com.greatlearning.services.OTPService;

public class BankingService {
int bankBalance = 1000;
Scanner sc = new Scanner(System.in);

public void logout() {
	System.out.println("=====Thanking for banking with us=====");
}

public void deposit(Customer customer) {
	int amount;
	System.out.println("Enter the deposit amount");
	amount = sc.nextInt();
	if(amount > 0) {
		System.out.println("Amount deposited successfully");
		customer.setBalance(customer.getBalance()+amount);
		System.out.println("Remaining balance is ::"+ customer.getBalance());
	}else {
		System.out.println("please provide valid input");
	}
	
}

public void withdrwal(Customer customer, String operation) {
	// TODO Auto-generated method stub
	
	int amount;
	System.out.println("Enter the amount to be"+ operation);
	amount = sc.nextInt();
	if(customer.getBalance() > amount) {
		if (operation=="withdrwal"){
            System.out.println("Amount deducted successfully");
            }
        else {
            System.out.println("Amount transferred successfully");
        }
		customer.setBalance(customer.getBalance()-amount);
		System.out.println("Remaining balance is ::"+ customer.getBalance());
	}else {
		System.out.println("please provide valid input");
	}
}

public void logout1(){
    System.out.println("--------------------Thank you from banking with us-----------------------------");
}

public void transfer(Customer customer) {
	// TODO Auto-generated method stub
	
	int amount;
	int otp;
	int otpGenerated;
	int toBeTransferredAccountNo;
	System.out.println("Enter OTP");
	OTPService OtpService = new OTPService();
	otpGenerated = OtpService.generateOTP();
	
	System.out.println("=======Generated OTP is ===="+ otpGenerated);
	otp = sc.nextInt();
	
	if(otp == otpGenerated) 
	{
		System.out.println("otp validattion succesfull");
		withdrwal(customer, "transfer");
//		System.out.println("Enter the amount to be transfer");
//		amount = sc.nextInt();
//		
//		System.out.println("Enter the account to be transfered");
//		toBeTransferredAccountNo = sc.nextInt();
//		
//		if(customer.getBalance() >= amount) {
//			System.out.println("Amount was transfered");
//			customer.setBalance(customer.getBalance()- amount);
//			System.out.println("Remaining balace is::"+ customer.getBalance());
			
		}else {
			System.out.println("Please provide valid input");
		}
	}

}
