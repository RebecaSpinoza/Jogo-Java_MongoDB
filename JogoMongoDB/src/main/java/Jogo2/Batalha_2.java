package Jogo2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

public class Batalha_2 extends javax.swing.JFrame {

    int jogada = 0;

    String res1;
    String res2;
    String nome;
    int v1 = 0, v2 = 0, v3 = 0;

    public Batalha_2() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    public void enviaNome(Home_jogo veioDoHome, String nome) {
        nome_jogador.setText(nome);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p2 = new javax.swing.JPanel();
        jba1 = new javax.swing.JLabel();
        nome_jogador = new javax.swing.JTextField();
        his2 = new javax.swing.JLabel();
        his3 = new javax.swing.JLabel();
        his1 = new javax.swing.JLabel();
        jogadro_escolhido = new javax.swing.JLabel();
        valor_dado = new javax.swing.JLabel();
        valor_dado1 = new javax.swing.JLabel();
        valor_dado2 = new javax.swing.JLabel();
        valor_dado3 = new javax.swing.JLabel();
        nome_jogador1 = new javax.swing.JTextField();
        inimigo_2 = new javax.swing.JLabel();
        dado2 = new javax.swing.JToggleButton();
        jba4 = new javax.swing.JLabel();
        jba3 = new javax.swing.JLabel();
        jba2 = new javax.swing.JLabel();
        resul_2 = new javax.swing.JLabel();
        resul_3 = new javax.swing.JLabel();
        resul_1 = new javax.swing.JLabel();
        caverna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jba1.setBackground(new java.awt.Color(245, 239, 225));
        jba1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jba1.setForeground(new java.awt.Color(0, 0, 0));
        jba1.setText("3");
        p2.add(jba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 20, 50));

        nome_jogador.setEditable(false);
        nome_jogador.setBackground(new java.awt.Color(216, 145, 74));
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
        p2.add(nome_jogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 270, 30));

        his2.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        his2.setForeground(new java.awt.Color(255, 255, 255));
        his2.setText("mas você é  rolavam sobre um tesouro perdido, mas o que você não esperava infelizmente aconteceu, UM GUARDIÃO.");
        p2.add(his2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        his3.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        his3.setForeground(new java.awt.Color(255, 255, 255));
        his3.setText("e você terá de Lutar.");
        p2.add(his3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        his1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        his1.setForeground(new java.awt.Color(255, 255, 255));
        his1.setText("Cansado após ser atacado pela Aurora dentro da floresta, você finalmente encontra a caverna perdida, onde boatos, ");
        p2.add(his1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jogadro_escolhido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imagem_2022-10-18_154350877-depositphotos-bgremover.png"))); // NOI18N
        p2.add(jogadro_escolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 190, 250));

        valor_dado.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado.setText("0");
        p2.add(valor_dado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, -1, -1));

        valor_dado1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado1.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado1.setText("0");
        p2.add(valor_dado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 20, -1));

        valor_dado2.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado2.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado2.setText("0");
        p2.add(valor_dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, -1, -1));

        valor_dado3.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        valor_dado3.setForeground(new java.awt.Color(255, 255, 255));
        valor_dado3.setText("0");
        p2.add(valor_dado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 640, -1, -1));

        nome_jogador1.setEditable(false);
        nome_jogador1.setBackground(new java.awt.Color(216, 145, 74));
        nome_jogador1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        nome_jogador1.setForeground(new java.awt.Color(255, 255, 255));
        nome_jogador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome_jogador1.setText("skeleton");
        nome_jogador1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nome_jogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_jogador1ActionPerformed(evt);
            }
        });
        p2.add(nome_jogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 590, 270, 30));

        inimigo_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skeleton.png"))); // NOI18N
        p2.add(inimigo_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 310, 400));

        dado2.setBackground(new java.awt.Color(216, 145, 74));
        dado2.setFont(new java.awt.Font("MingLiU-ExtB", 0, 18)); // NOI18N
        dado2.setText("Rode o dado");
        dado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado2ActionPerformed(evt);
            }
        });
        p2.add(dado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, -1, -1));

        jba4.setBackground(new java.awt.Color(245, 239, 225));
        jba4.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jba4.setForeground(new java.awt.Color(0, 0, 0));
        jba4.setText("2");
        p2.add(jba4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 20, 50));

        jba3.setBackground(new java.awt.Color(245, 239, 225));
        jba3.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jba3.setForeground(new java.awt.Color(0, 0, 0));
        jba3.setText("1");
        p2.add(jba3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 20, 50));

        jba2.setBackground(new java.awt.Color(245, 239, 225));
        jba2.setFont(new java.awt.Font("Showcard Gothic", 1, 68)); // NOI18N
        jba2.setForeground(new java.awt.Color(0, 0, 0));
        jba2.setText("Batalhas");
        p2.add(jba2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 370, 80));

        resul_2.setBackground(new java.awt.Color(255, 255, 255));
        resul_2.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        resul_2.setForeground(new java.awt.Color(0, 0, 0));
        resul_2.setText(".");
        p2.add(resul_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 330, 50));

        resul_3.setBackground(new java.awt.Color(255, 255, 255));
        resul_3.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        resul_3.setForeground(new java.awt.Color(0, 0, 0));
        resul_3.setText(".");
        p2.add(resul_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 330, 50));

        resul_1.setBackground(new java.awt.Color(255, 255, 255));
        resul_1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        resul_1.setForeground(new java.awt.Color(0, 0, 0));
        resul_1.setText(".");
        p2.add(resul_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 330, 50));

        caverna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caverna_1.png"))); // NOI18N
        p2.add(caverna, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_jogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_jogadorActionPerformed

    }//GEN-LAST:event_nome_jogadorActionPerformed

    private void nome_jogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_jogador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_jogador1ActionPerformed

    private void dado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado2ActionPerformed
        System.out.println("rodei");
        resultado2();

    }//GEN-LAST:event_dado2ActionPerformed
    public String resultado2() {
        Batalha_3 p3 = new Batalha_3();
        p3.nome = nome;
        p3.nome_jogador.setText(nome);
        Random random = new Random();
        int number = random.nextInt(15);
        String dado = "" + number;
        String resultado = "";
        res2 = "";

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
                dado2.setVisible(false);
                int soma = v1 + v2 + v3;

                if (soma > 10) {
                    JOptionPane.showMessageDialog(null, "você ganhou a Segunda batalha");
                    resultado = "GANHOU";
                    p3.res1 = res1;
                    p3.resul_1.setText(res1);
                    p3.res2 = resultado;
                    p3.resul_2.setText(resultado);
                    p3.setVisible(true);
                    System.out.println(resultado);
                    dispose();

                } else if (soma == 5) {
                    JOptionPane.showMessageDialog(null, "você ganhou por pouco");

                    resultado = "GANHOU POR POUCO";
                    p3.res1 = res1;
                    p3.resul_1.setText(res1);
                    p3.res2 = resultado;
                    p3.resul_2.setText(resultado);
                    p3.setVisible(true);
                    System.out.println(resultado);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "você perdeu a Segunda batalha");
                    p3.setVisible(true);
                    resultado = "PERDEU";
                    p3.res1 = res1;
                    p3.resul_1.setText(res1);
                    p3.res2 = resultado;
                    p3.resul_2.setText(resultado);
                    p3.setVisible(true);
                    System.out.println(resultado);
                    dispose();
                }

                break;

        }
        return resultado;
    }

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
            java.util.logging.Logger.getLogger(Batalha_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalha_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalha_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalha_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batalha_2().setVisible(true);
            }
        });
    }

    public String res2() {
        res2 = resultado2();
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caverna;
    private javax.swing.JToggleButton dado2;
    private javax.swing.JLabel his1;
    private javax.swing.JLabel his2;
    private javax.swing.JLabel his3;
    private javax.swing.JLabel inimigo_2;
    private javax.swing.JLabel jba1;
    private javax.swing.JLabel jba2;
    private javax.swing.JLabel jba3;
    private javax.swing.JLabel jba4;
    private javax.swing.JLabel jogadro_escolhido;
    public javax.swing.JTextField nome_jogador;
    private javax.swing.JTextField nome_jogador1;
    private javax.swing.JPanel p2;
    public javax.swing.JLabel resul_1;
    private javax.swing.JLabel resul_2;
    private javax.swing.JLabel resul_3;
    private javax.swing.JLabel valor_dado;
    private javax.swing.JLabel valor_dado1;
    private javax.swing.JLabel valor_dado2;
    private javax.swing.JLabel valor_dado3;
    // End of variables declaration//GEN-END:variables
}
