package Jogo2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Spinoza Rebeca
 */
public class Batalha_1 extends javax.swing.JFrame {

    int jogada = 0;
    String res1;
    String nome;

    int v1 = 0, v2 = 0, v3 = 0;

    public Batalha_1() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
    }

    public void enviaNome(Home_jogo veioDoHome, String nome) {
        nome_jogador.setText(nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        jogadro_escolhido = new javax.swing.JLabel();
        nome_jogador = new javax.swing.JTextField();
        valor_dado1 = new javax.swing.JLabel();
        valor_dado2 = new javax.swing.JLabel();
        valor_dado3 = new javax.swing.JLabel();
        dado1 = new javax.swing.JButton();
        valor_dado = new javax.swing.JLabel();
        nome_jogador1 = new javax.swing.JTextField();
        inimigo1 = new javax.swing.JLabel();
        his2 = new javax.swing.JLabel();
        his1 = new javax.swing.JLabel();
        jba3 = new javax.swing.JLabel();
        floresta_escura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jogadro_escolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagem_2022-10-18_154350877-depositphotos-bgremover.png"))); // NOI18N
        p1.add(jogadro_escolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 190, 250));

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
        p1.add(nome_jogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 270, 30));

        valor_dado1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado1.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado1.setText("0");
        p1.add(valor_dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 20, -1));

        valor_dado2.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado2.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado2.setText("0");
        p1.add(valor_dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, -1, -1));

        valor_dado3.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado3.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado3.setText("0");
        p1.add(valor_dado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, -1, -1));

        dado1.setBackground(new java.awt.Color(102, 102, 0));
        dado1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 16)); // NOI18N
        dado1.setText("Rode o Dado");
        dado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado1MouseClicked(evt);
            }
        });
        p1.add(dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        valor_dado.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado.setText("0");
        p1.add(valor_dado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        nome_jogador1.setEditable(false);
        nome_jogador1.setBackground(new java.awt.Color(1, 22, 1));
        nome_jogador1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        nome_jogador1.setForeground(new java.awt.Color(255, 255, 255));
        nome_jogador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome_jogador1.setText("Aurora");
        nome_jogador1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nome_jogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_jogador1ActionPerformed(evt);
            }
        });
        p1.add(nome_jogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 570, 270, 30));

        inimigo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aurora.png"))); // NOI18N
        p1.add(inimigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 220, 340));

        his2.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 16)); // NOI18N
        his2.setForeground(new java.awt.Color(255, 255, 255));
        his2.setText("mas você não se deixa se levar pelo encanto, percebendo que na verdade tudo isso é uma armadilha e você tera de lutar.");
        p1.add(his2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        his1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 16)); // NOI18N
        his1.setForeground(new java.awt.Color(255, 255, 255));
        his1.setText("Dentro desta floresta escura um aventureiro como você encontra uma linda fantasma que no inicio aparenta estar muito assustada, ");
        p1.add(his1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jba3.setBackground(new java.awt.Color(245, 239, 225));
        jba3.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jba3.setForeground(new java.awt.Color(255, 255, 255));
        jba3.setText("rODE O DADO PARA ATACAR O INIMIGO, SE A SOMA DOS VALORES FOREM MAIOR QUE 15 VOCÊ GANHA");
        p1.add(jba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 930, 50));

        floresta_escura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/florestaescura_resized.png"))); // NOI18N
        p1.add(floresta_escura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_jogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_jogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_jogadorActionPerformed


    private void dado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado1MouseClicked

        resultado();


    }//GEN-LAST:event_dado1MouseClicked
    public String resultado() {
        Random random = new Random();
        Batalha_2 p2 = new Batalha_2();
        Batalha_2 resul_1 = new Batalha_2();
        int number = random.nextInt(15);
        String dado = "" + number;
        String resultado = "";
        res1 = "";

        p2.nome = nome;
        p2.nome_jogador.setText(nome);
        valor_dado.setText(dado);
        jogada++;
        switch (jogada) {

            case 1:
                valor_dado1.setText(dado);
                v1 = number;
                System.out.println(v1);
                break;
            case 2:
                valor_dado2.setText(dado);
                v2 = number;
                System.out.println(v2);
                break;
            case 3:
                valor_dado3.setText(dado);
                v3 = number;
                System.out.println(v3);
                dado1.setVisible(false);
                int soma = v1 + v2 + v3;

                if (soma > 10) {
                    JOptionPane.showMessageDialog(null, "você ganhou a primeira batalha");
                    resultado = "GANHOU";
                    p2.res1 = resultado;
                    p2.resul_1.setText(resultado);
                    p2.setVisible(true);
                    resultado = "GANHOU";

                    System.out.println(resultado);
                    dispose();

                } else if (soma == 5) {
                    JOptionPane.showMessageDialog(null, "você ganhou por pouco");
                    resultado = "GANHOU POR POUCO";
                    p2.res1 = resultado;
                    p2.resul_1.setText(resultado);
                    p2.setVisible(true);
                    System.out.println(resultado);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "você perdeu a primeira batalha");
                    resultado = "PERDEU";
                    p2.res1 = resultado;
                    p2.resul_1.setText(resultado);
                    p2.setVisible(true);
                    System.out.println(resultado);
                    dispose();

                }

                break;

        }
        return resultado;
    }

    private void nome_jogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_jogador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_jogador1ActionPerformed

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
            java.util.logging.Logger.getLogger(Batalha_1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalha_1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalha_1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalha_1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batalha_1().setVisible(true);

            }
        });
    }

    public String res1() {
        res1 = resultado();
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dado1;
    private javax.swing.JLabel floresta_escura;
    private javax.swing.JLabel his1;
    private javax.swing.JLabel his2;
    private javax.swing.JLabel inimigo1;
    private javax.swing.JLabel jba3;
    private javax.swing.JLabel jogadro_escolhido;
    public javax.swing.JTextField nome_jogador;
    private javax.swing.JTextField nome_jogador1;
    private javax.swing.JPanel p1;
    private javax.swing.JLabel valor_dado;
    private javax.swing.JLabel valor_dado1;
    private javax.swing.JLabel valor_dado2;
    private javax.swing.JLabel valor_dado3;
    // End of variables declaration//GEN-END:variables
}
