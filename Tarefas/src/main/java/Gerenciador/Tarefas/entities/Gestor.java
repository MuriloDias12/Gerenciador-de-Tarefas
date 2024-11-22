package Gerenciador.Tarefas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Gestor extends Pessoa {

    @Column(nullable = false)
    private String telefone;

    public Gestor() {
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gestor gestor = (Gestor) o;
        return Objects.equals(telefone, gestor.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), telefone);
    }
}
