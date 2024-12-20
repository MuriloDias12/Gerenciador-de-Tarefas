package Gerenciador.Tarefas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Gerenciador.Tarefas.entities.Funcionario;
import Gerenciador.Tarefas.services.FuncionarioService;

@RestController
@RequestMapping(value = "/funcinario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;


}
