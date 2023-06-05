/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.todo.NO;

import br.com.todo.model.Pessoa;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author kaior
 */
public class PessoaDAO {
    
    public void gravar(Pessoa p){
        String local = "C:\\Users\\kaior\\Desktop\\ARQUIVOS NETBEANS\\ToDo\\bd\\";
        String resultado = "Arquivo salvo!";
        String content = p.toString();
        
        try {
            FileWriter file = new FileWriter(local + "Pessoa - " + p.getCodigo() + ".txt");
            file.write(content);
            file.close();
            java.awt.Desktop.getDesktop().open(new File(local + "Pessoa - " + p.getCodigo() + ".txt"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + e);
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
