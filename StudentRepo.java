package repository;
import java.util.List;

import entity.Student;


public interface StudentRepo {

        List<Student> add(Student student);

        Student getStudent(long rno);

        List<Student> getAll();

		List<Student> add1(Student student);

		Student getStudent1(long rno);

		List<Student> getAll1();

}
