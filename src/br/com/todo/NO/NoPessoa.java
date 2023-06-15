/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.NO;

import br.com.todo.model.Pessoa;

/**
 * a classe representa um nó de pessoa em uma lista duplamente encadeada
 * @author kaior
 */
public class NoPessoa {

    /** Pessoa armazenada no nó */
    public Pessoa pessoa;
    /** Referência ao nó(pessoa) anterior */
    private NoPessoa anterior;
    /** Referência ao próximo nó(pessoa) */
    private NoPessoa proximo;

    /**
     * cria um nó com uma pessoa especifica
     * 
     * @param pessoa : a pessoa que vai ser armazenada no nó
     */
    public NoPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.anterior = null;
        this.proximo = null;
    }

    public NoPessoa() {
        this.pessoa = null;
        this.anterior = null;
        this.proximo = null;
    }

    /**
     * a classe representa uma lista duplamente encadeada de pessoas
     */
    public class Lista {

        /** Referencia ao primeiro nó da lista */
        private NoPessoa inicio;
        /** Referencia ao último nó da lista */
        private NoPessoa fim;
        /** Tamanho da lista */
        private int tamanho;

        public int getTamanho() {
            return tamanho;
        }

        public void setTamanho(int tamanho) {
            this.tamanho = tamanho;
        }

        public NoPessoa getInicio() {
            return inicio;
        }

        public void setInicio(NoPessoa inicio) {
            this.inicio = inicio;
        }

        public NoPessoa getFim() {
            return fim;
        }

        public void setFim(NoPessoa fim) {
            this.fim = fim;
        }

        public Lista() {
            this.inicio = null;
            this.fim = null;
        }

        /**
         * Verifica se a lista está vazia.
         * 
         * @return true se a lista estiver vazia, false caso esteja cheia
         */
        public boolean estaVazia() {
            return inicio == null;
        }

        /**
         * Insere uma pessoa no inicio da lista
         * 
         * @param p : a pessoa a ser inserida
         */
        public void inserirNoInicio(Pessoa p) {
            //novo nó pessoa
            NoPessoa novoNo = new NoPessoa(p);

            //verifica se esta vazio
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
         * Insere uma pessoa no fim da lista
         * metodo criado apenas para teste, não é utilizado no programa
         * @param p : a pessoa a ser inserida
         */
        public void inserirNoFim(Pessoa p) {
            //novo nó pessoa
            NoPessoa novoNo = new NoPessoa(p);

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
         * Exibe todas as pessoas da lista
         */
        public void exibirLista() {
            NoPessoa atual = inicio;

            //a partir do nó atual ele lista e busca o proximo, tornando o proximo como atual
            while (atual != null) {
                System.out.println(atual.getPessoa().toString());
                atual = atual.getProximo();
            }
        }

        /**
         * Busca uma pessoa na lista pelo seu codigo
         * 
         * @param cod : o codigo da pessoa a ser buscada
         * @return a pessoa encontrada, ou null se não encontrada
         */
        public Pessoa buscar(int cod) {
            NoPessoa atual = inicio;
            while (atual != null) {
                if (atual.pessoa.getCodigo() == cod) {
                    return atual.pessoa;
                } else {
                    atual = atual.proximo;
                }
            }
            return null;
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public NoPessoa getAnterior() {
        return anterior;
    }

    public void setAnterior(NoPessoa anterior) {
        this.anterior = anterior;
    }

    public NoPessoa getProximo() {
        return proximo;
    }

    public void setProximo(NoPessoa proximo) {
        this.proximo = proximo;
    }

}
