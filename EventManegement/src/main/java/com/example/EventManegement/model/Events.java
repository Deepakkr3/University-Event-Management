package com.example.EventManegement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Component
@Entity
public class Events {
    @Id
   private Integer eventId;
       private String     eventName;
   private String locationOfEvent;
      private LocalDate date;
    private LocalDateTime startTime;
       private LocalDateTime     endTime;

    public Events() {
    }

    public Events(Integer eventId, String eventName, String locationOfEvent, LocalDate date, LocalDateTime startTime, LocalDateTime endTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.locationOfEvent = locationOfEvent;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocationOfEvent() {
        return locationOfEvent;
    }

    public void setLocationOfEvent(String locationOfEvent) {
        this.locationOfEvent = locationOfEvent;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
