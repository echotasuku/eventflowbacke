package com.example.eventflow.event_type;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface EventTypeRepository extends CrudRepository <EventType, Long> {

    
}
