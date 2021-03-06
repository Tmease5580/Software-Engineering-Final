/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nwUI;
import Checkout.*;
import grocery.*;

import javax.swing.JFrame;

/**
 *
 * @author addiemicke
 */
public class PaymentMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public PaymentMenu() {
        initComponents();
    }
    
    private final int _screen = 11;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        methodGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cashButton = new javax.swing.JRadioButton();
        creditButton = new javax.swing.JRadioButton();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submitB = new javax.swing.JButton();
        backB = new javax.swing.JButton();
        helpB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        monthField = new javax.swing.JComboBox<>();
        yearField = new javax.swing.JComboBox<>();
        cardNumFField = new javax.swing.JFormattedTextField();
        cvvFField = new javax.swing.JFormattedTextField();
        messageText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setText("Payment Information");

        cashButton.setBackground(new java.awt.Color(204, 204, 255));
        methodGroup.add(cashButton);
        cashButton.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        cashButton.setSelected(true);
        cashButton.setText("Cash");
        cashButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cashButton.setFocusPainted(false);
        cashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashButtonActionPerformed(evt);
            }
        });

        creditButton.setBackground(new java.awt.Color(204, 204, 255));
        methodGroup.add(creditButton);
        creditButton.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        creditButton.setText("Credit Card");
        creditButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creditButton.setFocusPainted(false);
        creditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditButtonActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        nameField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel2.setText("Name on Card");

        jLabel3.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel3.setText("Card Number");

        jLabel4.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel4.setText("Experation Date");

        jLabel6.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel6.setText("CVV");

        submitB.setBackground(java.awt.SystemColor.controlHighlight);
        submitB.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        submitB.setText("Submit");
        submitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitB.setFocusPainted(false);
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });

        backB.setBackground(java.awt.SystemColor.controlHighlight);
        backB.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        backB.setText("Back");
        backB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backB.setFocusPainted(false);
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        helpB.setBackground(java.awt.SystemColor.controlHighlight);
        helpB.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        helpB.setText("?");
        helpB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpB.setFocusPainted(false);
        helpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel7.setText("Month");

        jLabel8.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel8.setText("Year");

        monthField.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        monthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthField.setEnabled(false);

        yearField.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        yearField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028" }));
        yearField.setEnabled(false);

        try {
            cardNumFField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("################")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cardNumFField.setEnabled(false);
        cardNumFField.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        cardNumFField.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N

        try {
            cvvFField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cvvFField.setEnabled(false);
        cvvFField.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        cvvFField.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N

        messageText.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        messageText.setForeground(new java.awt.Color(102, 0, 51));
        messageText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cardNumFField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(cvvFField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(helpB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(backB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(submitB))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(messageText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(nameField)))
                    .addComponent(creditButton)
                    .addComponent(cashButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cashButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(creditButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cvvFField)
                    .addComponent(cardNumFField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitB)
                    .addComponent(backB)
                    .addComponent(helpB))
                .addGap(14, 14, 14))
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

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        String cardNum = cardNumFField.getText();
        String cvvNum = cvvFField.getText();
        String name = nameField.getText();
        if(cashButton.isSelected() == true){
            Receipt receipt = new Receipt();
            receipt.printReceipt();
            ReceiptMenu.receipt = Receipt._sOutput;
            JFrame receiptMenu = new ReceiptMenu();
            receiptMenu.setVisible(true);
            dispose();
        }else{
            if(name.length()<1 || cardNum.contains(" ") || cvvNum.contains(" ")){
                messageText.setText("Invalid input. Please try again.");
            }else{
                //add member data for credit card num, display last four digits in recepit
                Receipt receipt = new Receipt();
                receipt.printReceipt();
                ReceiptMenu.receipt = Receipt._sOutput; 
                JFrame receiptMenu = new ReceiptMenu();
                receiptMenu.setVisible(true);
                dispose();
            }
        }
        
    }//GEN-LAST:event_submitBActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        JFrame backMenu = new BackMenu();
        backMenu.setVisible(true);
    }//GEN-LAST:event_backBActionPerformed

    private void helpBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBActionPerformed
        JFrame helpMenu = new HelpMenu();
        helpMenu.setVisible(true);
    }//GEN-LAST:event_helpBActionPerformed

    private void creditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditButtonActionPerformed
        nameField.setEnabled(true);
        cardNumFField.setEnabled(true);
        cvvFField.setEnabled(true);
        monthField.setEnabled(true);
        yearField.setEnabled(true);
        
    }//GEN-LAST:event_creditButtonActionPerformed

    private void cashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashButtonActionPerformed
        nameField.setEnabled(false);
        cardNumFField.setEnabled(false);
        cvvFField.setEnabled(false);
        monthField.setEnabled(false);
        yearField.setEnabled(false);
    }//GEN-LAST:event_cashButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backB;
    private javax.swing.JFormattedTextField cardNumFField;
    private javax.swing.JRadioButton cashButton;
    private javax.swing.JRadioButton creditButton;
    private javax.swing.JFormattedTextField cvvFField;
    private javax.swing.JButton helpB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageText;
    private javax.swing.ButtonGroup methodGroup;
    private javax.swing.JComboBox<String> monthField;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton submitB;
    private javax.swing.JComboBox<String> yearField;
    // End of variables declaration//GEN-END:variables
}
