package Gerenciador.Tarefas.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gerenciador.Tarefas.entities.Funcionario;
import Gerenciador.Tarefas.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

    private Logger logger = Logger.getLogger(FuncionarioService.class.getName());

    @Autowired
    FuncionarioRepository repository;


    public List<Funcionario> findAll() {
        return repository.findAll();
    }

    public Funcionario findById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new RuntimeException("Funcionario com ID " + id + " não encontrado!")
        );
    }

    public Funcionario create(Funcionario funcionario) {
        return repository.save(funcionario);
    }

    public Funcionario update(Funcionario funcionario) {
        Funcionario entity = repository.findById(funcionario.getId()).orElseThrow(() ->
                new RuntimeException("Funcionario com ID  não encontrado!"));

        entity.setNome(funcionario.getNome());
        entity.setEmail(funcionario.getEmail());
        entity.setSenha(funcionario.getSenha());
        entity.setDataContratacao(funcionario.getDataContratacao());

        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
