package com.example.EventManegement.controller;

import com.example.EventManegement.model.Events;
import com.example.EventManegement.model.Student;
import com.example.EventManegement.service.ServiceEvent;
import com.example.EventManegement.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    ServiceEvent serviceEvent;
    @PostMapping("addEvent")
    public String addEvents(@RequestBody List<Events> myev)
    {
        return serviceEvent.addEvents(myev);
    }
    @PutMapping("UpdatEvent/{id}/id/{name}/name")
    public String updateEvent(@PathVariable Integer id,@PathVariable String name)
    {
        return  serviceEvent.updateEvent(id,name);
    }
    @GetMapping("getEvents")
    public List<Events> getE()
    {
        return serviceEvent.getE();
    }
    @DeleteMapping("deleteEvents")
    public void del()
    {
        serviceEvent.del();
    }








    @Autowired
    ServiceStudent serviceStudent;
    @PostMapping("addStudents")
    public String addStudents(@RequestBody List<Student> myStudent)
    {
        return serviceStudent.addStudents(myStudent);
    }
    @PutMapping("update/student/department/{id}/id/{dept}/department")
    public String updateById(@PathVariable Integer id ,@PathVariable String dept)
    {
        return serviceStudent.updateById(id,dept);
    }
    @GetMapping("Get/all/students ")
    public List<Student> getAll()
    {
        return serviceStudent.getAll();
    }
    @GetMapping("GetStudentBy/{id}/Id")
    public Student getStudent(@PathVariable Integer id)
    {
        return serviceStudent.getStudent(id);
    }
    @DeleteMapping("deleteStudents")
    public String delet()
    {
        return serviceStudent.delet();
    }


}
