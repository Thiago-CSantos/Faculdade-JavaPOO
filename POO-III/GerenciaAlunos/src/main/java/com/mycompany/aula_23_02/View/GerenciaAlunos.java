package com.mycompany.aula_23_02.View;

import com.mycompany.aula_23_02.Controller.AlunoController;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author android
 */
public class GerenciaAlunos extends javax.swing.JFrame {

    private static AlunoController controller = null;

    /**
     * Creates new form NewJFrame
     */
    public GerenciaAlunos() throws IOException {
        initComponents();
        if (controller == null) {
            controller = new AlunoController();
        }
        try {
            controller.carregaAlunos();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ainda não há alunos cadastrados\n" + ex.getMessage());
            ex.printStackTrace();
            Logger.getLogger(GerenciaAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadastrar = new javax.swing.JMenuItem();
        jMenuListar = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenuItem();
        jMenuRemover = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Alunos");
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Programa");

        jMenuCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuCadastrar.setText("Cadastrar");
        jMenuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastrar);

        jMenuListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuListar.setText("Listar");
        jMenuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuListar);

        jMenuEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuEditar.setText("Editar");
        jMenu1.add(jMenuEditar);

        jMenuRemover.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuRemover.setText("Remover");
        jMenu1.add(jMenuRemover);

        jMenuBar1.add(jMenu1);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseClicked(evt);
            }
        });
        jMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CadastraAluno(this).setVisible(true);
    }//GEN-LAST:event_jMenuCadastrarActionPerformed

    private void jMenuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarActionPerformed
        ListagemDeAlunos lista = new ListagemDeAlunos();
        lista.setVisible(true);

    }//GEN-LAST:event_jMenuListarActionPerformed

    private void jMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSobreActionPerformed

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,
                "Quem fez esse código foi o Thiagoooooo!");
    }//GEN-LAST:event_jMenuSobreMouseClicked

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
            java.util.logging.Logger.getLogger(GerenciaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GerenciaAlunos().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GerenciaAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastrar;
    private javax.swing.JMenuItem jMenuEditar;
    private javax.swing.JMenuItem jMenuListar;
    private javax.swing.JMenuItem jMenuRemover;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables
}
