package guviJavaprograms;

import java.util.Scanner;

public class FindEvennumber {
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner (System .in);
		
		 System.out.print("Enter an integer: ");
		 
		 int number =scanner.nextInt();
		 
		 scanner.close();
		 
		 if (number % 2 == 0) {
	            System.out.println(number + " is an even number.");
	        } else {
	            System.out.println(number + " is not a even number.");
	        }
		
	}

}
