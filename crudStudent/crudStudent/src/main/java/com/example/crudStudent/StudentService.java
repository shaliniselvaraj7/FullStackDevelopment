package com.example.crudStudent;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();
    public StudentService(){
        students.add(new Student (1,"Akash","AI"));
        students.add(new Student(2,"Bala","Blockchain"));

    }
    public List<Student> getStudents(){
        return students;
    }
    public Student getStdByRno(int rollno){
        for(Student student : students){
            if(student.getRno() == rollno){
                return student;
            }
        }
        return null;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public String updatestudent(Student student){
        for(int i =0; i<students.size(); i++){
            if(students.get(i).getRno()==student.getRno()){
                students.set(i,student);
                return "Update done";
            }

        }
        return "No Student data exist";
    }
    public String deletestudent(int rno){
        for(int i =0; i<students.size(); i++){
            if(students.get(i).getRno()==rno){
                students.remove(i);
                return "Student deleted successfully";
            }
        }
        return "No data exist";
    }

}
