/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.todo.view;

import br.com.todo.model.Pessoa;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.CardLayout;

/**
 *
 * @author kaior
 */
public class Dashboard extends javax.swing.JFrame {

    Pessoa login;
    Setup setup;
    CadastroUser cadUser;
    CadastroTarefa cadTarefa;
    Inicio inicio;
    TarefaList tarefas;
    UserList userList;

    /**
     * Creates new form Dashboard
     */
    public Dashboard(Setup setup) {
        initComponents();
        this.setup = setup;
        this.login = setup.getLogado();
        userAdm(login);
        this.cadTarefa = setup.cadTarefa;
        this.cadUser = setup.cadUser;
        inicio = new Inicio(cadTarefa, cadUser);
        tarefas = new TarefaList(cadTarefa.getLista(), cadTarefa.getListaC());
        userList = new UserList(cadUser);
        this.setLocationRelativeTo(null);
        this.setTitle("To Do");
        jVaria.setLayout(new CardLayout());
        jVaria.add(inicio, "inicio");
    }

    public CadastroTarefa getCadTarefa() {
        return cadTarefa;
    }

    //recebe a pessoa do login e verifica o tipo do usuario para mostrar o menu certo
    public void userAdm(Pessoa login) {
        if (login.getTipo().equals("GERENTE")) {
            inicioUser.setVisible(false);
            verTarAbUser.setVisible(false);
            verTafCnUser.setVisible(false);
            inicioAdm.setVisible(true);
            cadTarAdm.setVisible(true);
            cadUserAdm.setVisible(true);
            verTarAdm.setVisible(true);
            verUserAdm.setVisible(true);
        } else if (login.getTipo().equals("FUNCIONARIO")) {
            inicioUser.setVisible(true);
            verTarAbUser.setVisible(true);
            verTafCnUser.setVisible(true);
            inicioAdm.setVisible(false);
            cadTarAdm.setVisible(false);
            cadUserAdm.setVisible(false);
            verTarAdm.setVisible(false);
            verUserAdm.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jVaria = new javax.swing.JPanel();
        menu1 = new br.com.todo.view.Menu();
        jPanel2 = new javax.swing.JPanel();
        inicioAdm = new javax.swing.JLabel();
        cadTarAdm = new javax.swing.JLabel();
        cadUserAdm = new javax.swing.JLabel();
        verTarAbUser = new javax.swing.JLabel();
        verUserAdm = new javax.swing.JLabel();
        inicioUser = new javax.swing.JLabel();
        verTarAdm = new javax.swing.JLabel();
        verTafCnUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 250, 255));

        jTitulo.setFont(new java.awt.Font("Montserrat SemiBold", 0, 48)); // NOI18N
        jTitulo.setText("Dashboard");

        jVaria.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jVariaLayout = new javax.swing.GroupLayout(jVaria);
        jVaria.setLayout(jVariaLayout);
        jVariaLayout.setHorizontalGroup(
            jVariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jVariaLayout.setVerticalGroup(
            jVariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTitulo)
                        .addGap(0, 641, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(jVaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jVaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        inicioAdm.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        inicioAdm.setText("Inicio");
        inicioAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicioAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inicioAdmMouseReleased(evt);
            }
        });

        cadTarAdm.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        cadTarAdm.setText("Cadastrar tarefa");
        cadTarAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadTarAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadTarAdmMouseClicked(evt);
            }
        });

        cadUserAdm.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        cadUserAdm.setText("Cadastrar usuário");
        cadUserAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadUserAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadUserAdmMouseClicked(evt);
            }
        });

        verTarAbUser.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        verTarAbUser.setText("Ver tarefas abertas");
        verTarAbUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verTarAbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTarAbUserMouseClicked(evt);
            }
        });

        verUserAdm.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        verUserAdm.setText("Ver usuários");
        verUserAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verUserAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                verUserAdmMouseReleased(evt);
            }
        });

        inicioUser.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        inicioUser.setText("Inicio");
        inicioUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicioUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inicioUserMouseReleased(evt);
            }
        });

        verTarAdm.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        verTarAdm.setText("Ver tarefas");
        verTarAdm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verTarAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTarAdmMouseClicked(evt);
            }
        });

        verTafCnUser.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        verTafCnUser.setText("Ver tarefas concluidas");
        verTafCnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verTafCnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTafCnUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verTarAdm)
                    .addComponent(verTafCnUser)
                    .addComponent(inicioUser)
                    .addComponent(inicioAdm)
                    .addComponent(cadTarAdm)
                    .addComponent(cadUserAdm)
                    .addComponent(verTarAbUser)
                    .addComponent(verUserAdm))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(inicioAdm)
                .addGap(27, 27, 27)
                .addComponent(inicioUser)
                .addGap(30, 30, 30)
                .addComponent(cadTarAdm)
                .addGap(30, 30, 30)
                .addComponent(verTarAbUser)
                .addGap(27, 27, 27)
                .addComponent(cadUserAdm)
                .addGap(33, 33, 33)
                .addComponent(verTafCnUser)
                .addGap(34, 34, 34)
                .addComponent(verTarAdm)
                .addGap(70, 70, 70)
                .addComponent(verUserAdm)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioAdmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioAdmMouseReleased
        inicio.atualizaDash();
        CardLayout cl = (CardLayout) (jVaria.getLayout());
        cl.show(jVaria, "inicio");
    }//GEN-LAST:event_inicioAdmMouseReleased

    private void cadTarAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadTarAdmMouseClicked
        jVaria.add(setup.cadTarefa, "cadTarefa");
        CardLayout cl = (CardLayout) (jVaria.getLayout());
        cl.show(jVaria, "cadTarefa");
    }//GEN-LAST:event_cadTarAdmMouseClicked

    private void verTarAbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTarAbUserMouseClicked
        tarefas.atualizaLista();
        jVaria.add(tarefas, "tarefas");
        CardLayout cl = (CardLayout) (jVaria.getLayout());
        cl.show(jVaria, "tarefas");
    }//GEN-LAST:event_verTarAbUserMouseClicked

    private void cadUserAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadUserAdmMouseClicked
        jVaria.add(setup.cadUser, "cadUser");
        CardLayout cl = (CardLayout) (jVaria.getLayout());
        cl.show(jVaria, "cadUser");
    }//GEN-LAST:event_cadUserAdmMouseClicked

    private void verUserAdmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verUserAdmMouseReleased
        userList.atualizaLista();
        jVaria.add(userList, "userList");
        CardLayout cl = (CardLayout) (jVaria.getLayout());
        cl.show(jVaria, "userList");
    }//GEN-LAST:event_verUserAdmMouseReleased

    private void inicioUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioUserMouseReleased
        inicio.atualizaDash();
        CardLayout cl = (CardLayout) (jVaria.getLayout());
        cl.show(jVaria, "inicio");
    }//GEN-LAST:event_inicioUserMouseReleased

    private void verTarAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTarAdmMouseClicked
        tarefas.atualizaLista();
        jVaria.add(tarefas, "tarefas");
        CardLayout cl = (CardLayout) (jVaria.getLayout());
        cl.show(jVaria, "tarefas");
    }//GEN-LAST:event_verTarAdmMouseClicked

    private void verTafCnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTafCnUserMouseClicked
        tarefas.atualizaListaC();
        jVaria.add(tarefas, "tarefas");
        CardLayout cl = (CardLayout) (jVaria.getLayout());
        cl.show(jVaria, "tarefas");
    }//GEN-LAST:event_verTafCnUserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        IntelliJTheme.setup(Setup.class.getResourceAsStream("/Material_Lighter.theme.json"));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadTarAdm;
    private javax.swing.JLabel cadUserAdm;
    private javax.swing.JLabel inicioAdm;
    private javax.swing.JLabel inicioUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JPanel jVaria;
    private br.com.todo.view.Menu menu1;
    private javax.swing.JLabel verTafCnUser;
    private javax.swing.JLabel verTarAbUser;
    private javax.swing.JLabel verTarAdm;
    private javax.swing.JLabel verUserAdm;
    // End of variables declaration//GEN-END:variables
}
