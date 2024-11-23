package Gerenciador.Tarefas.entities;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Funcionario extends Pessoa {
    private String fodase;
    public Funcionario() {
    }

    public String getFodase() {
        return fodase;
    }

    public void setFodase(String fodase) {
        this.fodase = fodase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(fodase, that.fodase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fodase);
    }
}
