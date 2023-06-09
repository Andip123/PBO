/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalkulator;

/**
 *
 * @author andip
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    double NumberSatu;
    double NumberDua;
    double Result;
    String Op;
    public Kalkulator() {
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

        jtxResult = new javax.swing.JTextField();
        jtbnDigit8 = new javax.swing.JButton();
        jtbnDigit7 = new javax.swing.JButton();
        jtbnExit = new javax.swing.JButton();
        jtbnDigit9 = new javax.swing.JButton();
        jtbnDigit5 = new javax.swing.JButton();
        jtbnDigit6 = new javax.swing.JButton();
        jtbnKali = new javax.swing.JButton();
        jtbnDigit4 = new javax.swing.JButton();
        jtbnDigit2 = new javax.swing.JButton();
        jtbnDigit3 = new javax.swing.JButton();
        jtbnSama = new javax.swing.JButton();
        jtbnDigit1 = new javax.swing.JButton();
        jtbnDigit0 = new javax.swing.JButton();
        jtbnKoma = new javax.swing.JButton();
        jtbnHpsSatu = new javax.swing.JButton();
        jtbnHapus = new javax.swing.JButton();
        jtbnPlus = new javax.swing.JButton();
        jtbnMinus = new javax.swing.JButton();
        jtbnBagi = new javax.swing.JButton();
        jtbnPersen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxResult.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtxResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jtxResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 60));

        jtbnDigit8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit8.setText("8");
        jtbnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, 50));

        jtbnDigit7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit7.setText("7");
        jtbnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 50));

        jtbnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnExit.setText("E");
        jtbnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 60, 50));

        jtbnDigit9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit9.setText("9");
        jtbnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 60, 50));

        jtbnDigit5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit5.setText("5");
        jtbnDigit5.setToolTipText("");
        jtbnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 60, 50));

        jtbnDigit6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit6.setText("6");
        jtbnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, 50));

        jtbnKali.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnKali.setText("*");
        jtbnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnKaliActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 60, 50));

        jtbnDigit4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit4.setText("4");
        jtbnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 60, 50));

        jtbnDigit2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit2.setText("2");
        jtbnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 60, 50));

        jtbnDigit3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit3.setText("3");
        jtbnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, 50));

        jtbnSama.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnSama.setText("=");
        jtbnSama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnSamaActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnSama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 60, 50));

        jtbnDigit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit1.setText("1");
        jtbnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 60, 50));

        jtbnDigit0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnDigit0.setText("0");
        jtbnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 60, 50));

        jtbnKoma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnKoma.setText(".");
        jtbnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnKomaActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnKoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, 50));

        jtbnHpsSatu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnHpsSatu.setText("B");
        jtbnHpsSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnHpsSatuActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnHpsSatu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 60, 50));

        jtbnHapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnHapus.setText("C");
        jtbnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 60, 50));

        jtbnPlus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnPlus.setText("+");
        jtbnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 60, 50));

        jtbnMinus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnMinus.setText("-");
        jtbnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 60, 50));

        jtbnBagi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnBagi.setText("/");
        jtbnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnBagiActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnBagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 60, 50));

        jtbnPersen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbnPersen.setText("%");
        jtbnPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnPersenActionPerformed(evt);
            }
        });
        getContentPane().add(jtbnPersen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 60, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void EnterNumber(String q)
    {
        String Nums = jtxResult.getText()+ q;
        jtxResult.setText(Nums);
    }
    private void jtbnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit7ActionPerformed

        EnterNumber("7");
    }//GEN-LAST:event_jtbnDigit7ActionPerformed

    private void jtbnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit8ActionPerformed
        
        EnterNumber("8");
    }//GEN-LAST:event_jtbnDigit8ActionPerformed

    private void jtbnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit9ActionPerformed
        EnterNumber("9");
    }//GEN-LAST:event_jtbnDigit9ActionPerformed

    private void jtbnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit6ActionPerformed
        EnterNumber("6");
    }//GEN-LAST:event_jtbnDigit6ActionPerformed

    private void jtbnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit5ActionPerformed
       EnterNumber("5");
    }//GEN-LAST:event_jtbnDigit5ActionPerformed

    private void jtbnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit4ActionPerformed
        EnterNumber("4");
    }//GEN-LAST:event_jtbnDigit4ActionPerformed

    private void jtbnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit3ActionPerformed
        EnterNumber("3");
    }//GEN-LAST:event_jtbnDigit3ActionPerformed

    private void jtbnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit2ActionPerformed
        EnterNumber("2");
    }//GEN-LAST:event_jtbnDigit2ActionPerformed

    private void jtbnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit1ActionPerformed
        EnterNumber("1");
    }//GEN-LAST:event_jtbnDigit1ActionPerformed

    private void jtbnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnDigit0ActionPerformed
        EnterNumber("0");
    }//GEN-LAST:event_jtbnDigit0ActionPerformed

    private void jtbnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnBagiActionPerformed
        NumberSatu = Double.parseDouble(jtxResult.getText());
        jtxResult.setText("");
        Op = "/";
    }//GEN-LAST:event_jtbnBagiActionPerformed

    private void jtbnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnPlusActionPerformed
        NumberSatu = Double.parseDouble(jtxResult.getText());
        jtxResult.setText("");
        Op = "+";    
    }//GEN-LAST:event_jtbnPlusActionPerformed

    private void jtbnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnMinusActionPerformed
        NumberSatu = Double.parseDouble(jtxResult.getText());
        jtxResult.setText("");
        Op = "-"; 
    }//GEN-LAST:event_jtbnMinusActionPerformed

    private void jtbnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnKaliActionPerformed
        NumberSatu = Double.parseDouble(jtxResult.getText());
        jtxResult.setText("");
        Op = "*"; 
    }//GEN-LAST:event_jtbnKaliActionPerformed

    private void jtbnSamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnSamaActionPerformed
        NumberDua = Double.parseDouble(jtxResult.getText());
        if (Op== "+")
        {
            Result = NumberSatu + NumberDua;
            jtxResult.setText(String.valueOf(Result));
        }
        else if (Op == "-")
        {
            Result = NumberSatu - NumberDua;
            jtxResult.setText(String.valueOf(Result));
        }
        else if (Op == "*")
        {
            Result = NumberSatu * NumberDua;
            jtxResult.setText(String.valueOf(Result));
        }
        else if (Op == "%")
        {
            Result = (NumberDua/100) * NumberSatu;
            jtxResult.setText(String.valueOf(Result));
        }
        else if (Op == "/")
        {
            Result = NumberSatu / NumberDua;
            jtxResult.setText(String.valueOf(Result));
        } 
    }//GEN-LAST:event_jtbnSamaActionPerformed

    private void jtbnPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnPersenActionPerformed
        NumberSatu = Double.parseDouble(jtxResult.getText());
        jtxResult.setText("");
        Op = "%"; 
    }//GEN-LAST:event_jtbnPersenActionPerformed

    private void jtbnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnKomaActionPerformed
        if (! jtxResult.getText().contains("."));
        {
            jtxResult.setText(jtxResult.getText()+jtbnKoma.getText());
        }
    }//GEN-LAST:event_jtbnKomaActionPerformed

    private void jtbnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnHapusActionPerformed
        jtxResult.setText("");
    }//GEN-LAST:event_jtbnHapusActionPerformed

    private void jtbnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnExitActionPerformed
        jtxResult.setText("");
        
        String Fn, Sn;
        
        Fn = String.valueOf(NumberSatu);
        Sn = String.valueOf(NumberDua);
        
        Fn = " ";
        Sn = " ";
    }//GEN-LAST:event_jtbnExitActionPerformed

    private void jtbnHpsSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnHpsSatuActionPerformed
        
        String bk = null;
        
        if(jtxResult.getText(). length() > 0);
        {
            StringBuilder sb = new StringBuilder(jtxResult.getText());
            sb.deleteCharAt(jtxResult.getText().length()-1);
            bk = sb.toString();
            jtxResult.setText(bk);
        }
    }//GEN-LAST:event_jtbnHpsSatuActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jtbnBagi;
    private javax.swing.JButton jtbnDigit0;
    private javax.swing.JButton jtbnDigit1;
    private javax.swing.JButton jtbnDigit2;
    private javax.swing.JButton jtbnDigit3;
    private javax.swing.JButton jtbnDigit4;
    private javax.swing.JButton jtbnDigit5;
    private javax.swing.JButton jtbnDigit6;
    private javax.swing.JButton jtbnDigit7;
    private javax.swing.JButton jtbnDigit8;
    private javax.swing.JButton jtbnDigit9;
    private javax.swing.JButton jtbnExit;
    private javax.swing.JButton jtbnHapus;
    private javax.swing.JButton jtbnHpsSatu;
    private javax.swing.JButton jtbnKali;
    private javax.swing.JButton jtbnKoma;
    private javax.swing.JButton jtbnMinus;
    private javax.swing.JButton jtbnPersen;
    private javax.swing.JButton jtbnPlus;
    private javax.swing.JButton jtbnSama;
    private javax.swing.JTextField jtxResult;
    // End of variables declaration//GEN-END:variables
}
