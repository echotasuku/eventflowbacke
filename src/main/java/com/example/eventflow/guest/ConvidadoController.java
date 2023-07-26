//package com.example.eventflow.guest;

//import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;

//import com.example.eventflow.event.Event;
//import com.example.eventflow.event.EventRepository;

//@RestController
//public class ConvidadoController {

   // @Autowired
    ///private ConvidadoRepository convidadoRepository;
    
    //@Autowired
    //private EventRepository eventoRepository;

    //@PostMapping("/eventos/{eventoId}/convidados")
    //public ResponseEntity<?> cadastrarConvidado(@PathVariable Long eventoId, @RequestBody Convidado convidado) {
        // Verifica se o evento existe
        //Optional<Event> eventoOptional = eventoRepository.findById(eventoId);
        //if (!eventoOptional.isPresent()) {
            //return ResponseEntity.notFound().build();
        //}

        //Event evento = eventoOptional.get();
        //convidado.setEvent(evento);
        //convidado.setAceitouConvite(false); // Definir como não aceitou por padrão

        //Convidado novoConvidado = convidadoRepository.save(convidado);

        //return ResponseEntity.ok(novoConvidado);
    //}

   
//}
