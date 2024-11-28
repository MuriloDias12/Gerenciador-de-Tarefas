package Gerenciador.Tarefas.controllers;

import Gerenciador.Tarefas.entities.Funcionario;
import Gerenciador.Tarefas.entities.Gestor;
import Gerenciador.Tarefas.services.FuncionarioService;
import Gerenciador.Tarefas.services.GestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/gestor")
public class GestorController {
    
    @Autowired
    private GestorService service;

    @Autowired
    private FuncionarioService funcionarioService;

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

    @PostMapping(value = "/{id}/funcionario",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.create(funcionario);
    }

    @DeleteMapping(value = "/{id}/funcinario/{id_funcionario}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteFuncionario(@PathVariable Long id_funcionario) {
        funcionarioService.delete(id_funcionario);
    }
}
