/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.NO;

import br.com.todo.model.Pessoa;

/**
 *
 * @author kaior
 */
public class NoPessoa {

    private Pessoa pessoa;
    private NoPessoa anterior;
    private NoPessoa proximo;

    public NoPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.anterior = null;
        this.proximo = null;
    }
    
    public NoPessoa(){
        this.pessoa = null;
        this.anterior = null;
        this.proximo = null;
    }

    public class Lista {

        private NoPessoa inicio;
        private NoPessoa fim;

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

        public boolean estaVazia() {
            return inicio == null;
        }

        //insere no inicio
        public void inserirNoInicio(Pessoa p) {
            //novo nó pessoa
            NoPessoa novoNo = new NoPessoa(p);

            //verifica se esta vazio
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

        //insere no fim
        public void inserirNoFim(Pessoa p) {
            //novo nó pessoa
            NoPessoa novoNo = new NoPessoa(p);

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
            NoPessoa atual = inicio;

            //a partir do nó atual ele lista e busca o proximo, tornando o proximo como atual
            while (atual != null) {
                System.out.println(atual.getPessoa().toString());
                atual = atual.getProximo();
            }
        }
        
        public Pessoa buscar(int cod) {
            NoPessoa atual = inicio;
            
            while(atual != null) {
                if(atual.pessoa.getCodigo() == cod) {
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
