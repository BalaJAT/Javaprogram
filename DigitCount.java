package guviJavaprograms;

import java.util.Scanner;

public class DigitCount {
	   public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
 
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        scanner.close();
	      
	        String numberStr = Integer.toString(number);
	 
	        int digitCount = numberStr.length();

	        System.out.println("Number of digits: " + digitCount);
	    }

}
