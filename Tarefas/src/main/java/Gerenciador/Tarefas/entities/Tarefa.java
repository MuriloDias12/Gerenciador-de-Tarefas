package Gerenciador.Tarefas.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Tarefa {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String comentario;

    @Column(nullable = false)
    private LocalDate dataInicio;

    @Column(nullable = false)
    private LocalDateTime dataFim;

    @OneToOne
    @JoinColumn(name = "id_gestor",nullable = false)
    private Gestor gestor;


    @OneToOne
    @JoinColumn(name = "id_funcionario", nullable = false)
    private Funcionario funcionario;


    @OneToOne
    @JoinColumn(name = "id_status", nullable = false)
    private Status status;

    public Tarefa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(id, tarefa.id) && Objects.equals(nome, tarefa.nome) && Objects.equals(descricao, tarefa.descricao) && Objects.equals(comentario, tarefa.comentario) && Objects.equals(dataInicio, tarefa.dataInicio) && Objects.equals(dataFim, tarefa.dataFim) && Objects.equals(gestor, tarefa.gestor) && Objects.equals(funcionario, tarefa.funcionario) && Objects.equals(status, tarefa.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, comentario, dataInicio, dataFim, gestor, funcionario, status);
    }
}

