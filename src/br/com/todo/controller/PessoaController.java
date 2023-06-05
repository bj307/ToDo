/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.controller;

import br.com.todo.NO.NoPessoa;
import br.com.todo.NO.PessoaDAO;
import br.com.todo.model.Pessoa;
import br.com.todo.view.CadastroUser;
import java.time.LocalTime;

/**
 *
 * @author kaior
 */
public class PessoaController {
    
    public Pessoa cadastrar(CadastroUser user) {
        Pessoa p = new Pessoa();
        PessoaDAO pDAO = new PessoaDAO();
        p.setNome(user.nomeUser.getText());
        p.setCodigo(Integer.parseInt(user.codUser.getText()));
        p.setSenha(user.senhaUser.getText());
        p.setTipo(user.tipoUser.getSelectedItem().toString());
        p.setHoras(LocalTime.of(0, 0));
        p.setTarefas(0);
        pDAO.gravar(p);
        return p;
    }
    
}
