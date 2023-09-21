package guviJavaprograms;

import java.util.Scanner;

public class Sumcomparison {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of 'b': ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of 'c': ");
        int c = scanner.nextInt();

        System.out.print("Enter the value of 'd': ");
        int d = scanner.nextInt();

        scanner.close();

        if (a + b > c + d) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        } else {
            System.out.println("The sum of a and b is not greater than the sum of c and d.");
        }
    }

}
