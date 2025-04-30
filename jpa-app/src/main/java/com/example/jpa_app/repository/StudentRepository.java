package com.example.jpa_app.repository;

import com.example.jpa_app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JPA Repository interface for Student entity.
 * Provides CRUD operations and custom query methods.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    /**
     * Find all students by their department.
     * @param department the department name
     * @return list of students in the specified department
     */
    List<Student> findByDepartment(String department);

    /**
     * Find all students by their semester.
     * @param semester the semester number
     * @return list of students in the specified semester
     */
    List<Student> findBySemester(int semester);
}
