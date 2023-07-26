package com.example.eventflow.guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;



@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {
    
}
