/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6Lanjutan;

/**
 *
 * @author Nisrina Izdihar
 */
public class UjiKebolehan extends javax.swing.JFrame {

    /**
     * Creates new form UjiKebolehan
     */
    public UjiKebolehan() {
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

        jTextField1 = new javax.swing.JTextField();
        PilihanJenisKelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hitung = new javax.swing.JButton();
        CobaLagi = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        Nama = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Berat = new javax.swing.JTextField();
        rdbLaki = new javax.swing.JRadioButton();
        rdbPerempuan = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Ideal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        Saran = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 180, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 80, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("TINGGI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("BERAT BADAN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 160, 88, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("JENIS KELAMIN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 200, 100, 17);

        Hitung.setBackground(new java.awt.Color(255, 51, 51));
        Hitung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Hitung.setForeground(new java.awt.Color(255, 255, 0));
        Hitung.setText("HITUNG");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(30, 250, 90, 30);

        CobaLagi.setBackground(new java.awt.Color(255, 51, 51));
        CobaLagi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CobaLagi.setForeground(new java.awt.Color(255, 255, 0));
        CobaLagi.setText("COBA LAGI");
        CobaLagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobaLagiActionPerformed(evt);
            }
        });
        getContentPane().add(CobaLagi);
        CobaLagi.setBounds(140, 250, 110, 30);

        Keluar.setBackground(new java.awt.Color(255, 51, 51));
        Keluar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Keluar.setForeground(new java.awt.Color(255, 255, 0));
        Keluar.setText("KELUAR");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(270, 250, 90, 30);
        getContentPane().add(Nama);
        Nama.setBounds(140, 80, 190, 30);
        getContentPane().add(Tinggi);
        Tinggi.setBounds(140, 120, 60, 30);
        getContentPane().add(Berat);
        Berat.setBounds(140, 160, 60, 30);

        PilihanJenisKelamin.add(rdbLaki);
        rdbLaki.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbLaki.setText("LAKI-LAKI");
        getContentPane().add(rdbLaki);
        rdbLaki.setBounds(150, 200, 85, 25);

        PilihanJenisKelamin.add(rdbPerempuan);
        rdbPerempuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbPerempuan.setText("PEREMPUAN");
        getContentPane().add(rdbPerempuan);
        rdbPerempuan.setBounds(270, 200, 110, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Berat badan ideal adalah ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 290, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("cm");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 120, 40, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("kg");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 160, 30, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 290, 30, 30);
        getContentPane().add(Ideal);
        Ideal.setBounds(210, 290, 50, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Hasil diagnosa kesehatan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 330, 160, 20);
        getContentPane().add(Hasil);
        Hasil.setBounds(30, 360, 300, 30);
        getContentPane().add(Saran);
        Saran.setBounds(29, 400, 300, 30);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 440);

        setSize(new java.awt.Dimension(416, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CobaLagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobaLagiActionPerformed
        // TODO add your handling code here:
        Nama.setText("");
        Berat.setText("");
        Tinggi.setText("");
        Hasil.setText("");
        Saran.setText("");
        Ideal.setText("");
        PilihanJenisKelamin.clearSelection();
    }//GEN-LAST:event_CobaLagiActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
        double t, b, h = 0;
        
        t = Double.valueOf(Tinggi.getText());
        b = Double.valueOf(Berat.getText());
        String nm = Nama.getText();
        
        if(rdbLaki.isSelected()){
            h = (t - 100);
        }else if(rdbPerempuan.isSelected()){
            h = (t - 104);
        }
        String temp = Double.toString(h);
        
        if(h > b){
            Ideal.setText(temp);
            Hasil.setText("Maaf " + nm + " anda kekurangan berat badan ");
            Saran.setText("Makan yang banyak dan bergizi");
            
        }else if(h < b){
            Ideal.setText(temp);
            Hasil.setText("Maaf " + nm + " anda kelebihan berat badan ");
            Saran.setText("Perbanyaklah olahraga dan kurangi makan makanan berlemak ");
            
        }else if(h == b){
            Ideal.setText(temp);
            Hasil.setText("Selamat " + nm + " berat badan anda ideal ");
            Saran.setText("Pertahankanlah");
                    
        }
    }//GEN-LAST:event_HitungActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(UjiKebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UjiKebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UjiKebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UjiKebolehan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UjiKebolehan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JButton CobaLagi;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField Ideal;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Nama;
    private javax.swing.ButtonGroup PilihanJenisKelamin;
    private javax.swing.JTextField Saran;
    private javax.swing.JTextField Tinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rdbLaki;
    private javax.swing.JRadioButton rdbPerempuan;
    // End of variables declaration//GEN-END:variables
}