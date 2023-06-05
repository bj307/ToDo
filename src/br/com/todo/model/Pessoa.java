/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.model;

import br.com.todo.NO.NoPessoa;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

/**
 *
 * @author kaior
 */
public class Pessoa {
    
    private int id;
    private int codigo;
    private String nome;
    private String senha;
    private String tipo;
    private int tarefas;
    private LocalTime horas = LocalTime.of(0, 0);
    
    public Pessoa() {
    }
    
    public Pessoa(int id, int codigo, String nome, String senha, String tipo) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
        this.tarefas = tarefas;
        this.horas = horas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTarefas() {
        return tarefas;
    }

    public void setTarefas(int tarefas) {
        this.tarefas = getTarefas() + tarefas;
    }

    public LocalTime getHoras() {
        return horas;
    }

    public void setHoras(LocalTime horas) {
        this.horas = horas.plusHours(getHoras().getHour()).plusMinutes(getHoras().getMinute()).plusSeconds(getHoras().getSecond());
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", senha=" + senha + ", tipo=" + tipo + ", tarefas=" + tarefas + ", horas=" + horas + '}';
    }

    
    
}
