package Gerenciador.Tarefas.services;

import Gerenciador.Tarefas.entities.Gestor;
import Gerenciador.Tarefas.repositories.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class GestorService {
    private Logger logger = Logger.getLogger(GestorService.class.getName());

    @Autowired
    GestorRepository repository;


    public List<Gestor> findAll() {
        return repository.findAll();
    }
    public Gestor findById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new RuntimeException("Gestor com ID " + id + " não encontrado!")
        );
    }

    public Gestor create(Gestor gestor) {
        return repository.save(gestor);
    }

    public Gestor update(Gestor gestor) {
        Gestor entity = repository.findById(gestor.getId()).orElseThrow(() ->
                new RuntimeException("Gestor com ID  não encontrado!"));

        entity.setNome(gestor.getNome());
        entity.setEmail(gestor.getEmail());
        entity.setTelefone(gestor.getTelefone());
        entity.setSenha(gestor.getSenha());

        return repository.save(entity);

    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
