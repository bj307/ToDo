/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.todo.view;

import br.com.todo.NO.NoPessoa;

/**
 *
 * @author kaior
 */
public class UserUni extends javax.swing.JPanel {

    NoPessoa noP;

    /**
     * Creates new form UserUni
     */
    public UserUni(NoPessoa noP) {
        initComponents();
        this.noP = noP;
        nomeUser.setText(noP.getPessoa().getNome());
        qtdHoras.setText(noP.getPessoa().getHoras().toString());
        qtdTarefa.setText(String.valueOf(noP.getPessoa().getTarefas()));
        codUser.setText(String.valueOf(noP.getPessoa().getCodigo()));
        tipoUser.setText(noP.getPessoa().getTipo());
    }

    public NoPessoa getNoP() {
        return noP;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        nomeUser = new javax.swing.JTextField();
        codUser = new javax.swing.JTextField();
        tipoUser = new javax.swing.JTextField();
        qtdTarefa = new javax.swing.JTextField();
        qtdHoras = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });

        nomeUser.setEditable(false);
        nomeUser.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        nomeUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nomeUserMouseReleased(evt);
            }
        });
        nomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUserActionPerformed(evt);
            }
        });

        codUser.setEditable(false);
        codUser.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        tipoUser.setEditable(false);
        tipoUser.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        qtdTarefa.setEditable(false);
        qtdTarefa.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        qtdTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdTarefaActionPerformed(evt);
            }
        });

        qtdHoras.setEditable(false);
        qtdHoras.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        qtdHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(nomeUser, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(qtdTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(qtdHoras, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(codUser, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tipoUser, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtdTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qtdHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void qtdTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdTarefaActionPerformed

    }//GEN-LAST:event_qtdTarefaActionPerformed

    private void qtdHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdHorasActionPerformed

    private void nomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUserActionPerformed

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased

    }//GEN-LAST:event_jPanel4MouseReleased

    private void nomeUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeUserMouseReleased
        //clicou no nome da pessoa
        DetalheUser dUser = new DetalheUser();
        dUser.preencher(this.getNoP().getPessoa());
        dUser.setVisible(true);
    }//GEN-LAST:event_nomeUserMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField codUser;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nomeUser;
    private javax.swing.JTextField qtdHoras;
    private javax.swing.JTextField qtdTarefa;
    private javax.swing.JTextField tipoUser;
    // End of variables declaration//GEN-END:variables
}
