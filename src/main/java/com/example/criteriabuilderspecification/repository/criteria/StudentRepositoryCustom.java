package com.example.criteriabuilderspecification.repository.criteria;

import com.example.criteriabuilderspecification.model.Student;

import java.util.List;

public interface StudentRepositoryCustom {
    List<Student> search(String name,String surname,String gmail);
}
