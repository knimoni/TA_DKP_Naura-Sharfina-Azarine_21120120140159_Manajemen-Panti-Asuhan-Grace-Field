/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static java.awt.image.ImageObserver.HEIGHT;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author naura
 */
public class Input1 extends javax.swing.JFrame {
    SetterGetter log = new SetterGetter();
    Pengurus lihat = new Pengurus();
    
    

    /**
     * Creates new form Input1
     */
    public Input1() {
        initComponents();
        setLocationRelativeTo(null);
        lakii.setActionCommand("Laki - Laki");
        perempuann.setActionCommand("Perempuan");
        lakii.setSelected(true);
    }
    
    void GolonganDarah (String goldar1,String goldar2, String goldar3, String goldar4, String goldar5){
        ArrayList<String> goldars = new ArrayList<>();
        Iterator<String> iter;
        goldarr.removeAllItems();
        goldars.add("Pilih Golongan Darah...");
        goldars.add(goldar1);
        goldars.add(goldar2);
        goldars.add(goldar3);
        goldars.add(goldar4);
        goldars.add(goldar5);
        iter = goldars.iterator();
        while(iter.hasNext()){
            goldarr.addItem(iter.next());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jeniskelamin = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        namaa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tinggii = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        goldarr = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tanggall = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        lakii = new javax.swing.JRadioButton();
        perempuann = new javax.swing.JRadioButton();
        addd = new javax.swing.JButton();
        umurr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_cancel_30px.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Daftar Pengurus");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nama Pengurus");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        namaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaaActionPerformed(evt);
            }
        });
        jPanel1.add(namaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, -1));

        jLabel4.setText("Tinggi Badan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        tinggii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinggiiiActionPerformed(evt);
            }
        });
        jPanel1.add(tinggii, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, -1));

        jLabel3.setText("Golongan darah");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        goldarr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Golongan darah", "A", "AB", "B", "O" }));
        goldarr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                goldarrrItemStateChanged(evt);
            }
        });
        goldarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldarrrActionPerformed(evt);
            }
        });
        jPanel1.add(goldarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 30));

        jLabel5.setText("Tanggal Lahir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel1.add(tanggall, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setText("Jenis Kelamin");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jeniskelamin.add(lakii);
        lakii.setText("Laki - Laki");
        lakii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiiiActionPerformed(evt);
            }
        });
        jPanel1.add(lakii, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jeniskelamin.add(perempuann);
        perempuann.setText("Perempuan");
        perempuann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuannnActionPerformed(evt);
            }
        });
        jPanel1.add(perempuann, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, -1));

        addd.setText("Add");
        addd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addddActionPerformed(evt);
            }
        });
        jPanel1.add(addd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 80, -1));

        umurr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umurrrActionPerformed(evt);
            }
        });
        jPanel1.add(umurr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, -1));

        jLabel8.setText("Umur");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaaActionPerformed

    private void addddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addddActionPerformed
        // TODO add your handling code here:
        
        namaa.setText(namaa.getText());
        log.setNama(namaa.getText());
        int Umur = Integer.parseInt(umurr.getText());
        umurr.setText(umurr.getText());
        log.setUmur(umurr.getText());
        String Goldar = goldarr.getSelectedItem().toString();
        log.setGoldar (Goldar);
        String Tanggall = ((JTextField)tanggall.getDateEditor().getUiComponent()).getText();
        log.setTanggall(Tanggall);
        String JenisKelamin = jeniskelamin.getSelection().getActionCommand();
        log.setJenisKelamin(JenisKelamin);
        int Tinggi = Integer.parseInt(tinggii.getText());
        tinggii.setText(tinggii.getText());
        log.setTinggi(tinggii.getText());
        if (namaa.getText().trim().isEmpty() || umurr.getText().trim().isEmpty() || (tinggii.getText().trim().isEmpty() || "Pilih Golongan Darah...".equals(Goldar)) || Tanggall.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ISI DENGAN LENGKAP", "WARNING", HEIGHT);
                   
        }
        else {
            JOptionPane.showMessageDialog(null, "data berhasil ditambahkan", "SUCCESSFULLY", HEIGHT);
        lihat.show();    
        lihat.pack();
        lihat.setLocationRelativeTo(null);

        lihat.Nama.setText(log.getNama());
        lihat.Umur.setText(log.getUmur());
        lihat.Tanggal.setText(log.getTanggall());
        lihat.Goldar.setText(log.getGoldar());
        lihat.JenisKelamin.setText(log.getJenisKelamin());
        lihat.Tinggi.setText(log.getTinggi());
        }        
    }//GEN-LAST:event_addddActionPerformed

    private void tinggiiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinggiiiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinggiiiActionPerformed

    private void lakiiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiiiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiiiActionPerformed

    private void perempuannnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuannnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuannnActionPerformed

    private void goldarrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldarrrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goldarrrActionPerformed

    private void goldarrrItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_goldarrrItemStateChanged
        // TODO add your handling code here:
        if(goldarr.getSelectedItem().equals("1")){
        }
        else if (goldarr.getSelectedItem().equals("2")){
        }
        else if (goldarr.getSelectedItem().equals("3")){
        }
        else if (goldarr.getSelectedItem().equals("4")){
        }
        else if (goldarr.getSelectedItem().equals("5")){
        }
    }//GEN-LAST:event_goldarrrItemStateChanged

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel16MousePressed

    int xx, xy;
    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void umurrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umurrrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umurrrActionPerformed

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
            java.util.logging.Logger.getLogger(Input1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addd;
    private javax.swing.JComboBox<String> goldarr;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup jeniskelamin;
    private javax.swing.JRadioButton lakii;
    private javax.swing.JTextField namaa;
    private javax.swing.JRadioButton perempuann;
    private com.toedter.calendar.JDateChooser tanggall;
    private javax.swing.JTextField tinggii;
    private javax.swing.JTextField umurr;
    // End of variables declaration//GEN-END:variables
}
