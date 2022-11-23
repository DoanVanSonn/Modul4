package codegym.vn.service;

import codegym.vn.bean.Student;

import java.util.List;

public interface StudentService {
        void createOrUpdate(Student s);
        Student findById(String id);
        List<Student> findall();
        void deleteById(String id);
}
