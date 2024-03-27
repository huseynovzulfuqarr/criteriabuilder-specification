package com.example.criteriabuilderspecification.repository.criteria;

import com.example.criteriabuilderspecification.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepositoryCustomImpl implements StudentRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> search(String name, String surname, String gmail) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery=criteriaBuilder.createQuery(Student.class);
        Root<Student> studentRoot=criteriaQuery.from(Student.class);

        Predicate namePredicate = criteriaBuilder.like(studentRoot.get("name"), "%" + name + "%");
        Predicate surNamePredicate = criteriaBuilder.like(studentRoot.get("surname"), "%" + surname + "%");
        Predicate emailPredicate = criteriaBuilder.equal(studentRoot.get("email"), gmail);

        criteriaQuery.where(namePredicate, surNamePredicate, emailPredicate);


        TypedQuery<Student> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
