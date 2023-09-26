package com.example.EventManegement.repo;

import com.example.EventManegement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepo extends CrudRepository<Student,Integer> {
}
