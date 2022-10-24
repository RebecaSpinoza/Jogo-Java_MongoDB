
import javax.swing.ImageIcon;
import java.util.Random;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Spinoza Rebeca
 */
public class Batalha1 extends javax.swing.JFrame {


    public Batalha1() {
        initComponents();
    
    }

    public void enviaNome(Home veioDoHome, String nome) {
        nome_jogador.setText(nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inimigo1 = new javax.swing.JLabel();
        his2 = new javax.swing.JLabel();
        his1 = new javax.swing.JLabel();
        dado1 = new javax.swing.JButton();
        valor_dado = new javax.swing.JLabel();
        jogador_escolhido = new javax.swing.JLabel();
        nome_jogador = new javax.swing.JTextField();
        jogadro_escolhido = new javax.swing.JLabel();
        floresta_escura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aurora");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, -1, -1));

        inimigo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\spinoza rebeca\\Downloads\\img_jogo\\5491edac-0c31-4fe5-ae9b-14ebb6a46fc0-removebg-preview.png")); // NOI18N
        jPanel1.add(inimigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 290, 560));

        his2.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 16)); // NOI18N
        his2.setForeground(new java.awt.Color(255, 255, 255));
        his2.setText("mas você não se deixa se levar pelo encanto, percebendo que na verdade tudo isso é uma armadilha e você tera de lutar.");
        jPanel1.add(his2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        his1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 16)); // NOI18N
        his1.setForeground(new java.awt.Color(255, 255, 255));
        his1.setText("Dentro desta floresta escura um aventureiro como você encontra uma linda fantasma que no inicio aparenta estar muito assustada, ");
        jPanel1.add(his1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        dado1.setBackground(new java.awt.Color(102, 102, 0));
        dado1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 16)); // NOI18N
        dado1.setText("Rode o Dado");
        dado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado1MouseClicked(evt);
            }
        });
        jPanel1.add(dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        valor_dado.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado.setText("0");
        jPanel1.add(valor_dado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, -1, -1));
        jPanel1.add(jogador_escolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 410, -1, -1));

        nome_jogador.setEditable(false);
        nome_jogador.setBackground(new java.awt.Color(1, 22, 1));
        nome_jogador.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        nome_jogador.setForeground(new java.awt.Color(255, 255, 255));
        nome_jogador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome_jogador.setText("Joagador sem nome");
        nome_jogador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nome_jogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_jogadorActionPerformed(evt);
            }
        });
        jPanel1.add(nome_jogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 270, 30));

        jogadro_escolhido.setIcon(new javax.swing.ImageIcon("C:\\Users\\spinoza rebeca\\Downloads\\img_jogo\\imagem_2022-10-18_154350877-depositphotos-bgremover.png")); // NOI18N
        jPanel1.add(jogadro_escolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 430, 190, 250));

        floresta_escura.setIcon(new javax.swing.ImageIcon("C:\\Users\\spinoza rebeca\\Downloads\\florestaescura_resized.png")); // NOI18N
        jPanel1.add(floresta_escura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_jogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_jogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_jogadorActionPerformed

    private void dado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado1MouseClicked
        // TODO add your handling code here:
        Random random = new Random();
        int number = random.nextInt(15);
        String dado = ""+number;
        valor_dado.setText(dado);
     
    }//GEN-LAST:event_dado1MouseClicked

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
            java.util.logging.Logger.getLogger(Batalha1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalha1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalha1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalha1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batalha1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dado1;
    private javax.swing.JLabel floresta_escura;
    private javax.swing.JLabel his1;
    private javax.swing.JLabel his2;
    private javax.swing.JLabel inimigo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jogador_escolhido;
    private javax.swing.JLabel jogadro_escolhido;
    private javax.swing.JTextField nome_jogador;
    private javax.swing.JLabel valor_dado;
    // End of variables declaration//GEN-END:variables

    void setIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

     
}
