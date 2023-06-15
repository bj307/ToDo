/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.NO;

import br.com.todo.model.Pessoa;
import br.com.todo.model.Tarefa;
import java.time.LocalDate;

/**
 * a classe implementa o algoritmo de ordenação QuickSort para ordenar as listas
 * de pessoas e tarefas
 *
 * @author kaior
 */
public class QuickSort {

    /**
     * Realiza a ordenação da lista de pessoas utilizando o algoritmo QuickSort
     *
     * @param lista a lista de pessoas a ser ordenada
     */
    public static void quicksortP(NoPessoa.Lista lista) {
        quicksortP(lista.getInicio(), lista.getFim());
    }

    /**
     * aplica o algoritmo de ordenação QuickSort para uma lista de pessoas
     *
     * @param esq o nó da extrema esquerda da lista a ser ordenada
     * @param dir o nó da extrema direita da lista a ser ordenada
     */
    private static void quicksortP(NoPessoa esq, NoPessoa dir) {
        // Verifica se a lista não é nula e se tem mais de um elemento na lista
        if (esq != null && esq != dir && esq != dir.getProximo()) {
            
            // Escolhe um elemento pivô e rearranja a lista
            NoPessoa pivo = partition(esq, dir);
            
            // ordena as sublistas à esquerda e à direita do pivô
            quicksortP(esq, pivo.getAnterior());
            quicksortP(pivo.getProximo(), dir);
        }
    }

    /**
     * Realiza uma partição na lista de pessoas
     *
     * @param esq o nó da esquerda da partição
     * @param dir o nó da direita da partição
     * @return o nó que serve como pivô após a partição
     */
    private static NoPessoa partition(NoPessoa esq, NoPessoa dir) {
        // Define o elemento pivô como o último nó da lista
        NoPessoa pivo = dir;
        NoPessoa i = esq.getAnterior();

        // Percorre a lista do nó esq até o nó dir
        for (NoPessoa j = esq; j != dir; j = j.getProximo()) {
            // Compara o número de tarefas do nó j com o número de tarefas do pivô
            if (j.pessoa.getTarefas() <= pivo.pessoa.getTarefas()) {
                // Incrementa o nó i e realiza a troca de posição entre os nós i e j
                i = (i == null) ? esq : i.getProximo();
                swapP(i, j);
            }
        }
        // Incrementa o nó i e realiza a troca de posição entre os nós i e o nó dir (pivô)
        i = (i == null) ? esq : i.getProximo();
        swapP(i, dir);
        // retorna um NoPessoa
        return i;
    }

    /**
     * Realiza a troca de posição entre dois nós de pessoas
     *
     * @param a o primeiro nó a ser trocado
     * @param b o segundo nó a ser trocado
     */
    private static void swapP(NoPessoa a, NoPessoa b) {
        Pessoa temp = a.pessoa;
        a.pessoa = b.pessoa;
        b.pessoa = temp;
    }

    /**
     * Realiza a ordenação da lista de tarefas
     *
     * @param lista a lista de tarefas a ser ordenada
     */
    public static void quicksortT(NoTarefa.Lista lista) {
        quicksortT(lista.getInicio(), lista.getFim());
    }

    /**
     * Realiza a ordenação da lista de tarefas concluídas
     *
     * @param lista a lista de tarefas concluídas a ser ordenada
     */
    public static void quicksortC(NoTarefa.ListaConcluida lista) {
        quicksortT(lista.getInicio(), lista.getFim());
    }

    /**
     * aplica o algoritmo de ordenação QuickSort para a lista
     *
     * @param esq o nó da extrema esquerda da lista a ser ordenada
     * @param dir o nó da extrema direita da lista a ser ordenada
     */
    private static void quicksortT(NoTarefa esq, NoTarefa dir) {
        if (esq != null && esq != dir && esq != dir.getProximo()) {
            NoTarefa pivo = partitionT(esq, dir);
            quicksortT(esq, pivo.getAnterior());
            quicksortT(pivo.getProximo(), dir);
        }
    }

    /**
     * Realiza a partição da lista de tarefas
     *
     * @param esq o nó da extrema esquerda da partição
     * @param dir o nó da extrema direita da partição
     * @return o nó que serve como pivô após a partição
     */
    private static NoTarefa partitionT(NoTarefa esq, NoTarefa dir) {
        LocalDate pivo = dir.getTarefa().getDataTarefa();
        NoTarefa i = esq.getAnterior();

        for (NoTarefa j = esq; j != dir; j = j.getProximo()) {
            if (j.tarefa.getDataTarefa().compareTo(pivo) <= 0) {
                i = (i == null) ? esq : i.getProximo();
                swapT(i, j);
            }
        }

        i = (i == null) ? esq : i.getProximo();
        swapT(i, dir);
        return i;
    }

    /**
     * Realiza a troca de posição entre dois nós de tarefas
     *
     * @param a o primeiro nó a ser trocado
     * @param b o segundo nó a ser trocado
     */
    private static void swapT(NoTarefa a, NoTarefa b) {
        Tarefa temp = a.tarefa;
        a.tarefa = b.tarefa;
        b.tarefa = temp;
    }
}
