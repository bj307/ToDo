/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.todo.view;

import br.com.todo.model.Pessoa;
import com.formdev.flatlaf.IntelliJTheme;
import java.awt.CardLayout;

/**
 * tela principal
 * @author kaior
 */
public class Setup extends javax.swing.JFrame {

    //instancia da tela de cadastro de usuarios
    CadastroUser cadUser = new CadastroUser();
    
    //instancia da tela de cadastro de tarefas
    //cadastro de tarefas recebe cadastro de usuários para acessar a lista de usuários
    CadastroTarefa cadTarefa = new CadastroTarefa(cadUser);
    
    //instancia da tela de login 
    //login recebe tela de usuario para validação de dados no login
    //login recebe tela setup para chamar o metodo logar
    Login login = new Login(cadUser, this);
    
    //instancia uma nova pessoa que recebe os dados do usuario autenticado
    Pessoa logado = login.getLogin();

    /**
     * Creates new form Setup
     */
    public Setup() {
        initComponents();
        recebeLogin.setLayout(new CardLayout());
        CardLayout cl = (CardLayout) (recebeLogin.getLayout());
        recebeLogin.add(login, "login");
        cl.show(recebeLogin, "inicio");
    }

    public Pessoa getLogado() {
        return logado;
    }

    //pessoa "logado" recebe a pessoa passada pela tela Login
    //de acordo com o tipo da pessoa, é iniciado o dashboard certo
    public void logar(Pessoa p) {
        logado = p;
        Dashboard dashboard = new Dashboard(this);
        dashboard.setVisible(true);
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
        recebeLogin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        recebeLogin.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout recebeLoginLayout = new javax.swing.GroupLayout(recebeLogin);
        recebeLogin.setLayout(recebeLoginLayout);
        recebeLoginLayout.setHorizontalGroup(
            recebeLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );
        recebeLoginLayout.setVerticalGroup(
            recebeLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(recebeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(recebeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        IntelliJTheme.setup(Setup.class.getResourceAsStream("/Material_Lighter.theme.json"));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel recebeLogin;
    // End of variables declaration//GEN-END:variables
}
