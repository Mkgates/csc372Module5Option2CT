package csc372module5recursivesum;

import java.util.Scanner;

/**
 * CSC 372 Module 5 Option 2
 * RecursiveSum is a program that recursively calculates the sum
 * of five user-entered integers.
 */

public class RecursiveSum {

	public static int sumNumbers(int[] numbers, int index) {
		if (index == numbers.length) {
			return 0;
		}
		return numbers[index] + sumNumbers(numbers, index + 1);
	}
	
	public static void main (String[] args) {
		int[] nums = new int[5];
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			nums[i] = scnr.nextInt();
		}
		
		System.out.println("The sum is: " + sumNumbers(nums, 0));
		scnr.close();
		

	}

}
