/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nwUI;

import javax.swing.JFrame;
import Checkout.*;
import grocery.*;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author liskiles
 */
public class CustomMenu extends javax.swing.JFrame {

    /**
     * Creates new form customFood
     */
    public CustomMenu(Sandwich sandwich) {
        initComponents();
        _sandwich=sandwich;
        
    }
    
    
    boolean bacon;
    boolean pepperoni;
    boolean guac;
    boolean mayo;
    boolean cheese;
    boolean sweet;
    boolean bell;
    boolean spinach;
    boolean mush;
    
    
    private final int _screen = 2;
    private static Sandwich _sandwich;
    static JLabel l;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        addB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        baconBox = new javax.swing.JCheckBox();
        pepperoniBox = new javax.swing.JCheckBox();
        guacBox = new javax.swing.JCheckBox();
        mayoBox = new javax.swing.JCheckBox();
        cheeseBox = new javax.swing.JCheckBox();
        sweetBox = new javax.swing.JCheckBox();
        bellBox = new javax.swing.JCheckBox();
        spinachBox = new javax.swing.JCheckBox();
        mushroomBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        helpB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        addB.setBackground(java.awt.SystemColor.controlHighlight);
        addB.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        addB.setText("Add to Cart");
        addB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addB.setFocusPainted(false);
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        cancelB.setBackground(java.awt.SystemColor.controlHighlight);
        cancelB.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        cancelB.setText("Cancel");
        cancelB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelB.setFocusPainted(false);
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        baconBox.setBackground(new java.awt.Color(204, 204, 255));
        baconBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        baconBox.setText("Bacon");
        baconBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baconBox.setFocusPainted(false);
        baconBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baconBoxActionPerformed(evt);
            }
        });

        pepperoniBox.setBackground(new java.awt.Color(204, 204, 255));
        pepperoniBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        pepperoniBox.setText("Pepperoni");
        pepperoniBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pepperoniBox.setFocusPainted(false);
        pepperoniBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepperoniBoxActionPerformed(evt);
            }
        });

        guacBox.setBackground(new java.awt.Color(204, 204, 255));
        guacBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        guacBox.setText("Guacamole");
        guacBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guacBox.setFocusPainted(false);
        guacBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guacBoxActionPerformed(evt);
            }
        });

        mayoBox.setBackground(new java.awt.Color(204, 204, 255));
        mayoBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        mayoBox.setText("Extra Mayo");
        mayoBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mayoBox.setFocusPainted(false);
        mayoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayoBoxActionPerformed(evt);
            }
        });

        cheeseBox.setBackground(new java.awt.Color(204, 204, 255));
        cheeseBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        cheeseBox.setText("Extra Cheese");
        cheeseBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cheeseBox.setFocusPainted(false);
        cheeseBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheeseBoxActionPerformed(evt);
            }
        });

        sweetBox.setBackground(new java.awt.Color(204, 204, 255));
        sweetBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        sweetBox.setText("Sweet Peppers");
        sweetBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sweetBox.setFocusPainted(false);
        sweetBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweetBoxActionPerformed(evt);
            }
        });

        bellBox.setBackground(new java.awt.Color(204, 204, 255));
        bellBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        bellBox.setText("Bell Peppers");
        bellBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bellBox.setFocusPainted(false);
        bellBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bellBoxActionPerformed(evt);
            }
        });

        spinachBox.setBackground(new java.awt.Color(204, 204, 255));
        spinachBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        spinachBox.setText("Spinach");
        spinachBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spinachBox.setFocusPainted(false);
        spinachBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinachBoxActionPerformed(evt);
            }
        });

        mushroomBox.setBackground(new java.awt.Color(204, 204, 255));
        mushroomBox.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        mushroomBox.setText("Mushrooms");
        mushroomBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mushroomBox.setFocusPainted(false);
        mushroomBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mushroomBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel5.setText("Customize Your Order");

        helpB.setBackground(java.awt.SystemColor.controlHighlight);
        helpB.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        helpB.setText("?");
        helpB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpB.setFocusPainted(false);
        helpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel8.setText("+ $0.30");

        jLabel9.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel9.setText("+ $0.20");

        jLabel10.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel10.setText("+ $0.13");

        jLabel11.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel11.setText("+ $0.09");

        jLabel12.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel12.setText("+ $0.09");

        jLabel13.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel13.setText("+ $0.25");

        jLabel14.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel14.setText("+ $0.17");

        jLabel15.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel15.setText("+ $0.16");

        jLabel16.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jLabel16.setText("+ $0.19");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(baconBox)
                                    .addComponent(spinachBox)
                                    .addComponent(mushroomBox)
                                    .addComponent(bellBox)
                                    .addComponent(cheeseBox)
                                    .addComponent(pepperoniBox)
                                    .addComponent(guacBox)
                                    .addComponent(mayoBox)
                                    .addComponent(sweetBox))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(helpB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addB)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baconBox)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pepperoniBox)
                    .addComponent(jLabel9))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guacBox)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mayoBox)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cheeseBox)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sweetBox)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bellBox)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinachBox)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mushroomBox)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addB)
                    .addComponent(cancelB)
                    .addComponent(helpB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guacBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guacBoxActionPerformed
        guac=guacBox.isSelected();
    }//GEN-LAST:event_guacBoxActionPerformed

    private void mushroomBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mushroomBoxActionPerformed
        mush=mushroomBox.isSelected();
    }//GEN-LAST:event_mushroomBoxActionPerformed

    private void helpBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBActionPerformed
        JFrame helpMenu = new HelpMenu();
        helpMenu.setVisible(true);
    }//GEN-LAST:event_helpBActionPerformed

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        bacon=baconBox.isSelected();
        pepperoni=pepperoniBox.isSelected();
        
        if(bacon){
            _sandwich=new BaconDecorator(_sandwich);
        }
        if(pepperoni){
            _sandwich=new PepperoniDecorator(_sandwich);
        }
        if(guac){
            _sandwich=new GuacamoleDecorator(_sandwich);
        }
        if(mayo){
            _sandwich=new MayoDecorator(_sandwich);
        }
        if(cheese){
            _sandwich=new CheeseDecorator(_sandwich);
        }
        if(sweet){
            _sandwich=new SweetPepperDecorator(_sandwich);
        }
        if(bell){
            _sandwich=new BellPepperDecorator(_sandwich);
        }
        if(spinach){
            _sandwich=new SpinachDecorator(_sandwich);
        }
        if(mush){
            _sandwich=new MushroomDecorator(_sandwich);
        }
        Cart cart = Cart.getInstance();
        ArrayList<Sandwich> orders = cart.getOrders();
        orders.add(_sandwich);
        boolean isAdded = false;
        for(int i=0;i<orders.size();i++){
            Sandwich toCheck = orders.get(i);
            if(toCheck.equals(_sandwich)){
                isAdded = true;
            }
        }
        if(isAdded){
            l.setText("Added "+_sandwich.getName() +" to cart!");
        }else{
            l.setText("An unexpected error has occured");
        }
        
        dispose();
    }//GEN-LAST:event_addBActionPerformed
    
    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        JFrame backMenu = new BackMenu();
        backMenu.setVisible(true);
    }//GEN-LAST:event_cancelBActionPerformed

    private void pepperoniBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepperoniBoxActionPerformed
        pepperoni=pepperoniBox.isSelected();
    }//GEN-LAST:event_pepperoniBoxActionPerformed

    private void baconBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baconBoxActionPerformed
        bacon=baconBox.isSelected();
    }//GEN-LAST:event_baconBoxActionPerformed

    private void mayoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayoBoxActionPerformed
        mayo=mayoBox.isSelected();
    }//GEN-LAST:event_mayoBoxActionPerformed

    private void cheeseBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheeseBoxActionPerformed
        cheese=cheeseBox.isSelected();
    }//GEN-LAST:event_cheeseBoxActionPerformed

    private void sweetBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweetBoxActionPerformed
        sweet=sweetBox.isSelected();
    }//GEN-LAST:event_sweetBoxActionPerformed

    private void bellBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bellBoxActionPerformed
        bell=bellBox.isSelected();
    }//GEN-LAST:event_bellBoxActionPerformed

    private void spinachBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinachBoxActionPerformed
        spinach=spinachBox.isSelected();
    }//GEN-LAST:event_spinachBoxActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(CustomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomMenu(_sandwich).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addB;
    private javax.swing.JCheckBox baconBox;
    private javax.swing.JCheckBox bellBox;
    private javax.swing.JButton cancelB;
    private javax.swing.JCheckBox cheeseBox;
    private javax.swing.JCheckBox guacBox;
    private javax.swing.JButton helpB;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox mayoBox;
    private javax.swing.JCheckBox mushroomBox;
    private javax.swing.JCheckBox pepperoniBox;
    private javax.swing.JCheckBox spinachBox;
    private javax.swing.JCheckBox sweetBox;
    // End of variables declaration//GEN-END:variables
}
