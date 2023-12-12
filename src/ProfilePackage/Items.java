package ProfilePackage;

import Logic.DBAction;
import Models.ItemsModel;
import Models.RegisterModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Items extends javax.swing.JFrame {

    static int selectedId = -1;

    public void clearTable() {
        selectedId = -1;
        CommNameTxt.setText(null);
        scinteficNameTxt.setText(null);
        barcodeTxt.setText(null);
        BrandTxt.setText(null);
        TypeTxt.setText(null);
        catigoryTxt.setText(null);
        quantityTxt.setText(null);
        ExpireDateTxt.setText(null);
        BuyingPriceTxt.setText(null);
        sellingPriceTxt.setText(null);
    }

    public void displayProductData() {
        try {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            ResultSet allProduct = DBAction.getAllProducts();

            while (allProduct.next()) {
//                id, barcode, scientificName, commercialName, category, brand, type
                int id = allProduct.getInt(1);
                String barcode = allProduct.getString(2);
                String scientificName = allProduct.getString(3);
                String commercialName = allProduct.getString(4);
                String category = allProduct.getString(5);
                String brand = allProduct.getString(6);
                String type = allProduct.getString(7);
                
                int quantity = allProduct.getInt(8);
                String expireDate = allProduct.getString(9);
                double buyingPrice = allProduct.getDouble(10);
                double sellingPrice = allProduct.getDouble(11);
                

                Object[] array = {id, scientificName, commercialName, barcode, category, brand, type, quantity, expireDate, buyingPrice, sellingPrice};

                model.addRow(array);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "kesha la garanaway daya haya" + "\n" + e.getMessage());
        }
    }

    public Items() {
        initComponents();
        displayProductData();
        this.getContentPane().setBackground(Color.decode("#DCE7F7"));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 6, dim.height / 14);

        SaveBtn.setBackground(Color.decode("#1BADDE"));
        SaveBtn.setForeground(Color.white);
        SaveBtn.setBorder(null);

        ClearBtn.setBackground(Color.decode("#F2AB44"));
        ClearBtn.setForeground(Color.white);
        ClearBtn.setBorder(null);

        BackLbl.setForeground(Color.decode("#F2AB44"));

        CommNameTxt.setBackground(Color.decode("#fefefe"));
        scinteficNameTxt.setBackground(Color.decode("#fefefe"));
        barcodeTxt.setBackground(Color.decode("#fefefe"));
        BrandTxt.setBackground(Color.decode("#fefefe"));
        TypeTxt.setBackground(Color.decode("#fefefe"));
        catigoryTxt.setBackground(Color.decode("#fefefe"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        catigoryTxt = new javax.swing.JTextField();
        scinteficNameTxt = new javax.swing.JTextField();
        barcodeTxt = new javax.swing.JTextField();
        BrandTxt = new javax.swing.JTextField();
        TypeTxt = new javax.swing.JTextField();
        CommNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        BackLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        SaveBtn1 = new javax.swing.JButton();
        SaveBtn2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        quantityTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BuyingPriceTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sellingPriceTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ExpireDateTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(925, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        catigoryTxt.setBorder(null);
        getContentPane().add(catigoryTxt);
        catigoryTxt.setBounds(170, 200, 200, 15);

        scinteficNameTxt.setBorder(null);
        scinteficNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scinteficNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(scinteficNameTxt);
        scinteficNameTxt.setBounds(170, 80, 200, 15);

        barcodeTxt.setBorder(null);
        getContentPane().add(barcodeTxt);
        barcodeTxt.setBounds(170, 110, 200, 15);

        BrandTxt.setBorder(null);
        getContentPane().add(BrandTxt);
        BrandTxt.setBounds(170, 140, 200, 15);

        TypeTxt.setBorder(null);
        getContentPane().add(TypeTxt);
        TypeTxt.setBounds(170, 170, 200, 15);

        CommNameTxt.setBorder(null);
        CommNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(CommNameTxt);
        CommNameTxt.setBounds(170, 50, 200, 15);

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Catigory");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 200, 120, 15);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Type");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 170, 120, 15);

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Brand");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 140, 120, 15);

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Barcode");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 110, 120, 15);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("scientific name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 80, 120, 15);

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("commercial name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 50, 120, 15);

        SaveBtn.setText("Add");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveBtnMouseExited(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn);
        SaveBtn.setBounds(50, 360, 320, 25);

        BackLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BackLbl.setText("< Back");
        BackLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackLblMouseExited(evt);
            }
        });
        getContentPane().add(BackLbl);
        BackLbl.setBounds(20, 20, 60, 15);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Commercial name", "Scintefic name", "barcode", "catigory", "brand", "type", "Quantity", "expire date", "buying price", "selling price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 400, 910, 220);

        jPanel1.setBackground(new java.awt.Color(27, 173, 222));
        jPanel1.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Rudaw", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("زیادکردنی دەرمان");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 50, 320, 30);

        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearBtnMouseExited(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ClearBtn);
        ClearBtn.setBounds(320, 370, 100, 25);

        SaveBtn1.setText("Update");
        SaveBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveBtn1MouseExited(evt);
            }
        });
        SaveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBtn1);
        SaveBtn1.setBounds(210, 370, 100, 25);

        SaveBtn2.setText("Delete");
        SaveBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveBtn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveBtn2MouseExited(evt);
            }
        });
        SaveBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBtn2);
        SaveBtn2.setBounds(100, 370, 100, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfilePackage/kch.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 80, 300, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, -10, 500, 820);

        quantityTxt.setBorder(null);
        getContentPane().add(quantityTxt);
        quantityTxt.setBounds(170, 230, 200, 15);

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Quantity");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 230, 120, 15);

        BuyingPriceTxt.setBorder(null);
        getContentPane().add(BuyingPriceTxt);
        BuyingPriceTxt.setBounds(170, 290, 200, 15);

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Buying Price");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 290, 120, 15);

        sellingPriceTxt.setBorder(null);
        getContentPane().add(sellingPriceTxt);
        sellingPriceTxt.setBounds(170, 320, 200, 15);

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Selling Price");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 320, 120, 15);

        ExpireDateTxt.setBorder(null);
        getContentPane().add(ExpireDateTxt);
        ExpireDateTxt.setBounds(170, 260, 200, 15);

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Expire Date");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 260, 120, 15);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scinteficNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scinteficNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scinteficNameTxtActionPerformed

    private void CommNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CommNameTxtActionPerformed

    private void ClearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseEntered
        ClearBtn.setBackground(Color.decode("#9CAC82"));
    }//GEN-LAST:event_ClearBtnMouseEntered

    private void ClearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseExited
        ClearBtn.setBackground(Color.decode("#F2AB44"));
    }//GEN-LAST:event_ClearBtnMouseExited

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        clearTable();

    }//GEN-LAST:event_ClearBtnActionPerformed

    private void SaveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseEntered
        SaveBtn.setBackground(Color.decode("#76CEEB"));
    }//GEN-LAST:event_SaveBtnMouseEntered

    private void SaveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseExited
        SaveBtn.setBackground(Color.decode("#1BADDE"));
    }//GEN-LAST:event_SaveBtnMouseExited

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        
        try {

            ItemsModel itemsModel = new ItemsModel(CommNameTxt.getText(), scinteficNameTxt.getText(), barcodeTxt.getText(), BrandTxt.getText(), TypeTxt.getText(), catigoryTxt.getText(), quantityTxt.getText(), ExpireDateTxt.getText(), BuyingPriceTxt.getText(), sellingPriceTxt.getText());

//            JOptionPane.showMessageDialog(this, itemsModel.getStrData(), "You successfully preserve the medical item", JOptionPane.INFORMATION_MESSAGE);
            boolean isProductAdded = DBAction.addProduct(itemsModel);

            if (isProductAdded) {
                clearTable();
                displayProductData();
            } else {
                JOptionPane.showMessageDialog(this, "Bbura keshayak ruida");
            }

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void BackLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLblMouseClicked
        new Home().show();
        this.dispose();
    }//GEN-LAST:event_BackLblMouseClicked

    private void BackLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLblMouseEntered
        BackLbl.setForeground(Color.decode("#9CAC82"));
    }//GEN-LAST:event_BackLblMouseEntered

    private void BackLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLblMouseExited
        BackLbl.setForeground(Color.decode("#F2AB44"));
    }//GEN-LAST:event_BackLblMouseExited

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (evt.getClickCount() == 1) {
            int row = jTable1.getSelectedRow();
            
            selectedId = (int) jTable1.getModel().getValueAt(row, 0);
            
            scinteficNameTxt.setText((String) jTable1.getModel().getValueAt(row, 1));
            CommNameTxt.setText((String) jTable1.getModel().getValueAt(row, 2));
            barcodeTxt.setText((String) jTable1.getModel().getValueAt(row, 3));
            catigoryTxt.setText((String) jTable1.getModel().getValueAt(row, 4));
            BrandTxt.setText((String) jTable1.getModel().getValueAt(row, 5));
            TypeTxt.setText((String) jTable1.getModel().getValueAt(row, 6));
            
            int quan = (int) jTable1.getModel().getValueAt(row, 7);
            double buy = (double) jTable1.getModel().getValueAt(row, 9);
            double sel  = (double) jTable1.getModel().getValueAt(row, 10);
            
            quantityTxt.setText(String.valueOf(quan));
            ExpireDateTxt.setText((String) jTable1.getModel().getValueAt(row, 8));
            BuyingPriceTxt.setText(String.valueOf(buy));
            sellingPriceTxt.setText(String.valueOf(sel));
            
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void SaveBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtn1MouseEntered

    private void SaveBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtn1MouseExited

    private void SaveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtn1ActionPerformed

//        ItemsModel itemsModel = new ItemsModel(CommNameTxt.getText(), nameTxt.getText(), barcodeTxt.getText(), BrandTxt.getText(), TypeTxt.getText(), UnitTxt.getText());
        try {
            ItemsModel itemsModel = new ItemsModel(CommNameTxt.getText(), scinteficNameTxt.getText(), barcodeTxt.getText(), BrandTxt.getText(), TypeTxt.getText(), catigoryTxt.getText(), quantityTxt.getText(), ExpireDateTxt.getText(), BuyingPriceTxt.getText(), sellingPriceTxt.getText());
            boolean isProductUpdated = DBAction.updateProductById(itemsModel, selectedId);

            if (isProductUpdated) {
                clearTable();
                displayProductData();
            } else {
                JOptionPane.showMessageDialog(this, "Bbura keshayak ruida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_SaveBtn1ActionPerformed

    private void SaveBtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtn2MouseEntered

    private void SaveBtn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtn2MouseExited

    private void SaveBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtn2ActionPerformed
        boolean isDeleted = DBAction.deleteProduct(selectedId);
        System.out.println(selectedId);

        if (selectedId == -1) {
            JOptionPane.showMessageDialog(this, "please select one record");
            return;
        }

        if (isDeleted) {
            clearTable();
            displayProductData();
        } else {
            JOptionPane.showMessageDialog(this, "Bbura keshayak ruida");
        }

    }//GEN-LAST:event_SaveBtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLbl;
    private javax.swing.JTextField BrandTxt;
    private javax.swing.JTextField BuyingPriceTxt;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField CommNameTxt;
    private javax.swing.JTextField ExpireDateTxt;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SaveBtn1;
    private javax.swing.JButton SaveBtn2;
    private javax.swing.JTextField TypeTxt;
    private javax.swing.JTextField barcodeTxt;
    private javax.swing.JTextField catigoryTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JTextField scinteficNameTxt;
    private javax.swing.JTextField sellingPriceTxt;
    // End of variables declaration//GEN-END:variables
}
