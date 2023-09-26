package com.example.EventManegement.controller;

import com.example.EventManegement.model.Events;
import com.example.EventManegement.service.ServiceEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EventController {
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
    @DeleteMapping("delete")
    public void del()
    {
        serviceEvent.del();
    }
}
