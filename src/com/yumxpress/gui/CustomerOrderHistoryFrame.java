package com.yumxpress.gui;

import com.yumxpress.dao.PlaceOrderDAO;
import com.yumxpress.pojo.OrderPojo;
import com.yumxpress.utility.UserProfile;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerOrderHistoryFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    private List<OrderPojo> orderList;

    public CustomerOrderHistoryFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblUserName.setText("Hello " + UserProfile.getUserName());
        model = (DefaultTableModel) jtOrderHistory.getModel();
        System.out.println(UserProfile.getUserId().trim());
        loadDeliveredOrderDetails(UserProfile.getUserId().trim());
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
        btnOrderFood = new javax.swing.JButton();
        btnCancelFood = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrderHistory = new javax.swing.JTable();
        btnPostReview = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/user.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 190));

        lblUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUserName.setText("@null");
        jPanel2.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 40));

        btnMyAccount.setBackground(new java.awt.Color(253, 183, 2));
        btnMyAccount.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMyAccount.setText("My Account");
        btnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAccountActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 40));

        btnMyCart.setBackground(new java.awt.Color(253, 183, 2));
        btnMyCart.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMyCart.setText("My Cart");
        btnMyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCartActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 40));

        btnOrderFood.setBackground(new java.awt.Color(253, 183, 2));
        btnOrderFood.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnOrderFood.setText("Order Food");
        btnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFoodActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrderFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 180, 40));

        btnCancelFood.setBackground(new java.awt.Color(253, 183, 2));
        btnCancelFood.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCancelFood.setText("Cancel Food");
        btnCancelFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelFoodActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 40));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 260, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 600));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 103, 255));
        jLabel4.setText("Order History");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 280, -1));

        jtOrderHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "PRODUCT NAME", "PRODUCT PRICE", "DELIVERY STAFF", "COMPANY NAME", "ADDRESS", "REVIEW"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtOrderHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtOrderHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtOrderHistory);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 740, 420));

        btnPostReview.setBackground(new java.awt.Color(0, 153, 255));
        btnPostReview.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnPostReview.setText("Post Review(0)");
        btnPostReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostReviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnPostReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 180, 30));

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 160, 30));

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

    private void btnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFoodActionPerformed
        new OrderFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderFoodActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new CustomerOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPostReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostReviewActionPerformed
        int index = jtOrderHistory.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "please select a item");
            return;
        }

        String review = JOptionPane.showInputDialog(null, "Review ?", "Validation", JOptionPane.QUESTION_MESSAGE);
        OrderPojo ord = orderList.get(index);
        try {
            boolean result = PlaceOrderDAO.setReviewForOrderId(ord.getOrderId(), review);
            if (!result) {
                JOptionPane.showMessageDialog(null, "Review is not post try Again");
                return;
            }
            CustomerOrderHistoryFrame ohf = new CustomerOrderHistoryFrame();
            ohf.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB error in Order History frame");
        }
    }//GEN-LAST:event_btnPostReviewActionPerformed

    private void btnCancelFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelFoodActionPerformed
        new CancelOrderFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelFoodActionPerformed

    private void btnMyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCartActionPerformed
        new CustomerCartFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyCartActionPerformed

    private void btnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAccountActionPerformed
        new CustomerAccountFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyAccountActionPerformed

    private void jtOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtOrderHistoryMouseClicked
        int i = jtOrderHistory.getSelectedRow();
        if (jtOrderHistory.getValueAt(i, 6) != null) {
            return;
        }
        String review = JOptionPane.showInputDialog(null, "Please Give Review Out of 5: ");
        if (Integer.parseInt(review) > 5) {
            JOptionPane.showMessageDialog(null, "You can only give Review Out of 5");
            return;
        }
        try {
            if (PlaceOrderDAO.setReviewForOrderId(jtOrderHistory.getValueAt(i, 0).toString(), review)) {
                JOptionPane.showMessageDialog(null, "Thank you For Providing Your Valuable Review!");
                model.setValueAt(review, i, 6);
            }
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB Error in Order History Frame for Review Set");
            return;
        }
    }//GEN-LAST:event_jtOrderHistoryMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerOrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOrderHistoryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOrderHistoryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelFood;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JButton btnPostReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtOrderHistory;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables

    private void loadDeliveredOrderDetails(String customerId) {
        try {
            orderList = PlaceOrderDAO.getDeliveredOrderForCustomer(customerId);

            if (orderList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "NO Order Delivered Yet!");
                jtOrderHistory.setEnabled(false);
                return;
            }
            int i = 0;
            Object[] rows = new Object[7];
            while (i < orderList.size()) {
                OrderPojo order = orderList.get(i);
                rows[0] = order.getOrderId();
                rows[1] = order.getProductName();
                rows[2] = order.getProductPrice();
                rows[3] = order.getDeliveryStaffName();
                rows[4] = order.getCompanyName();
                rows[5] = order.getCustomerAddress();
                rows[6] = order.getReview();
                model.addRow(rows);
                i++;
            }
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB Error in Order History Frame");
            return;
        }
    }
}
