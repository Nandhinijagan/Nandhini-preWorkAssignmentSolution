import java.util.Scanner;

public class PreWorkAssignment {

		Scanner sc = new Scanner(System.in);

	      //function to checkPalindrome
	       public void checkPalindrome()  {
	    	   int r, sum = 0, temp;
	    	   System.out.println("Enter a number to check if a its palindrome:");
	    	   int number = sc.nextInt();
	    	   temp = number;
	    	   while (number > 0){
	    	   	r = number % 10;
	    	   	sum = (sum*10)+r;
	    	   	number= number/10;
	    	   }

	    	   if (temp == sum){
	    	   	System.out.println(temp+" is a palindrome");
	    	   }else{
	    	   	System.out.println(temp+" is not a palindrome");
	    	   }
	      }

	   //function to printPattern
	      public void printPattern() {
	       	System.out.println("Enter a number to show the star pattern:");
	    	int input = sc.nextInt();
	       	int i, j;
	       	for(i=input+1; i>=1; i--){
       		  for(j=input+1; j>i; j--){
        		System.out.printf("*");
    		  }
			  System.out.printf("\n");
	     	}
	  	}

	  //function to check no is prime or not
	        public void checkPrimeNumber() {
	        	System.out.println("Enter a number to check if prime number or not:");
	    		int num = sc.nextInt();
    			boolean flag = false;
    			for (int i = 2; i <= num / 2; ++i) {
      				// condition for nonprime number
      				if (num % i == 0) {
        				flag = true;
        				break;
      				}
    			}
			    if (!flag){
			      System.out.println(num + " is a prime number.");
			    }
			    else{
			      System.out.println(num + " is not a prime number.");
			    }
	        }

	  // function to print Fibonacci Series
	       public void printFibonacciSeries() {
				System.out.println("Enter a number to check if its Fibonacci series:");
	    		int count = sc.nextInt();
	    		//initialize the first and second value as 0,1 respectively.
	    		int first = 0, second = 1, sum;
	    		System.out.print(first+" "+second);//printing 0 and 1  
	           
	            for(int i = 2;i < count; ++i){
	            	sum = first + second;
	            	System.out.print(" "+sum);  
	            	first = second;
	            	second = sum;
	            }
	            System.out.println(" ");
	          }

	//main method which contains switch and do while loop
	      public static void main(String[] args) {
	    	PreWorkAssignment obj = new PreWorkAssignment();
	        int choice;
	        Scanner sc = new Scanner(System.in);

				do {
					System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

					System.out.println();
					choice = sc.nextInt();

					switch (choice) {
					case 0:
						choice = 0;
						break;
					case 1: {
						obj.checkPalindrome();
					}
					break; 
					case 2: {
						obj.printPattern();
					}
					break;
					case 3: {
						obj.checkPrimeNumber();
					}
					break;
					case 4: {
						obj.printFibonacciSeries();
					}
					break;
					default:
						System.out.println("Invalid choice. Enter a valid no.\n");
				}} while (choice != 0);
				System.out.println("Exited Successfully!!!");
				sc.close();
	}
}

