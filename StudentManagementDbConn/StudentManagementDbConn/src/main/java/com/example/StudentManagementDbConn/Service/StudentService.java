package com.example.StudentManagementDbConn.Service;

import com.example.StudentManagementDbConn.Entity.Student;
import com.example.StudentManagementDbConn.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStdByRno(int rno) {
        return repository.findById(rno).orElse(null);
    }

    public void addStudent(Student student) {
        repository.save(student);
    }
    public String updatestudent(Student student) {
        if(repository.existsById(student.getRno())){
            repository.save(student);
            return "Update done";
        }
        return "No Student data Exist";
    }

    public String deleteStudent(int rno) {
        if(repository.existsById(rno)){
            repository.deleteById(rno);
            return "Student deleted successfully";
        }
        return "No data exist";
    }
}
