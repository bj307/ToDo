/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.controller;

import br.com.todo.NO.TarefaDAO;
import br.com.todo.model.Tarefa;
import br.com.todo.view.CadastroTarefa;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kaior
 */
public class TarefaController {

    public Tarefa cadastrar(CadastroTarefa tarefa) {
        PessoaController pController = new PessoaController();
        Tarefa t = new Tarefa();
        TarefaDAO tDAO = new TarefaDAO();
        t.setNome(tarefa.nomeTarefa.getText());
        t.setDescricao(tarefa.descTarefa.getText());
        t.setStatus("Aberto");
        t.setHoraTarefa(LocalTime.parse(tarefa.horaTarefa.getText()));
        t.setDuracao(LocalTime.parse(tarefa.horaTarefa.getText()));
        t.setDataTarefa(LocalDate.parse(tarefa.dataTarefa.getText()));
        //t.setPessoa(lista.buscar(12345));
        return t;
    }

}
