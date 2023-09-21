package guviJavaprograms;

import java.util.Scanner;

public class PrintAtoZ {
public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter the starting character (A-Z): ");
     char startChar = scanner.next().charAt(0);
     
     System.out.print("Enter the ending character (A-Z): ");
     char endChar = scanner.next().charAt(0);
     
     if (startChar >= 'A' && startChar <= 'Z' && endChar >= 'A' && endChar <= 'Z') {
         for (char ch = startChar; ch <= endChar; ch++) {
             System.out.print(ch + " ");
         }
         System.out.println();
     } else {
         System.out.println("Invalid input. Please enter characters between 'A' and 'Z'.");
     }

     scanner.close();

     
}
	
	
}
