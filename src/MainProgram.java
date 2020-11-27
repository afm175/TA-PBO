
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;


/**
 *
 * @author Azzam
 */

public class MainProgram extends javax.swing.JFrame {

    /**
     * Creates new form MainProgram
     */
    public MainProgram() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        inputamount = new javax.swing.JTextField();
        pil1 = new javax.swing.JComboBox<>();
        pil2 = new javax.swing.JComboBox<>();
        convert = new javax.swing.JButton();
        output = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(68, 68, 68));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Result");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        inputamount.setBackground(new java.awt.Color(68, 68, 68));
        inputamount.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        inputamount.setForeground(new java.awt.Color(255, 255, 255));
        inputamount.setBorder(null);
        inputamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputamountKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputamountKeyTyped(evt);
            }
        });

        pil1.setBackground(new java.awt.Color(204, 204, 204));
        pil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "IDR", "SGD", "SAR", "JPY" }));
        pil1.setBorder(null);
        pil1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pil1MouseMoved(evt);
            }
        });

        pil2.setBackground(new java.awt.Color(204, 204, 204));
        pil2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "IDR", "SGD", "SAR", "JPY" }));
        pil2.setSelectedIndex(1);
        pil2.setBorder(null);
        pil2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pil2MouseMoved(evt);
            }
        });

        convert.setIcon(new javax.swing.ImageIcon("F:\\program\\praktikum dkp\\TA\\Converter\\Repeat Grid 7.png")); // NOI18N
        convert.setBorder(null);
        convert.setBorderPainted(false);
        convert.setContentAreaFilled(false);
        convert.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                convertMouseMoved(evt);
            }
        });
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        output.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        output.setForeground(new java.awt.Color(68, 68, 68));
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output.setText("-");

        jPanel2.setBackground(new java.awt.Color(0, 209, 205));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Currency Converter");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jButton1.setBackground(new java.awt.Color(0, 209, 205));
        jButton1.setIcon(new javax.swing.ImageIcon("F:\\program\\praktikum dkp\\TA\\Converter\\Repeat Grid 2.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, 50));

        jButton2.setBackground(new java.awt.Color(0, 209, 205));
        jButton2.setIcon(new javax.swing.ImageIcon("F:\\program\\praktikum dkp\\TA\\Converter\\Repeat Grid 5.png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 50));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("From");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("To");

        jButton3.setIcon(new javax.swing.ImageIcon("F:\\program\\praktikum dkp\\TA\\Converter\\Group 2.png")); // NOI18N
        jButton3.setActionCommand("clear");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Input Amount");

        jButton4.setIcon(new javax.swing.ImageIcon("F:\\program\\praktikum dkp\\TA\\Converter\\info.png")); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(inputamount, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(pil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(pil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(inputamount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(pil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(pil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed

// TODO add your handling code here:
        try {
            
        output.setForeground(Color.white);
        //deklarasi
        double input,hasil,a;
        double uang[]= {1, 14915, 1.413, 3.757, 106.942};
        String matauang[]= {"$","Rp","$","ر.س","¥"}; 
        
        
        //buat objek baru ke class penghitung
        penghitung hitung = new penghitung();
        
        //buat format matauang
        DecimalFormat numberFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols format = new DecimalFormatSymbols();
        format.setCurrencySymbol(matauang[pil2.getSelectedIndex()]);
        format.setMonetaryDecimalSeparator(',');
        format.setGroupingSeparator('.');
        
        numberFormat.setDecimalFormatSymbols(format);
        
        //mengambil input user
        input = Double.parseDouble(inputamount.getText());
        
        if(pil1.getSelectedItem().equals("USD")){
            //mengkonversi dengan memanggil method, ambil data kurs dari array
            //setter
            hitung.usdtoother(input, uang[pil2.getSelectedIndex()] ); 
            //getter
            hasil = hitung.ambilhasil();
            //mencetak hasil dan dengan format matauang
            output.setText(numberFormat.format(hasil));
        }
        //jika combobox 1 bukan USD
        else{
            //menghitung dengan memanggil method, matauang lain ke usd
            //setter
            hitung.othertousd(input, uang[pil1.getSelectedIndex()] );
            //getter
            a = hitung.ambilhasil();
            //hitung dari usd ke matauang tujuan
            //setter
            hitung.usdtoother(a, uang[pil2.getSelectedIndex()]);
            //getter
            hasil = hitung.ambilhasil();
            //mencetak hasil
            output.setText(numberFormat.format(hasil));
        }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_convertActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // tombol close
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //tombol minimize
         setState(ICONIFIED);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // tombol clear
        inputamount.setText(" ");
        output.setText(" ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void inputamountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputamountKeyPressed
        // keyb shortcut
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                convert.doClick();
                break;
            case KeyEvent.VK_DELETE:
                jButton3.doClick();
                break;
            case KeyEvent.VK_ESCAPE:
                jButton1.doClick();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_inputamountKeyPressed

    private void inputamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputamountKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)&&c!='.')
        {evt.consume();}

    }//GEN-LAST:event_inputamountKeyTyped

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
        // TODO add your handling code here:
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jButton2.setCursor(c);
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jButton1.setCursor(c);
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        // TODO add your handling code here:
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jButton3.setCursor(c);
    }//GEN-LAST:event_jButton3MouseMoved

    private void convertMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertMouseMoved
        // TODO add your handling code here:
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        convert.setCursor(c);
    }//GEN-LAST:event_convertMouseMoved

    private void pil1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pil1MouseMoved
        // TODO add your handling code here:
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        pil1.setCursor(c);
    }//GEN-LAST:event_pil1MouseMoved

    private void pil2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pil2MouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        pil2.setCursor(c);
    }//GEN-LAST:event_pil2MouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        info infotab = new info();
        infotab.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved
        // TODO add your handling code here:
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        jButton4.setCursor(c);        
    }//GEN-LAST:event_jButton4MouseMoved

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
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProgram().setVisible(true);
            }
        });

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JTextField inputamount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel output;
    private javax.swing.JComboBox<String> pil1;
    private javax.swing.JComboBox<String> pil2;
    // End of variables declaration//GEN-END:variables
}