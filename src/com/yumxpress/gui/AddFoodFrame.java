/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yumxpress.gui;

import com.yumxpress.dao.ProductDAO;
import com.yumxpress.pojo.ProductPojo;
import com.yumxpress.utility.OwnerProfile;
import com.yumxpress.utility.SpoonacularAPI;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AddFoodFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddFoodFrame
     */
    private int foodIndex;
    private List<ProductPojo> foodList;

    public AddFoodFrame() {
        initComponents();
        setLocationRelativeTo(null);
        lblUserName.setText("Hello " + OwnerProfile.getOwnerName());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        btnAddStaff = new javax.swing.JButton();
        btnViewFood = new javax.swing.JButton();
        btnViewStaff = new javax.swing.JButton();
        btnOrderList = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSearchFood = new javax.swing.JTextField();
        txtFoodName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFoodPrice = new javax.swing.JTextField();
        lblLeftArrow = new javax.swing.JLabel();
        lblRightArrow = new javax.swing.JLabel();
        lblFoodImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(131, 119, 181));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/user.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 190));

        lblUserName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblUserName.setText("@null");
        jPanel2.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 210, 40));

        btnAddStaff.setBackground(new java.awt.Color(219, 255, 153));
        btnAddStaff.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnAddStaff.setText("Add Staff");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, -1));

        btnViewFood.setBackground(new java.awt.Color(219, 255, 153));
        btnViewFood.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnViewFood.setText("View Food");
        btnViewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFoodActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 160, -1));

        btnViewStaff.setBackground(new java.awt.Color(219, 255, 153));
        btnViewStaff.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnViewStaff.setText("View Staff");
        btnViewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStaffActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 160, -1));

        btnOrderList.setBackground(new java.awt.Color(219, 255, 153));
        btnOrderList.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnOrderList.setText("Order List");
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 160, -1));
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

        btnAddItem.setBackground(new java.awt.Color(219, 255, 153));
        btnAddItem.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnAddItem.setText("Add Item");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 130, 30));

        btnSearch.setBackground(new java.awt.Color(219, 255, 153));
        btnSearch.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(131, 119, 181));
        jLabel4.setText("Add Food Item");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 301, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(131, 119, 181));
        jLabel5.setText("Search Food");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(131, 119, 181));
        jLabel6.setText("Food Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(131, 119, 181));
        jLabel7.setText("Food Image");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        txtSearchFood.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtSearchFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 240, 30));

        txtFoodName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtFoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(131, 119, 181));
        jLabel3.setText("Enter Price");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, 30));

        txtFoodPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtFoodPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 240, -1));

        lblLeftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/icons8-left-arrow-64 (1).png"))); // NOI18N
        lblLeftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLeftArrowMouseClicked(evt);
            }
        });
        jPanel1.add(lblLeftArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 70, 70));

        lblRightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/icons8-right-arrow-64.png"))); // NOI18N
        lblRightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRightArrowMouseClicked(evt);
            }
        });
        jPanel1.add(lblRightArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 70, 70));
        jPanel1.add(lblFoodImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 260, 190));

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

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
        AddDeliveryStaffFrame addStaffFrame = new AddDeliveryStaffFrame();
        addStaffFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddStaffActionPerformed

    private void btnViewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStaffActionPerformed
        ViewDeliveryStaffFrame vdsf = new ViewDeliveryStaffFrame();
        vdsf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewStaffActionPerformed

    private void btnViewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFoodActionPerformed
        ViewFoodFrame viewFoodFrame = new ViewFoodFrame();
        viewFoodFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewFoodActionPerformed

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        SellerOrderListFrame olf = new SellerOrderListFrame();
        olf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SellerOptionFrame sellerOptionFrame = new SellerOptionFrame();
        sellerOptionFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblLeftArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLeftArrowMouseClicked
        foodIndex--;
        if (foodIndex == -1) {
            foodIndex = foodList.size() - 1;
        }
        showFoodDetailsByIndex(foodIndex);
    }//GEN-LAST:event_lblLeftArrowMouseClicked

    private void lblRightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRightArrowMouseClicked
        foodIndex++;
        if (foodIndex == foodList.size()) {
            foodIndex = 0;
        }
        showFoodDetailsByIndex(foodIndex);
    }//GEN-LAST:event_lblRightArrowMouseClicked

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        //double price=Double.parseDouble(txtenterPrice.getText().trim());
        if (txtFoodName.getText().trim().isEmpty() || txtFoodPrice.getText().trim().isEmpty() || lblFoodImg.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "Please fill All the data");
            return;
        }
        ProductPojo product = foodList.get(foodIndex);
        try {
            double price = Double.parseDouble(txtFoodPrice.getText().trim());
            product.setProductPrice(price);
            product.setCompanyId(OwnerProfile.getCompanyId());
            if (ProductDAO.addProduct(product)) {
                JOptionPane.showMessageDialog(null, "Product added succesfully");
                foodList.remove(foodIndex);
                if (foodList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All varities of" + txtFoodName.getText().trim() + " Added");
                    clearAll();
                }
                foodIndex = 0;
                return;
            }
            JOptionPane.showMessageDialog(null, " Cant Add Product");
            return;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception in DB in AddFoodItem");
            ex.printStackTrace();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "please insert correct product price");
            ex.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error for add Product");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchFood = txtSearchFood.getText().trim();
        if (searchFood.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please type a food name");
            return;
        }
        try {
            searchFood = searchFood.replaceAll(" ", "-");
            foodList = SpoonacularAPI.getAllItemDetailsByName(searchFood);
            if (foodList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No food details for " + searchFood + " found");
                return;
            }
            foodIndex = 0;
            showFoodDetailsByIndex(foodIndex);
            lblLeftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/icons8-left-arrow-64.png")));
            lblRightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yumxpress/icons/icons8-right-arrow-64.png")));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception while using API");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrderList;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewFood;
    private javax.swing.JButton btnViewStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFoodImg;
    private javax.swing.JLabel lblLeftArrow;
    private javax.swing.JLabel lblRightArrow;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtFoodPrice;
    private javax.swing.JTextField txtSearchFood;
    // End of variables declaration//GEN-END:variables

    private void showFoodDetailsByIndex(int foodIndex) {
        ProductPojo product = foodList.get(foodIndex);
        String foodName = product.getProductName();
        if (foodName.length() >= 50) {
            foodName = foodName.substring(0, 45) + "...";
        }
        txtFoodName.setText(foodName);
        Image img = product.getProductImage();
        img = img.getScaledInstance(lblFoodImg.getWidth(), lblFoodImg.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblFoodImg.setIcon(icon);
    }

    private void clearAll() {
        txtFoodName.setText("");
        txtSearchFood.setText("");
        txtFoodPrice.setText("");
        lblFoodImg.setIcon(null);
        lblLeftArrow.setIcon(null);
        lblRightArrow.setIcon(null);
        txtSearchFood.requestFocus();
    }
}