package Gerenciador.Tarefas.repositories;

import Gerenciador.Tarefas.entities.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestorRepository extends JpaRepository<Gestor, Long> {
}
