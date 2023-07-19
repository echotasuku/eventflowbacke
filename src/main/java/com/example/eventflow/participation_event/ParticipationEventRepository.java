package com.example.eventflow.participation_event;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface  ParticipationEventRepository extends CrudRepository <ParticipationEvent, Long>{

}