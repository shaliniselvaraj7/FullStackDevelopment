package com.example.StudentManagementDbConn.Repository;

import com.example.StudentManagementDbConn.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
