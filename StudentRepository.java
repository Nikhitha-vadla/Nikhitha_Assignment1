package repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entity.Student;

public class StudentRepository implements StudentRepo {

	List<Student> studentList;

	public StudentRepository(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}

	@Override
	public List<Student> add1(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent1(long rno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> add(Student student) {
		studentList.add(student);
		return studentList;
	}

	@Override
	public Student getStudent(long rno) {
		Iterator<Student> itr = studentList.iterator();
		Student student = null;
		boolean found = false;
		while (itr.hasNext()) {
			student = itr.next();
			if (student.getRno() == rno) {
				found = true;
				break;
			}
		}
		if (found)
			return student;
		else
			return null;
	}

	@Override

	public List<Student> getAll1() {

		return studentList;
	}
}
