/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Koji
 */
public class InicialTeste extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    /** Métodos e Funções **/
    public void inicial() {
        InicialTeste i = new InicialTeste();
        this.dispose();
        i.setVisible(true);
    }

    public void nextModo() {

        EscolherModoTeste t = new EscolherModoTeste();
        this.dispose();
        t.setVisible(true);
        

    }

    public void nextLista() {
        ListaTeste l = new ListaTeste();
        this.dispose();
        l.setVisible(true);
    }

    public void nextRegras() {
        RegrasTeste r = new RegrasTeste();
        this.dispose();
        r.setVisible(true);
    }
    public InicialTeste() {
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

        jogarButton = new javax.swing.JButton();
        regrasButton = new javax.swing.JButton();
        listaButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bemvindoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo do Bicho");

        jogarButton.setText("Jogar");
        jogarButton.setBorder(new javax.swing.border.MatteBorder(null));
        jogarButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jogarButtonFocusLost(evt);
            }
        });
        jogarButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jogarButtonComponentHidden(evt);
            }
        });
        jogarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarButtonActionPerformed(evt);
            }
        });

        regrasButton.setText("Regras");
        regrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regrasButtonActionPerformed(evt);
            }
        });

        listaButton.setText("Lista");
        listaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Escolha uma opção abaixo");

        bemvindoLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        bemvindoLabel.setText("Bem-vindo!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(listaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jogarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(regrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(bemvindoLabel)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(bemvindoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jogarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(regrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jogarButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jogarButtonFocusLost

    }//GEN-LAST:event_jogarButtonFocusLost

    private void jogarButtonComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jogarButtonComponentHidden
        this.dispose();
    }//GEN-LAST:event_jogarButtonComponentHidden

    private void jogarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarButtonActionPerformed
        nextModo();
        
    }//GEN-LAST:event_jogarButtonActionPerformed

    private void regrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regrasButtonActionPerformed

        nextRegras();
    }//GEN-LAST:event_regrasButtonActionPerformed

    private void listaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaButtonActionPerformed
        nextLista();
        
    }//GEN-LAST:event_listaButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InicialTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemvindoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jogarButton;
    private javax.swing.JButton listaButton;
    private javax.swing.JButton regrasButton;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
