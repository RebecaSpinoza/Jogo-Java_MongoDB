
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Gabriela Gonzaga
 */
public class Home extends javax.swing.JFrame {

  

    /**
     * Creates new form NewJFrame
     */
    public Home() {
        initComponents();
    }
    
    Batalha1 fescura = new Batalha1();
  
    Batalha1 jogador_escolhido = new Batalha1();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_pane1 = new javax.swing.JPanel();
        jba = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        escolhe_mago = new javax.swing.JButton();
        mago = new javax.swing.JLabel();
        jba1 = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        side_pane1.setBackground(new java.awt.Color(0, 0, 0));
        side_pane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jba.setBackground(new java.awt.Color(245, 239, 225));
        jba.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        jba.setForeground(new java.awt.Color(255, 255, 255));
        jba.setText("Escreva seu nome para começar");
        side_pane1.add(jba, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 400, -1));

        txtnome.setBackground(new java.awt.Color(51, 0, 102));
        txtnome.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 24)); // NOI18N
        txtnome.setForeground(new java.awt.Color(255, 255, 255));
        txtnome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnome.setText("digite seu nome");
        txtnome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtnomeCaretUpdate(evt);
            }
        });
        txtnome.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                txtnomeAncestorRemoved(evt);
            }
        });
        txtnome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnomeMouseClicked(evt);
            }
        });
        txtnome.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtnomeInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        side_pane1.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 410, 40));

        escolhe_mago.setBackground(new java.awt.Color(198, 175, 124));
        escolhe_mago.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        escolhe_mago.setText("START");
        escolhe_mago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escolhe_magoMouseClicked(evt);
            }
        });
        escolhe_mago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhe_magoActionPerformed(evt);
            }
        });
        side_pane1.add(escolhe_mago, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 250, -1));

        mago.setIcon(new javax.swing.ImageIcon("C:\\Users\\spinoza rebeca\\Downloads\\mago_resized.png")); // NOI18N
        mago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                magoMouseClicked(evt);
            }
        });
        side_pane1.add(mago, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        jba1.setBackground(new java.awt.Color(245, 239, 225));
        jba1.setFont(new java.awt.Font("MingLiU-ExtB", 1, 68)); // NOI18N
        jba1.setForeground(new java.awt.Color(255, 255, 255));
        jba1.setText("Floresta Encantada");
        side_pane1.add(jba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 680, 180));

        aviso.setForeground(new java.awt.Color(255, 255, 255));
        side_pane1.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 190, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\spinoza rebeca\\Downloads\\img_jogo\\florestaencantada3.png")); // NOI18N
        side_pane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 630));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        side_pane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(side_pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void magoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_magoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_magoMouseClicked

    private void txtnomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnomeMouseClicked
        // TODO add your handling code here:
        txtnome.setText("");
        escolhe_mago.setVisible(false);


    }//GEN-LAST:event_txtnomeMouseClicked

    private void escolhe_magoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhe_magoActionPerformed
 

    }//GEN-LAST:event_escolhe_magoActionPerformed

    private void escolhe_magoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escolhe_magoMouseClicked
        // TODO add your handling code here:

        String valornome = txtnome.getText();
            fescura.enviaNome(this, txtnome.getText());
            JOptionPane.showMessageDialog(null, "Bem vindo ao Jogo");
            fescura.setVisible(true);
            
       

    }//GEN-LAST:event_escolhe_magoMouseClicked

    private void txtnomeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtnomeInputMethodTextChanged

    }//GEN-LAST:event_txtnomeInputMethodTextChanged

    private void txtnomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtnomeCaretUpdate
        // TODO add your handling code here:   
        escolhe_mago.setVisible(true);
       
    }//GEN-LAST:event_txtnomeCaretUpdate

    private void txtnomeAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtnomeAncestorRemoved
        // TODO add your handling code here:

    }//GEN-LAST:event_txtnomeAncestorRemoved

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton escolhe_mago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jba;
    private javax.swing.JLabel jba1;
    private javax.swing.JLabel mago;
    private javax.swing.JPanel side_pane1;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables

}
