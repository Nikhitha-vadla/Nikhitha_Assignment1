package service;

import java.util.List;

import entity.Student;

import repository.StudentRepo;

import repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	private StudentRepo repo;

	public StudentServiceImpl(List<Student> studentList) {

		repo = new StudentRepository(studentList);
	}

	@Override
	public List<Student> add(Student student) {
		return repo.add(student);
	}

	@Override
	public Student getStudent(long rno) {
		return repo.getStudent(rno);
	}

	@Override
	public List<Student> getAll() {
		return repo.getAll();

	}
}
