/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Priyadharshan
 */
public class Bakery_end extends javax.swing.JFrame {

    /**
     * Creates new form Bakery_end
     */
    public Bakery_end() {
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

        return_ = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1560, 835));
        getContentPane().setLayout(null);

        return_.setBackground(new java.awt.Color(223, 75, 75));
        return_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        return_.setForeground(new java.awt.Color(212, 176, 176));
        return_.setText("BACK");
        return_.setBorder(null);
        return_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_ActionPerformed(evt);
            }
        });
        getContentPane().add(return_);
        return_.setBounds(1120, 620, 90, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bakery - Copy (2).png"))); // NOI18N
        bg.setText("bg");
        getContentPane().add(bg);
        bg.setBounds(-10, -10, 1560, 835);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void return_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_ActionPerformed
        // TODO add your handling code here:
            Bakery_purchase o = new Bakery_purchase();
            o.setVisible(true);
    }//GEN-LAST:event_return_ActionPerformed

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
            java.util.logging.Logger.getLogger(Bakery_end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bakery_end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bakery_end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bakery_end.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bakery_end().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton return_;
    // End of variables declaration//GEN-END:variables
}
