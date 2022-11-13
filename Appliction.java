package app;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

import entity.Student;

import service.StudentService;

import service.StudentServiceImpl;

public class Appliction {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		StudentService service = new StudentServiceImpl(studentList);
		int option = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("1. Add Student ");
		System.out.println("2. Get Student Details of ");
		System.out.println("3. Get All Student Details ");
		System.out.println("4. Exit");
		System.out.println("Enter your option ");
		option = scan.nextInt();

		long rno = 0;
		switch (option) {

		case 1:

			String firstName = null;
			String lastName = null;
			String address = null;
			System.out.println("Enter Student Roll No ");
			rno = scan.nextLong();
			scan.nextLine();
			System.out.println("Enter Student First Name ");
			firstName = scan.nextLine();
			System.out.println("Enter Student Last Name  ");
			lastName = scan.nextLine();
			System.out.println("Enter Student Address  ");
			address = scan.nextLine();
			Student student = new Student(rno, firstName, lastName, address);
			studentList = service.add(student);
			studentList.stream().forEach(System.out::println);
			break;

		case 2:

			System.out.println("Enter Student Roll No ");
			rno = scan.nextLong();
			Student requestedStudent = service.getStudent(rno);
			System.out.println(requestedStudent);
			break;

		case 3:
			studentList = service.getAll();
			studentList.stream().forEach(System.out::println);
			break;

		case 4:
			System.out.println("Thank your for using app ");
			break;

		default:

			System.out.println("Invalid choice Retry");
		}

		scan.close();

	}

}
