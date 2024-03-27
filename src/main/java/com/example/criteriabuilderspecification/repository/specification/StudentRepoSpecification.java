package com.example.criteriabuilderspecification.repository.specification;

import com.example.criteriabuilderspecification.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepoSpecification extends JpaRepository<Student,Long>, JpaSpecificationExecutor<Student> {

}
