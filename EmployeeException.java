package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yout Salary");
		long Salary = sc.nextLong();

		try {

			if (Salary < 3000) {

				System.out.println("Salary is Less" + Salary);

			}
			System.out.println("Salary is high");
		} catch (Exception e) {

		}
	}

}
