package com.yumxpress.gui;

import com.yumxpress.dao.CompanyDAO;
import com.yumxpress.dao.PlaceOrderDAO;
import com.yumxpress.dao.ProductDAO;
import com.yumxpress.dao.StaffDAO;
import com.yumxpress.pojo.PlaceOrderPojo;
import com.yumxpress.pojo.ProductPojo;
import com.yumxpress.utility.UserProfile;
import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OrderFoodFrame extends javax.swing.JFrame {

    /**
     * Creates new form OrderFoodFrame
     */
    int pos = -1;
    int track = 0;
    int index;
    private Map<String, String> allSeller = new HashMap<>();
    private int foodIndex = 0;
    private int loc = 1;
    List<ProductPojo> pro = new ArrayList<>();

    //Map<String,ProductPojo> productDetails=new HashMap<>();
    public OrderFoodFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblUserName.setText("HELLO " + UserProfile.getUserName());
        loadAllSeller();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnMyAccount = new javax.swing.JButton();
        btnMyCart = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFoodImg3 = new javax.swing.JLabel();
        lblFoodName3 = new javax.swing.JLabel();
        lblFoodImg6 = new javax.swing.JLabel();
        lblFoodName6 = new javax.swing.JLabel();
        jcbAllSellerName = new javax.swing.JComboBox<>();
        lblFoodImg1 = new javax.swing.JLabel();
        lblFoodImg2 = new javax.swing.JLabel();
        lblFoodName1 = new javax.swing.JLabel();
        lblFoodName2 = new javax.swing.JLabel();
        lblFoodImg4 = new javax.swing.JLabel();
        lblFoodImg5 = new javax.swing.JLabel();
        lblFoodName4 = new javax.swing.JLabel();
        lblFoodName5 = new javax.swing.JLabel();
        lblLeftArrow = new javax.swing.JLabel();
        lblRightArrow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/user.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 190));

        lblUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUserName.setText("@null");
        jPanel2.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 40));

        btnMyAccount.setBackground(new java.awt.Color(253, 183, 2));
        btnMyAccount.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMyAccount.setText("My Account");
        btnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAccountActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, -1));

        btnMyCart.setBackground(new java.awt.Color(253, 183, 2));
        btnMyCart.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMyCart.setText("My Cart");
        btnMyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCartActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 170, -1));

        btnCancelOrder.setBackground(new java.awt.Color(253, 183, 2));
        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 170, -1));

        btnOrderHistory.setBackground(new java.awt.Color(253, 183, 2));
        btnOrderHistory.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnOrderHistory.setText("Order History");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrderHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 170, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 260, 10));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 600));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 103, 255));
        jLabel4.setText("Order Food");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 230, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 103, 255));
        jLabel5.setText("Filter");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 50, 30));

        lblFoodImg3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblFoodImg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoodImg3MouseClicked(evt);
            }
        });
        jPanel1.add(lblFoodImg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 150, 130));

        lblFoodName3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodName3.setForeground(new java.awt.Color(253, 183, 2));
        lblFoodName3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblFoodName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 150, 30));

        lblFoodImg6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImg6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblFoodImg6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoodImg6MouseClicked(evt);
            }
        });
        jPanel1.add(lblFoodImg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 150, 130));

        lblFoodName6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodName6.setForeground(new java.awt.Color(253, 183, 2));
        lblFoodName6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblFoodName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 150, 30));

        jcbAllSellerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbAllSellerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAllSellerNameActionPerformed(evt);
            }
        });
        jPanel1.add(jcbAllSellerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 250, -1));

        lblFoodImg1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblFoodImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoodImg1MouseClicked(evt);
            }
        });
        jPanel1.add(lblFoodImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 150, 130));

        lblFoodImg2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImg2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblFoodImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoodImg2MouseClicked(evt);
            }
        });
        jPanel1.add(lblFoodImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 150, 130));

        lblFoodName1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodName1.setForeground(new java.awt.Color(253, 183, 2));
        lblFoodName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblFoodName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 150, 30));

        lblFoodName2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodName2.setForeground(new java.awt.Color(253, 183, 2));
        lblFoodName2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblFoodName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 150, 30));

        lblFoodImg4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImg4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblFoodImg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoodImg4MouseClicked(evt);
            }
        });
        jPanel1.add(lblFoodImg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 150, 130));

        lblFoodImg5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodImg5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblFoodImg5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoodImg5MouseClicked(evt);
            }
        });
        jPanel1.add(lblFoodImg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 160, 130));

        lblFoodName4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodName4.setForeground(new java.awt.Color(253, 183, 2));
        lblFoodName4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblFoodName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 150, 30));

        lblFoodName5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFoodName5.setForeground(new java.awt.Color(253, 183, 2));
        lblFoodName5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lblFoodName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 160, 30));

        lblLeftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/icons8-left-arrow-64 (1).png"))); // NOI18N
        lblLeftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLeftArrowMouseClicked(evt);
            }
        });
        jPanel1.add(lblLeftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 70, 70));

        lblRightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/icons8-right-arrow-64.png"))); // NOI18N
        lblRightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRightArrowMouseClicked(evt);
            }
        });
        jPanel1.add(lblRightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAccountActionPerformed
        CustomerAccountFrame customerAccountFrame = new CustomerAccountFrame();
        customerAccountFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyAccountActionPerformed

    private void btnMyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCartActionPerformed
        CustomerCartFrame customerCartFrame = new CustomerCartFrame();
        customerCartFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyCartActionPerformed

    private void jcbAllSellerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAllSellerNameActionPerformed
        String selectedSeller = jcbAllSellerName.getSelectedItem() + "";
        try {
            if (selectedSeller.equals("ALL")) {
                pro = ProductDAO.getAllProducts(selectedSeller);//list of productpojo
            } else {
                pro = ProductDAO.getAllProducts(allSeller.get(selectedSeller));//list of productpojo   
            }
            foodIndex = 0;
            loc = 1;
            clearAll();
            setNA();
            showAllFood(pro);
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB Error in Order Food Frame display");
            return;
        } catch (IOException sq) {
            JOptionPane.showMessageDialog(null, "I/O Error in Order Food Frame");
            return;
        }
    }//GEN-LAST:event_jcbAllSellerNameActionPerformed

    private void lblLeftArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeftArrowMouseClicked
        loc--;
        foodIndex = index - track - 6;
        loc = 1;
        if (foodIndex < 0) {
            JOptionPane.showMessageDialog(null, "You Explore All Food By Left Side");
            return;
        }
        clearFoodName();
        clearAll();
        setNA();
        track = 0;
        showAllFood(pro);
    }//GEN-LAST:event_lblLeftArrowMouseClicked

    private void lblRightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRightArrowMouseClicked
        loc = 1;
        foodIndex = index;
        if (foodIndex >= pro.size()) {
            JOptionPane.showMessageDialog(null, "You Explore All Food By Right Side");
            return;
        }
        clearFoodName();
        clearAll();
        setNA();
        track = 0;
        showAllFood(pro);
    }//GEN-LAST:event_lblRightArrowMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerOptionFrame customerOptionFrame = new CustomerOptionFrame();
        customerOptionFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        CustomerOrderHistoryFrame orderHistoryFrame = new CustomerOrderHistoryFrame();
        orderHistoryFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

    private void lblFoodImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoodImg1MouseClicked
        if (lblFoodImg1.getName().equals("")) {
            JOptionPane.showMessageDialog(null, "This is not Applicable");
            return;
        }
        int i = Integer.parseInt(lblFoodImg1.getName());
        ProductPojo product = pro.get(i);
        showDetails(product);
    }//GEN-LAST:event_lblFoodImg1MouseClicked

    private void lblFoodImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoodImg2MouseClicked
        if (lblFoodImg2.getName().equals("")) {
            JOptionPane.showMessageDialog(null, "This is not Applicable");
            return;
        }
        int i = Integer.parseInt(lblFoodImg2.getName());
        ProductPojo product = pro.get(i);
        showDetails(product);
    }//GEN-LAST:event_lblFoodImg2MouseClicked

    private void lblFoodImg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoodImg3MouseClicked
        if (lblFoodImg3.getName().equals("")) {
            JOptionPane.showMessageDialog(null, "This is not Applicable");
            return;
        }
        int i = Integer.parseInt(lblFoodImg3.getName());
        ProductPojo product = pro.get(i);
        showDetails(product);
    }//GEN-LAST:event_lblFoodImg3MouseClicked

    private void lblFoodImg4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoodImg4MouseClicked
        if (lblFoodImg4.getName().equals("")) {
            JOptionPane.showMessageDialog(null, "This is not Applicable");
            return;
        }
        int i = Integer.parseInt(lblFoodImg4.getName());
        ProductPojo product = pro.get(i);
        showDetails(product);
    }//GEN-LAST:event_lblFoodImg4MouseClicked

    private void lblFoodImg5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoodImg5MouseClicked
        if (lblFoodImg5.getName().equals("")) {
            JOptionPane.showMessageDialog(null, "This is not Applicable");
            return;
        }
        int i = Integer.parseInt(lblFoodImg5.getName());
        ProductPojo product = pro.get(i);
        showDetails(product);
    }//GEN-LAST:event_lblFoodImg5MouseClicked

    private void lblFoodImg6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoodImg6MouseClicked
        if (lblFoodImg6.getName().equals("")) {
            JOptionPane.showMessageDialog(null, "This is not Applicable");
            return;
        }
        int i = Integer.parseInt(lblFoodImg6.getName());
        ProductPojo product = pro.get(i);
        showDetails(product);
    }//GEN-LAST:event_lblFoodImg6MouseClicked

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        new CancelOrderFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

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
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jcbAllSellerName;
    private javax.swing.JLabel lblFoodImg1;
    private javax.swing.JLabel lblFoodImg2;
    private javax.swing.JLabel lblFoodImg3;
    private javax.swing.JLabel lblFoodImg4;
    private javax.swing.JLabel lblFoodImg5;
    private javax.swing.JLabel lblFoodImg6;
    private javax.swing.JLabel lblFoodName1;
    private javax.swing.JLabel lblFoodName2;
    private javax.swing.JLabel lblFoodName3;
    private javax.swing.JLabel lblFoodName4;
    private javax.swing.JLabel lblFoodName5;
    private javax.swing.JLabel lblFoodName6;
    private javax.swing.JLabel lblLeftArrow;
    private javax.swing.JLabel lblRightArrow;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables

    private void loadAllSeller() {
        try {
            allSeller = CompanyDAO.getAllSellerDetails();
            jcbAllSellerName.addItem("ALL");
            for (String name : allSeller.keySet()) {
                jcbAllSellerName.addItem(name);
            }
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB Error in Order Food Frame Loadseller");
            return;
        }
    }

    private void clearAll() {
        lblFoodImg1.setIcon(null);
        lblFoodImg2.setIcon(null);
        lblFoodImg3.setIcon(null);
        lblFoodImg4.setIcon(null);
        lblFoodImg5.setIcon(null);
        lblFoodImg6.setIcon(null);
        lblFoodName1.setText("");
        lblFoodName2.setText("");
        lblFoodName3.setText("");
        lblFoodName4.setText("");
        lblFoodName5.setText("");
        lblFoodName6.setText("");
    }

    private void setNA() {
        lblFoodImg1.setText("NA");
        lblFoodImg2.setText("NA");
        lblFoodImg3.setText("NA");
        lblFoodImg4.setText("NA");
        lblFoodImg5.setText("NA");
        lblFoodImg6.setText("NA");
        lblFoodName1.setText("NA");
        lblFoodName2.setText("NA");
        lblFoodName3.setText("NA");
        lblFoodName4.setText("NA");
        lblFoodName5.setText("NA");
        lblFoodName6.setText("NA");
    }

    private void showAllFood(List<ProductPojo> pro) {
        for (index = foodIndex; index < pro.size() && loc <= 6; index++) {
            ProductPojo product = pro.get(index);
            Image img = product.getProductImage();
            img = img.getScaledInstance(lblFoodImg1.getWidth(), lblFoodImg1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            if (loc == 1) {
                lblFoodImg1.setText("");
                lblFoodImg1.setIcon(icon);
                lblFoodName1.setText(product.getProductName() + "");
                lblFoodImg1.setName(index + "");
            } else if (loc == 2) {
                lblFoodImg2.setText("");
                lblFoodImg2.setIcon(icon);
                lblFoodName2.setText(product.getProductName() + "");
                lblFoodImg2.setName(index + "");
            } else if (loc == 3) {
                lblFoodImg3.setText("");
                lblFoodImg3.setIcon(icon);
                lblFoodName3.setText(product.getProductName() + "");
                lblFoodImg3.setName(index + "");
            } else if (loc == 4) {
                lblFoodImg4.setText("");
                lblFoodImg4.setIcon(icon);
                lblFoodName4.setText(product.getProductName() + "");
                lblFoodImg4.setName(index + "");
            } else if (loc == 5) {
                lblFoodName5.setText(product.getProductName() + "");
                lblFoodImg5.setText("");
                lblFoodImg5.setIcon(icon);
                lblFoodImg5.setName(index + "");
            } else if (loc == 6) {
                lblFoodImg6.setText("");
                lblFoodImg6.setIcon(icon);
                lblFoodName6.setText(product.getProductName() + "");
                lblFoodImg6.setName(index + "");
            }
            loc++;
            track++;
            pos++;
        }
        System.out.println("foodindex=" + foodIndex);
        System.out.println("index=" + index);
        System.out.println("location=" + loc);
    }

    private void clearFoodName() {
        lblFoodImg1.setName("");
        lblFoodImg2.setName("");
        lblFoodImg3.setName("");
        lblFoodImg4.setName("");
        lblFoodImg5.setName("");
        lblFoodImg6.setName("");
    }

    private void showDetails(ProductPojo product) {
        Object parentComponent = null;

        // Message to be displayed
        String Seller = jcbAllSellerName.getSelectedItem().toString();
        if (jcbAllSellerName.getSelectedItem().toString().equals("ALL")) {
            String id = product.getCompanyId();
            for (Map.Entry<String, String> entry : allSeller.entrySet()) {
                if (entry.getValue().equals(id)) {
                    Seller = entry.getKey();
                }

            }
        }
        String message = "Food Name:-" + product.getProductName() + "\n" + "Food Price:-" + product.getProductPrice() + "\n" + "Seller Name:-" + Seller;

        // Dialog title
        String title = "Confirmation";

        // Option type (YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION)
        int optionType = JOptionPane.YES_NO_OPTION;

        // Icon type (QUESTION_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE, PLAIN_MESSAGE)
        int messageType = JOptionPane.QUESTION_MESSAGE;

        // Options (buttons)
        Object[] options = {"Order_Now", "Add_To_Cart"};

        // Show the dialog and capture the user's choice
        int userChoice = JOptionPane.showOptionDialog((Component) parentComponent,
                message,
                title,
                optionType,
                messageType,
                null, // icon (null for default)
                options, // options (buttons)
                options[0] // default option
        );

        // Process the user's choice
        if (userChoice == JOptionPane.YES_OPTION) {
            OrderProductFrame orderProductFrame = new OrderProductFrame(product);
            orderProductFrame.setVisible(true);
            this.dispose();
        } else if (userChoice == JOptionPane.NO_OPTION) {
            try {
                PlaceOrderPojo placeOrderPojo = new PlaceOrderPojo();
                placeOrderPojo.setCompanyId(product.getCompanyId());
                placeOrderPojo.setProductId(product.getProductId());
                placeOrderPojo.setCustomerId(UserProfile.getUserId());
                placeOrderPojo.setStaffId(StaffDAO.getRandomStaffId(product.getCompanyId()));
                if (PlaceOrderDAO.placeOrderforCart(placeOrderPojo)) {
                    JOptionPane.showMessageDialog(null, "Product Added in Cart Succesfully");
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Cant Add Product in Cart");
                    return;
                }
            } catch (SQLException sq) {
                JOptionPane.showMessageDialog(null, "DB Error in Order Food Frame For Add to Cart");
                return;
            }
        } else {
            System.out.println("User closed the dialog");
            // Perform actions for dialog close or other options
        }
    }
}
