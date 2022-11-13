package service;

import java.util.List;
import entity.Student;

public interface StudentService {

	List<Student> add(Student student);

	Student getStudent(long rno);

	List<Student> getAll();

}
