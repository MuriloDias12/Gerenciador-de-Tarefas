package Gerenciador.Tarefas.controllers;

import Gerenciador.Tarefas.entities.Gestor;
import Gerenciador.Tarefas.services.GestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gestor")
public class GestorController {
    @Autowired
    private GestorService service;




    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Gestor> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE )
    public Gestor findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public Gestor create(@RequestBody Gestor gestor) {
        return service.create(gestor);
    }

    @PutMapping(value = "/{id}", consumes =  MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public Gestor update(@RequestBody Gestor gestor) {
        return service.update(gestor);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
         service.delete(id);

    }
}
