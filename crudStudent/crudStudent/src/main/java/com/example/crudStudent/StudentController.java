package com.example.crudStudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping

    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/{rno}")
        public Student getStudentByRno(@PathVariable int rno){
            return studentService.getStdByRno(rno);
        }
        @PostMapping
            public String addStudent(@RequestBody Student student){
            studentService.addStudent(student);
            return "SUCCESS";
        }
        @PutMapping
    public String updateStudent(@RequestBody Student student){
        return studentService.updatestudent(student);
        }
        @DeleteMapping("/{rno}")
    public String deleteStudent(@PathVariable int rno){
        return studentService.deletestudent(rno);
        }
    }

