package codeSignal;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the maximum number of the the factorial number");
		int num = input.nextInt();
		if (num == 0) {
			System.out.println(num = 1);
		}

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
			System.out.println("factorial of " + num + " is : " + factorial);

	}

}
