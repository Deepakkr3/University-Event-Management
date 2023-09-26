package com.example.EventManegement.service;

import com.example.EventManegement.model.Student;
import com.example.EventManegement.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceStudent {
    @Autowired
    StudentRepo studentRepo;

    public String addStudents(List<Student> myStudent) {
        studentRepo.saveAll(myStudent);
        return "added students";
    }

    public String updateById(Integer id, String dept) {
        if(studentRepo.existsById(id)){
            Student s=studentRepo.findById(id).orElse(null);
            s.setDepartment(dept);
            studentRepo.save(s);
            return " sucsessfull updated";
        }
        return " id not vailid";
    }

    public List<Student> getAll() {
        return (List<Student>)studentRepo.findAll();
    }

    public Student getStudent(Integer id) {
        return studentRepo.findById(id).orElse(null);

    }



    public String delet() {
        studentRepo.deleteAll();
        return " all student has been deleted";
    }
}
