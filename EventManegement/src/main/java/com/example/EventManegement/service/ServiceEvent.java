package com.example.EventManegement.service;

import com.example.EventManegement.model.Events;
import com.example.EventManegement.repo.EventRepo;
import com.example.EventManegement.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceEvent {
    @Autowired
    EventRepo eventRepo;

    public String addEvents(List<Events> myev) {
        eventRepo.saveAll(myev);
        return " events has been added";
    }

    public String updateEvent(Integer id, String name) {
        if(eventRepo.existsById(id))
        {
            Events e=eventRepo.findById(id).orElse(null);
            e.setEventName(name);
            eventRepo.save(e);
            return " sucsessfuly updated";
        }
        return "id not matched";
    }

    public List<Events> getE() {
        return (List<Events>)eventRepo.findAll();
    }

    public void del() {
        eventRepo.deleteAll();
    }
}
