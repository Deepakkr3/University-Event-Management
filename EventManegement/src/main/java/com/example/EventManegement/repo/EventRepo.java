package com.example.EventManegement.repo;

import com.example.EventManegement.model.Events;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EventRepo extends CrudRepository<Events,Integer> {
}
