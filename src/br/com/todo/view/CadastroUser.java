/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.todo.view;

import br.com.todo.NO.NoPessoa;
import br.com.todo.controller.PessoaController;
import br.com.todo.model.Util;
import br.com.todo.model.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author kaior
 */
public class CadastroUser extends javax.swing.JPanel {

    PessoaController pController = new PessoaController();
    private NoPessoa noP = new NoPessoa();
    //lista principal de pessoas
    private NoPessoa.Lista lista = noP.new Lista();

    public NoPessoa getPessoa() {
        return noP;
    }

    public NoPessoa.Lista getLista() {
        return lista;
    }

    /**
     * Creates new form CadastroUser
     */
    public CadastroUser() {
        initComponents();
    }

    //verifica se já existe um usuário com o codigo
    public boolean vCod(int cod) {
        Pessoa p = lista.buscar(cod);
        if (p == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        senhaUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipoUser = new javax.swing.JComboBox<>();
        codUser = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        nomeUser.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        nomeUser.setText("kaio");
        nomeUser.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel3.setText("Senha");

        senhaUser.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        senhaUser.setText("senha");

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel4.setText("Tipo");

        tipoUser.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        tipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GERENTE", "FUNCIONARIO" }));
        tipoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoUserActionPerformed(evt);
            }
        });

        try {
            codUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        codUser.setText("12345");
        codUser.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeUser)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(codUser, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(senhaUser, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tipoUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senhaUser, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(tipoUser)
                    .addComponent(codUser))
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //é feito a verificação se já existe um usário com o codigo inserido
        if (vCod(Integer.parseInt(codUser.getText()))) {
            lista.inserirNoInicio(pController.cadastrar(this));
            new Util().LimpaTela(this);
        } else {
            JOptionPane.showMessageDialog(null, "Código em uso, tente outro.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tipoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFormattedTextField codUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField nomeUser;
    public javax.swing.JTextField senhaUser;
    public javax.swing.JComboBox<String> tipoUser;
    // End of variables declaration//GEN-END:variables
}
