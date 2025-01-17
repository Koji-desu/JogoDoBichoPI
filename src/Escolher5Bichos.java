
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Koji
 */
public class Escolher5Bichos extends javax.swing.JFrame {

    public void escolhasPadrao() {
        escolha2.setSelectedIndex(1);
        escolha3.setSelectedIndex(2);
        escolha4.setSelectedIndex(3);
        escolha5.setSelectedIndex(4);

    }

    public Escolher5Bichos() {
        initComponents();
        escolhasPadrao();
        URL caminhoIcone = getClass().getResource("/imagem/monkey.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
    }

    public void Sortear() {
        jButton1.setText("Inicio");
        String bichos[];
        bichos = Inicial.nomeSorteado;
        Random r = new Random();
        int idx = r.nextInt(bichos.length);
        int idx2 = r.nextInt(bichos.length);
        int idx3 = r.nextInt(bichos.length);
        int idx4 = r.nextInt(bichos.length);
        int idx5 = r.nextInt(bichos.length);

        String bicho1, bicho2, bicho3, bicho4, bicho5;
        bicho1 = escolha1.getSelectedItem() + "";
        bicho2 = escolha2.getSelectedItem() + "";
        bicho3 = escolha3.getSelectedItem() + "";
        bicho4 = escolha4.getSelectedItem() + "";
        bicho5 = escolha5.getSelectedItem() + "";
        int acertos = 0;
        for (int i = 0; i < 1; i++) {

            if (bichos[idx].equals(bicho1)
                    || bichos[idx].equals(bicho2)
                    || bichos[idx].equals(bicho3)
                    || bichos[idx].equals(bicho4)
                    || bichos[idx].equals(bicho5)) {
                acertos += 1;
            }

            if (bichos[idx2].equals(bicho1)
                    || bichos[idx2].equals(bicho2)
                    || bichos[idx2].equals(bicho3)
                    || bichos[idx2].equals(bicho4)
                    || bichos[idx2].equals(bicho5)) {
                acertos += 1;
            }
            if (bichos[idx3].equals(bicho1)
                    || bichos[idx3].equals(bicho2)
                    || bichos[idx3].equals(bicho3)
                    || bichos[idx3].equals(bicho4)
                    || bichos[idx3].equals(bicho5)) {
                acertos += 1;
            }

            if (bichos[idx4].equals(bicho1)
                    || bichos[idx4].equals(bicho2)
                    || bichos[idx4].equals(bicho3)
                    || bichos[idx4].equals(bicho4)
                    || bichos[idx4].equals(bicho5)) {
                acertos += 1;
            }
            if (bichos[idx5].equals(bicho1)
                    || bichos[idx5].equals(bicho2)
                    || bichos[idx5].equals(bicho3)
                    || bichos[idx5].equals(bicho4)
                    || bichos[idx5].equals(bicho5)) {
                acertos += 1;
            }

            i++;

        }

        switch (acertos) {
            case 5:
                // if de 5 acertos
                jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + bichos[idx] + ", " + bichos[idx2] + ",  " + bichos[idx3] + ",  " + bichos[idx4] + " e " + bichos[idx5] + "\n\n" + "Você... ACERTOOOUU!!! \n\n 5 de 5 acertos\n Parabéns premio máximo!");
                jOptionPane2.showMessageDialog(null, "+100 coins!!!");
                break;
            case 4:
                // if de 4 acertos
                jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + bichos[idx] + ", " + bichos[idx2] + ",  " + bichos[idx3] + ",  " + bichos[idx4] + " e " + bichos[idx5] + "\n\n" + "Você... ACERTOOOUU!!! \n\n 4 de 5 acertos\n Parabéns pelo premio!");
                jOptionPane2.showMessageDialog(null, "+80 coins!!!");
                break;
            /* if de 3 acertos */
            case 3:
                jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + bichos[idx] + ", " + bichos[idx2] + ",  " + bichos[idx3] + ",  " + bichos[idx4] + " e " + bichos[idx5] + "\n\n" + "Você... ACERTOU!!! \n\n 3 de 5 acertos\n Parabéns pelo premio!");
                jOptionPane2.showMessageDialog(null, "+60 coins!!!");
                break;
            /* if de 2 acertos */
            case 2:
                jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + bichos[idx] + ",  " + bichos[idx2] + ",  " + bichos[idx3] + ",  " + bichos[idx4] + " e " + bichos[idx5] + "\n\n" + "Você... ACERTOUU! \n\n 2 de 5 acertos\n Parabéns pelo premio!");
                jOptionPane2.showMessageDialog(null, "+40 coins!!!");
                break;
            case 1:
                // IF de 1 acerto
                jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + bichos[idx] + ",  " + bichos[idx2] + ",  " + bichos[idx3] + ",  " + bichos[idx4] + " e " + bichos[idx5] + "\n\n" + "Você... Acertou! \n\n1 de 5 acertos");
                jOptionPane2.showMessageDialog(null, "+20 coins!!!");
                break;
            default:
                jOptionPane1.showMessageDialog(null, "Os animais sorteados foram: " + bichos[idx] + ",  " + bichos[idx2] + ",  " + bichos[idx3] + ",  " + bichos[idx4] + " e " + bichos[idx5] + "\n\n" + "Você... Errou, Tente novamente :(");
                jOptionPane2.showMessageDialog(null, "voce perdeu seus coins apostados");
                break;
        }

        jButton1.setEnabled(true);
        jButton2.setEnabled(false);        // TODO add your handling code here:

        jButton3.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        escolha1 = new javax.swing.JComboBox<>();
        escolha2 = new javax.swing.JComboBox<>();
        escolha3 = new javax.swing.JComboBox<>();
        escolha4 = new javax.swing.JComboBox<>();
        escolha5 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo do Bicho");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Escolha seus bichos");

        escolha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        escolha2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        escolha3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        escolha4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        escolha5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avestruz", "Águia", "Burro", "Borboleta", "Cachorro", "Cabra", "Carneiro", "Camelo", "Cobra", "Coelho", "Cavalo", "Elefante", "Galo", "Gato", "Jacaré", "Leão", "Macaco", "Porco", "Pavão", "Peru", "Touro", "Tigre", "Urso", "Veado", "Vaca" }));

        jButton2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton2.setText("Sortear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton3.setText("Jogar Novamente");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton1.setText("Inicio");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escolha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addComponent(escolha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(escolha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Sortear();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Inicial.escolherModo();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Inicial.inicial();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Escolher5Bichos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escolher5Bichos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escolher5Bichos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escolher5Bichos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escolher5Bichos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> escolha1;
    private javax.swing.JComboBox<String> escolha2;
    private javax.swing.JComboBox<String> escolha3;
    private javax.swing.JComboBox<String> escolha4;
    private javax.swing.JComboBox<String> escolha5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    // End of variables declaration//GEN-END:variables
}
