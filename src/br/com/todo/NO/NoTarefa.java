/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.NO;

import br.com.todo.model.Tarefa;

/**
 *
 * @author kaior
 */
public class NoTarefa {

    private Tarefa tarefa;
    private NoTarefa anterior;
    private NoTarefa proximo;

    public NoTarefa() {
        this.tarefa = null;
        this.anterior = null;
        this.proximo = null;
    }
    
    public NoTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
        this.anterior = null;
        this.proximo = null;
    }

    public class Lista {

        private NoTarefa inicio;
        private NoTarefa fim;

        public NoTarefa getInicio() {
            return inicio;
        }

        public void setInicio(NoTarefa inicio) {
            this.inicio = inicio;
        }

        public NoTarefa getFim() {
            return fim;
        }

        public void setFim(NoTarefa fim) {
            this.fim = fim;
        }

        public Lista() {
            this.inicio = null;
            this.fim = null;
        }

        public boolean estaVazia() {
            return inicio == null;
        }

        //inserir no inicio da lista
        public void inserirNoInicio(Tarefa tarefa) {
            //cria um novo nó(nova tarefa)
            NoTarefa novoNo = new NoTarefa(tarefa);

            //verifica se a lista está vazia
            if (estaVazia()) {
                
                //se a lista estiver vazia, o inicio e o fim vai ser igual o novo nó, pois só existe um nó
                inicio = novoNo;
                fim = novoNo;
            } else {
                
                //se tiver algo, o "proximo" do novo nó será o inicio da fila que ja existe
                novoNo.proximo = inicio;
                
                //o anterior do inicio da fila que já existe vai ser o novo nó
                inicio.anterior = novoNo;
                
                //o inicio se torna o novo nó
                inicio = novoNo;
            }
        }

        //insere no fim da lista
        public void inserirNoFim(Tarefa tarefa) {
            //cria um novo nó(nova tarefa)
            NoTarefa novoNo = new NoTarefa(tarefa);

            //verifica se a lista está vazia
            if (estaVazia()) {

                //se a lista estiver vazia, o inicio e o fim vai ser igual o novo nó, pois só existe um nó
                inicio = novoNo;
                fim = novoNo;
            } else {

                //se tiver algo, ele vai para o fim, e coloca o novo nó como proximo
                fim.setProximo(novoNo);

                //atribui o fim como anterior do novo nó
                novoNo.setAnterior(fim);

                //muda o fim para o novo nó
                fim = novoNo;
            }
        }

        public void exibirLista() {
            NoTarefa atual = inicio;

            //a partir do nó atual ele lista e busca o proximo, tornando o proximo como atual
            while (atual != null) {
                System.out.println(atual.getTarefa().toString());
                atual = atual.getProximo();
            }
        }
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public NoTarefa getAnterior() {
        return anterior;
    }

    public void setAnterior(NoTarefa anterior) {
        this.anterior = anterior;
    }

    public NoTarefa getProximo() {
        return proximo;
    }

    public void setProximo(NoTarefa proximo) {
        this.proximo = proximo;
    }

}
