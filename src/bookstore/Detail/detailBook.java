/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.Detail;

/**
 *
 * @author N A T M A N
 */
public class detailBook extends javax.swing.JFrame {

    /**
     * Creates new form detailBook
     */
    public detailBook() {
        initComponents();
        this.setSize(1000, 540);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("add to cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 450, 110, 40);

        jButton2.setText("close");
        getContentPane().add(jButton2);
        jButton2.setBounds(860, 450, 100, 40);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(510, 360, 60, 30);

        jLabel1.setText("สำนักพิมพ์");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 110, 70, 30);

        jLabel2.setText("ผู้เขียน");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 170, 36, 16);

        jLabel3.setText("ประเภท");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 220, 41, 16);

        jLabel4.setText("ราคา");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 270, 26, 16);

        jLabel5.setText("สถานะ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 320, 36, 16);

        jLabel6.setText("จำนวนที่สั่ง");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 370, 70, 20);

        jLabel7.setText("ISBN");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(670, 120, 50, 20);

        jLabel8.setText("จำนวนหน้า");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(670, 170, 70, 16);

        jLabel9.setText("ครั้งที่พิมพ์");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(670, 220, 70, 20);

        jLabel10.setText("ปีที่พิมพ์");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(670, 270, 43, 16);

        jLabel11.setText("image");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 70, 270, 350);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("bookName");
        jLabel12.setEnabled(false);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(500, 30, 90, 30);

        jLabel13.setText("1");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(780, 270, 48, 16);

        jLabel14.setText("1");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(510, 120, 7, 16);

        jLabel15.setText("1");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(510, 170, 48, 16);

        jLabel16.setText("1");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(510, 220, 48, 16);

        jLabel17.setText("1");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(510, 270, 48, 16);

        jLabel18.setText("1");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(510, 320, 48, 16);

        jLabel19.setText("1");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(780, 120, 48, 16);

        jLabel20.setText("1");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(780, 170, 48, 16);

        jLabel21.setText("1");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(780, 220, 48, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(detailBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}