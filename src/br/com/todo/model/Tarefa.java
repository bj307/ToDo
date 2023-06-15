/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kaior
 */
public class Tarefa {

    private int id;
    private String nome;
    private String descricao;
    private LocalDate dataTarefa;
    private LocalTime horaTarefa;
    private LocalTime duracao;
    private Pessoa pessoa;
    private String status;

    public Tarefa() {
    }

    public Tarefa(int id, String nome, String descricao, LocalDate dataTarefa, LocalTime horaTarefa, LocalTime duracao, Pessoa pessoa, String status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataTarefa = dataTarefa;
        this.horaTarefa = horaTarefa;
        this.duracao = duracao;
        this.pessoa = pessoa;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public LocalDate getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(LocalDate dataTarefa) {
        this.dataTarefa = dataTarefa;
    }

    public LocalTime getHoraTarefa() {
        return horaTarefa;
    }

    public void setHoraTarefa(LocalTime horaTarefa) {
        this.horaTarefa = horaTarefa;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", dataTarefa=" + dataTarefa + ", horaTarefa=" + horaTarefa + ", duracao=" + duracao + ", pessoa=" + pessoa + ", status=" + status + '}';
    }
}
