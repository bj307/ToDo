/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.NO;

import br.com.todo.model.Tarefa;

/**
 * a classe que representa um nó de tarefa em uma lista duplamente encadeada
 * @author kaior
 */
public class NoTarefa {

    /** Tarefa armazenada no nó */
    public Tarefa tarefa;
    /** Referencia ao nó anterior */
    private NoTarefa anterior;
    /** Referencia ao próximo nó */
    private NoTarefa proximo;

    public NoTarefa() {
        this.tarefa = null;
        this.anterior = null;
        this.proximo = null;
    }

    /**
     * Construtor que cria um nó com uma tarefa especifica
     * 
     * @param tarefa : a tarefa a ser armazenada no nó
     */
    public NoTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
        this.anterior = null;
        this.proximo = null;
    }

    /**
     * a classe representa uma lista duplamente encadeada de tarefas
     */
    public class Lista {

        /** Referência ao primeiro nó da lista. */
        private NoTarefa inicio;
        /** Referência ao último nó da lista. */
        private NoTarefa fim;
        /** Tamanho da lista. */
        private int tamanho;

        public int getTamanho() {
            return tamanho;
        }

        public void setTamanho(int tamanho) {
            this.tamanho = tamanho;
        }

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

        /**
         * Verifica se a lista está vazia
         * 
         * @return true se a lista estiver vazia, false se não estiver vazia
         */
        public boolean estaVazia() {
            return inicio == null;
        }

        /**
         * Insere uma tarefa no início da lista
         * 
         * @param tarefa : a tarefa a ser inserida
         */
        public void inserirNoInicio(Tarefa tarefa) {
            //cria um novo nó(nova tarefa)
            NoTarefa novoNo = new NoTarefa(tarefa);

            //verifica se a lista está vazia
            if (estaVazia()) {

                //se a lista estiver vazia, o inicio e o fim vai ser igual o novo nó, pois só existe um nó
                inicio = novoNo;
                fim = novoNo;
                tamanho = tamanho + 1;
            } else {

                //se tiver algo, o "proximo" do novo nó será o inicio da fila que ja existe
                novoNo.proximo = inicio;

                //o anterior do inicio da fila que já existe vai ser o novo nó
                inicio.anterior = novoNo;

                //o inicio se torna o novo nó
                inicio = novoNo;
                tamanho = tamanho + 1;
            }
        }

        /**
         * Insere uma tarefa no fim da lista
         * não usado no programa
         * @param tarefa a tarefa a ser inserida
         */
        public void inserirNoFim(Tarefa tarefa) {
            //cria um novo nó(nova tarefa)
            NoTarefa novoNo = new NoTarefa(tarefa);

            //verifica se a lista está vazia
            if (estaVazia()) {

                //se a lista estiver vazia, o inicio e o fim vai ser igual o novo nó, pois só existe um nó
                inicio = novoNo;
                fim = novoNo;
                tamanho = tamanho + 1;
            } else {

                //se tiver algo, ele vai para o fim, e coloca o novo nó como proximo
                fim.setProximo(novoNo);

                //atribui o fim como anterior do novo nó
                novoNo.setAnterior(fim);

                //muda o fim para o novo nó
                fim = novoNo;
                tamanho = tamanho + 1;
            }
        }

        /**
         * Exibe todas as tarefas da lista
         */
        public void exibirLista() {
            NoTarefa atual = inicio;

            //a partir do nó atual ele lista e busca o proximo, tornando o proximo como atual
            while (atual != null) {
                System.out.println(atual.getTarefa().toString());
                atual = atual.getProximo();
            }
        }

        /**
         * Busca uma tarefa na lista.
         * 
         * @param taf : a tarefa a ser buscada
         * @return : o nó que contém a tarefa, ou null se não for encontrada
         */
        public NoTarefa buscar(Tarefa taf) {
            NoTarefa noT = inicio;
            while (noT != null) {
                if (noT.tarefa.equals(taf)) {
                    return noT;
                }
                noT = noT.proximo;
            }
            return null;
        }

        /**
         * Remove um nó de tarefa da lista de tarefa
         * 
         * @param noT : o nó a ser removido
         */
        private void removeT(NoTarefa noT) {
            if (noT == inicio) {
                inicio = noT.proximo;
            } else {
                noT.anterior.proximo = noT.proximo;
            }
            if (noT == fim) {
                fim = noT.anterior;
            } else {
                noT.proximo.anterior = noT.anterior;
            }
            tamanho = tamanho - 1;
        }
        
        /**
         * Remove uma tarefa da lista e a move para a lista de concluídas.
         * 
         * @param taf : a tarefa a ser movida
         * @param listaC : a lista de tarefas concluídas
         */
        public void moverConcluido(Tarefa taf, ListaConcluida listaC) {
            NoTarefa noT = buscar(taf);
            if (noT != null) {
                removeT(noT);
                listaC.inserirNoInicio(taf);
            }
        }
    }

    /**
     * a classe representa uma lista duplamente encadeada para as tarefas concluidas
     */
    public class ListaConcluida {
        /** Referência ao primeiro nó da lista de tarefas concluídas. */
        private NoTarefa inicio;
        /** Referência ao último nó da lista de tarefas concluídas. */
        private NoTarefa fim;
        /** Tamanho da lista de tarefas concluídas. */
        private int tamanho;

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

        public int getTamanho() {
            return tamanho;
        }

        public void setTamanho(int tamanho) {
            this.tamanho = tamanho;
        }
        
        public boolean estaVazia() {
            return inicio == null;
        }
        
        /**
         * Insere uma tarefa no início da lista
         * 
         * @param tarefa a tarefa a ser inserida
         */
        public void inserirNoInicio(Tarefa tarefa) {
            //cria um novo nó(nova tarefa)
            NoTarefa novoNo = new NoTarefa(tarefa);

            //verifica se a lista está vazia
            if (estaVazia()) {

                //se a lista estiver vazia, o inicio e o fim vai ser igual o novo nó, pois só existe um nó
                inicio = novoNo;
                fim = novoNo;
                tamanho = tamanho + 1;
            } else {

                //se tiver algo, o "proximo" do novo nó será o inicio da fila que ja existe
                novoNo.proximo = inicio;

                //o anterior do inicio da fila que já existe vai ser o novo nó
                inicio.anterior = novoNo;

                //o inicio se torna o novo nó
                inicio = novoNo;
                tamanho = tamanho + 1;
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
