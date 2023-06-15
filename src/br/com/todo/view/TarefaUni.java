/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.todo.view;

import br.com.todo.NO.NoTarefa;

/**
 *
 * @author kaior
 */
public class TarefaUni extends javax.swing.JPanel {

    NoTarefa.ListaConcluida listaC;
    NoTarefa.Lista lista;
    NoTarefa noT;

    /**
     * Creates new form TarefaUni
     */
    public TarefaUni(NoTarefa noT, NoTarefa.Lista listaT, NoTarefa.ListaConcluida listaC) {
        initComponents();
        this.lista = listaT;
        this.listaC = listaC;
        this.noT = noT;
        nomeTarefa.setText(noT.getTarefa().getNome());
        dataTarefa.setText(noT.getTarefa().getDataTarefa().toString());
        statusTarefa.setText(noT.getTarefa().getStatus());
    }

    public NoTarefa getNoT() {
        return noT;
    }

    public NoTarefa.Lista getLista() {
        return lista;
    }
    
    

//    public CadastroTarefa getCadTar() {
//        return cadTar;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomeTarefa = new javax.swing.JTextField();
        dataTarefa = new javax.swing.JTextField();
        statusTarefa = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        nomeTarefa.setEditable(false);
        nomeTarefa.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        nomeTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nomeTarefaMouseReleased(evt);
            }
        });

        dataTarefa.setEditable(false);
        dataTarefa.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        statusTarefa.setEditable(false);
        statusTarefa.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTarefaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeTarefaMouseReleased
        //clicou na tarefa
        DetalheTarefa dTar = new DetalheTarefa();
        dTar.preencher(this);
        dTar.setVisible(true);
    }//GEN-LAST:event_nomeTarefaMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dataTarefa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeTarefa;
    private javax.swing.JTextField statusTarefa;
    // End of variables declaration//GEN-END:variables
}
