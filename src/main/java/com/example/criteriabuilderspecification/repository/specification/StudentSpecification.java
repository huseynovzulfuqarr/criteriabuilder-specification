package com.example.criteriabuilderspecification.repository.specification;

import com.example.criteriabuilderspecification.model.Student;
import org.springframework.data.jpa.domain.Specification;

public class StudentSpecification {
    public static Specification<Student> likeName(String name) {
        if (name == null) {
            return null;
        }
        return (root, query, cb) -> {
            return cb.like(root.get("name"), "%" + name + "%");
        };
    }

    public static Specification<Student> likeSurName(String surname) {
        if (surname == null) {
            return null;
        }
        return (root, query, cb) -> {
            return cb.like(root.get("surname"), "%" + surname + "%");
        };
    }

    public static Specification<Student> equalEmail(String gmail) {
        if (gmail == null) {
            return null;
        }
        return (root, query, cb) -> {
            return cb.equal(root.get("gmail"), gmail);
        };
    }
}
