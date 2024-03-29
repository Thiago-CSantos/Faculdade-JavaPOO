/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhomvcswing.view;

/**
 *
 * @author thiag
 */
public class OpcaoView extends javax.swing.JFrame {

    /**
     * Creates new form OpcaoView
     */
    public OpcaoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelCadastrar = new javax.swing.JPanel();
        btnAlterarSenha = new javax.swing.JButton();
        lblResposta = new javax.swing.JLabel();
        btnJurosCompostos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        jpanelCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jpanelCadastrar.setToolTipText("");
        jpanelCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAlterarSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAlterarSenha.setForeground(new java.awt.Color(153, 21, 91));
        btnAlterarSenha.setText("Alterar senha");
        btnAlterarSenha.setBorderPainted(false);
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        lblResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnJurosCompostos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnJurosCompostos.setForeground(new java.awt.Color(153, 21, 91));
        btnJurosCompostos.setText("Calcular Juros Compostos");
        btnJurosCompostos.setBorderPainted(false);
        btnJurosCompostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJurosCompostosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ou");

        javax.swing.GroupLayout jpanelCadastrarLayout = new javax.swing.GroupLayout(jpanelCadastrar);
        jpanelCadastrar.setLayout(jpanelCadastrarLayout);
        jpanelCadastrarLayout.setHorizontalGroup(
            jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(160, 160, 160))
                    .addComponent(btnJurosCompostos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpanelCadastrarLayout.setVerticalGroup(
            jpanelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlterarSenha)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJurosCompostos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResposta))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        AlterarSenhaView jAlterarSenhaView = new AlterarSenhaView(); // Instancia a tela de alterar senha
        jAlterarSenhaView.setVisible(true); // Torna a tela de alterar senha visível
        jAlterarSenhaView.setLocationRelativeTo(null); // Centraliza a tela de alterar senha
        dispose(); // Fecha a tela de opções 
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void btnJurosCompostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJurosCompostosActionPerformed
        SimularJurosView jSimularJurosView = new SimularJurosView(); //     Instancia a tela de simular juros
        jSimularJurosView.setVisible(true); // Torna a tela de simular juros visível    
        jSimularJurosView.setLocationRelativeTo(null); // Centraliza a tela de simular juros    
        dispose(); // Fecha a tela de opções
    }//GEN-LAST:event_btnJurosCompostosActionPerformed

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
            java.util.logging.Logger.getLogger(OpcaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnJurosCompostos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpanelCadastrar;
    private javax.swing.JLabel lblResposta;
    // End of variables declaration//GEN-END:variables
}
