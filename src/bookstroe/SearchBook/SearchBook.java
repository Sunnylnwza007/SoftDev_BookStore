/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstroe.SearchBook;

/**
 *
 * @author N A T M A N
 */
public class SearchBook extends javax.swing.JFrame {

    /**
     * Creates new form SearchBook
     */
    public SearchBook() {
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

        P8 = new javax.swing.JLabel();
        P7 = new javax.swing.JLabel();
        P6 = new javax.swing.JLabel();
        P5 = new javax.swing.JLabel();
        N8 = new javax.swing.JLabel();
        M8 = new javax.swing.JLabel();
        M7 = new javax.swing.JLabel();
        N7 = new javax.swing.JLabel();
        N6 = new javax.swing.JLabel();
        M6 = new javax.swing.JLabel();
        M5 = new javax.swing.JLabel();
        N5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        P8.setBackground(new java.awt.Color(0, 0, 0));
        P8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/5.jpg"))); // NOI18N
        P8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(P8);
        P8.setBounds(720, 220, 120, 160);

        P7.setBackground(new java.awt.Color(0, 0, 0));
        P7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/9.jpg"))); // NOI18N
        P7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(P7);
        P7.setBounds(510, 220, 120, 160);

        P6.setBackground(new java.awt.Color(0, 0, 0));
        P6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/3.jpg"))); // NOI18N
        P6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(P6);
        P6.setBounds(300, 220, 120, 160);

        P5.setBackground(new java.awt.Color(0, 0, 0));
        P5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/Book/12.jpg"))); // NOI18N
        P5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(P5);
        P5.setBounds(90, 220, 120, 160);

        N8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        N8.setText("ไม่พบข้อมูล");
        getContentPane().add(N8);
        N8.setBounds(720, 400, 170, 19);

        M8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        M8.setText("ไม่พบข้อมูล");
        getContentPane().add(M8);
        M8.setBounds(720, 430, 120, 19);

        M7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        M7.setText("ไม่พบข้อมูล");
        getContentPane().add(M7);
        M7.setBounds(510, 430, 120, 19);

        N7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        N7.setText("ไม่พบข้อมูล");
        getContentPane().add(N7);
        N7.setBounds(510, 400, 170, 19);

        N6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        N6.setText("ไม่พบข้อมูล");
        getContentPane().add(N6);
        N6.setBounds(300, 400, 170, 19);

        M6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        M6.setText("ไม่พบข้อมูล");
        getContentPane().add(M6);
        M6.setBounds(300, 430, 120, 19);

        M5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        M5.setText("ไม่พบข้อมูล");
        getContentPane().add(M5);
        M5.setBounds(90, 430, 120, 19);

        N5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        N5.setText("ไม่พบข้อมูล");
        getContentPane().add(N5);
        N5.setBounds(90, 400, 170, 19);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/1200-160.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel M5;
    private javax.swing.JLabel M6;
    private javax.swing.JLabel M7;
    private javax.swing.JLabel M8;
    private javax.swing.JLabel N5;
    private javax.swing.JLabel N6;
    private javax.swing.JLabel N7;
    private javax.swing.JLabel N8;
    private javax.swing.JLabel P5;
    private javax.swing.JLabel P6;
    private javax.swing.JLabel P7;
    private javax.swing.JLabel P8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
