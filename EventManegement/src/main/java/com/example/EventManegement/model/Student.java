package com.example.EventManegement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {
    @Id
    private Integer StudentId;
   private String firstName;
   private String lastNname;
    private  Integer age;
         private String  department;

    public Student(Integer studentId, String firstName, String lastNname, Integer age, String department) {
        StudentId = studentId;
        this.firstName = firstName;
        this.lastNname = lastNname;
        this.age = age;
        this.department = department;
    }

    public Student() {
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNname() {
        return lastNname;
    }

    public void setLastNname(String lastNname) {
        this.lastNname = lastNname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
