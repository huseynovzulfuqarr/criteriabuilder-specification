package com.example.criteriabuilderspecification.repository.criteria;

import com.example.criteriabuilderspecification.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> ,StudentRepositoryCustom{
}
