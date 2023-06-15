/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.controller;

import br.com.todo.NO.NoTarefa;
import br.com.todo.model.Pessoa;
import br.com.todo.model.Tarefa;
import br.com.todo.view.CadastroTarefa;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author kaior
 */
public class TarefaController {

    //metodo para criar uma tarefa, recebe os dados dos inputs de tarefa, cria e retorna uma nova tarefa
    public Tarefa cadastrar(CadastroTarefa tarefa) {
        PessoaController pController = new PessoaController();
        Tarefa t = new Tarefa();
        Pessoa pe = tarefa.getUser().getLista().buscar(Integer.parseInt(tarefa.codigoResp.getText()));
        t.setNome(tarefa.nomeTarefa.getText());
        t.setDescricao(tarefa.descTarefa.getText());
        t.setStatus("Aberto");
        t.setHoraTarefa(LocalTime.parse(tarefa.horaTarefa.getText()));
        t.setDuracao(LocalTime.parse(tarefa.duracao.getText()));
        t.setDataTarefa(LocalDate.parse(tarefa.dataTarefa.getText()));
        t.setPessoa(tarefa.getUser().getLista().buscar(Integer.parseInt(tarefa.codigoResp.getText())));
        pe.setHoras(LocalTime.parse(tarefa.duracao.getText()));
        pe.setTarefas(1);
        return t;
    }

    //metodo retorna uma lista com as tarefas em aberto de uma determinada pessoa
    public NoTarefa.Lista lista(CadastroTarefa cadTar, Pessoa p) {
        int codigo = p.getCodigo();
        NoTarefa lista = cadTar.getLista().getInicio();
        NoTarefa.Lista listaFinal = lista.new Lista();
        while (lista != null) {
            if (lista.getTarefa().getPessoa().getCodigo() == codigo && lista.getTarefa().getStatus().equals("Aberto")) {
                listaFinal.inserirNoInicio(lista.getTarefa());
            }
            lista = lista.getProximo();
        }
        return listaFinal;
    }

    //metodo retorna uma lista das tarefas concluidas de uma determinada pessoa
    public NoTarefa.ListaConcluida listaC(CadastroTarefa cadTar, Pessoa p) {
        int codigo = p.getCodigo();
        NoTarefa listaC = cadTar.getListaC().getInicio();
        NoTarefa.ListaConcluida listaFinal = listaC.new ListaConcluida();
        while (listaC != null) {
            if (listaC.getTarefa().getPessoa().getCodigo() == codigo && listaC.getTarefa().getStatus().equals("Concluido")) {
                listaFinal.inserirNoInicio(listaC.getTarefa());
            }
            listaC = listaC.getProximo();
        }
        return listaFinal;
    }

}
