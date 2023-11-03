package com.mycompany.trabalhomvcswing.view;

import com.mycompany.trabalhomvcswing.controller.UsuarioController;

public class LoginUsuario extends javax.swing.JFrame {

    public LoginUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelCadastrar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblResposta = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnNaoCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        jpanelCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jpanelCadastrar.setToolTipText("");
        jpanelCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 21, 91));
        jLabel6.setText("e-mail:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 21, 91));
        jLabel2.setText("senha:");

        txtEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(153, 21, 91));
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNaoCadastro.setBackground(new java.awt.Color(255, 102, 102));
        btnNaoCadastro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNaoCadastro.setText("Não possui cadastro?");
        btnNaoCadastro.setBorderPainted(false);
        btnNaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelCadastrarLayout = new javax.swing.GroupLayout(jpanelCadastrar);
        jpanelCadastrar.setLayout(jpanelCadastrarLayout);
        jpanelCadastrarLayout.setHorizontalGroup(
            jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                .addGroup(jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                            .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenha))))
                    .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                                .addComponent(lblResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNaoCadastro)))))
                .addContainerGap())
        );
        jpanelCadastrarLayout.setVerticalGroup(
            jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(12, 12, 12)
                .addComponent(btnNaoCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResposta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

    UsuarioController usuarioController = new UsuarioController(); //Instanciando a classe UsuarioController    
    
    boolean igual = usuarioController.listaIgual(txtEmail.getText(), txtSenha.getText()); //Verificando se o e-mail e senha são iguais aos cadastrados
        
    if(igual == true){  //Se for igual, a tela de opções é aberta
        
        OpcaoView jOpcaoView = new OpcaoView(); //Instanciando a tela de opções
        jOpcaoView.setVisible(true); //Tornando a tela de opções visível
        jOpcaoView.setLocationRelativeTo(null); //Centralizando a tela de opções
//       SimularJurosView jSimularJurosView = new SimularJurosView();
//       jSimularJurosView.setVisible(true);
//       jSimularJurosView.setLocationRelativeTo(null);
       dispose();
    }
    else if(igual == false){
        lblResposta.setText("Senha ou e-mail incorreto!!"); //Se não for igual, aparece a mensagem de erro
    }    
    
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnNaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoCadastroActionPerformed
        //Fechar a Janela Cadastrar
        dispose(); //Fecha a tela de login

        CadastroUsuario jCadastro = new CadastroUsuario(); //Instanciando a tela de cadastro
        jCadastro.setVisible(true); //Tornando a tela de cadastro visível
        jCadastro.setLocationRelativeTo(null); //Centralizando a tela de cadastro

    }//GEN-LAST:event_btnNaoCadastroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNaoCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jpanelCadastrar;
    private javax.swing.JLabel lblResposta;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
