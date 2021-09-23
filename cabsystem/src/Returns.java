
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roshan
 */
public class Returns extends javax.swing.JFrame {
    private Object ReturnDate;

    /**
     * Creates new form Returns
     */
    public Returns() {
        initComponents();
         DisplayRents();
        DisplayReturns();
    }
         Connection Con=null;
   Statement St=null;
   ResultSet Rs=null;
 private void DisplayRents()
   {String CarStatus="Available";
       try{
          Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
          St=Con.createStatement();
          Rs=St.executeQuery("Select * from renttb");
          RentTable.setModel(DbUtils.resultSetToTableModel(Rs));
               }catch(SQLException e)
               {
                   e.printStackTrace();
               }
   }
 private void DisplayReturns()
   {String CarStatus="Available";
       try{
          Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
          St=Con.createStatement();
          Rs=St.executeQuery("Select * from returntb");
          ReturnTable.setModel(DbUtils.resultSetToTableModel(Rs));
               }catch(SQLException e)
               {
                   e.printStackTrace();
               }
   }
  private void UpdateCar()
{
    try{
               Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
            String Reg=RegNumTb.getText();
            String CarStatus="Available";
 String Query ="Update user1.cartb set Status='"+CarStatus+"' where CarReg='"+Reg+"'";
           Statement Add=Con.createStatement();
           Add.executeUpdate(Query);
             JOptionPane.showMessageDialog(this,"Car Updated Successfully");
            //  DisplayCars();
              
        }catch(Exception e){
        e.printStackTrace();       
    }
}
  private void Removefromrent(){
       if(RegNumTb.getText().isEmpty())
      {
           JOptionPane.showMessageDialog(this,"Select car to be deleted");
      }else{
          try{
            Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
            String Query ="Delete from user1.renttb where Rentid="+Rid;
           Statement Add=Con.createStatement();
           Add.executeUpdate(Query);
            JOptionPane.showMessageDialog(this,"Car Removed from rented cars");
             }catch(Exception e){
                 DisplayRents();
        e.printStackTrace();
    }
    }  
  }
 private void GenerateDelay(){
     
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DelayTb = new javax.swing.JTextField();
        RegNumTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ReturnIdTb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        GenerateTb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FineTb = new javax.swing.JTextField();
        ReturnBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RentTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReturnTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CustNameTb = new javax.swing.JTextField();
        returnDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Customers");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Cars");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Rent");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel5.setText("Return Id");

        DelayTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelayTbActionPerformed(evt);
            }
        });

        RegNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNumTbActionPerformed(evt);
            }
        });

        jLabel9.setText("Return Date");

        jLabel1.setText("Registration");

        GenerateTb.setBackground(new java.awt.Color(51, 51, 255));
        GenerateTb.setForeground(new java.awt.Color(51, 51, 255));
        GenerateTb.setText("Generate");
        GenerateTb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GenerateTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerateTbMouseClicked(evt);
            }
        });

        jLabel6.setText("Fine");

        FineTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FineTbActionPerformed(evt);
            }
        });

        ReturnBtn.setForeground(new java.awt.Color(51, 102, 255));
        ReturnBtn.setText("Return");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText(" Cars On Rent");

        RentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "RentId", "Registration", "Customer", "RentDate", "ReturnDate", "Fees"
            }
        ));
        RentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RentTable);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 255));
        jLabel12.setText("Returned Cars");

        ReturnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "RetId", "Registration", "Customer", "ReturnDate", "Delay", "Fees"
            }
        ));
        ReturnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ReturnTable);

        jLabel13.setText("Delay");

        jLabel2.setText("Customer Name");

        CustNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustNameTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReturnIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(271, 271, 271)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FineTb, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DelayTb, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(GenerateTb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(2518, 2518, 2518))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(ReturnIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(DelayTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FineTb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerateTb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnBtn)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DelayTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelayTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelayTbActionPerformed

    private void RegNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNumTbActionPerformed

    private void FineTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FineTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FineTbActionPerformed
    java.util.Date ReturnDat;
java.sql.Date MyReturnDat;
    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed
         if(RegNumTb.getText().isEmpty()||DelayTb.getText().isEmpty()||FineTb.getText().isEmpty())
      {
           JOptionPane.showMessageDialog(this,"Missing Information");
      }else{
        try{  
              ReturnDat=returnDate.getDate();       
            MyReturnDat=new java.sql.Date(ReturnDat.getTime()); 
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
            PreparedStatement add=Con.prepareStatement("insert into ReturnTb values(?,?,?,?,?,?)");
            add.setInt(1,Integer.valueOf(ReturnIdTb.getText()));
             add.setString(2,RegNumTb.getText());
             add.setString(3,CustNameTb.getText());
               add.setDate(4 , MyReturnDat);
              add.setInt(5, Integer.valueOf( DelayTb.getText()));
               add.setInt(6, Fine);
              int row=add.executeUpdate();
              JOptionPane.showMessageDialog(this,"Car Returned Successfully");
            DisplayReturns(); 
             UpdateCar();
             Removefromrent();
            // DisplayRents();
        }catch(Exception e){
        e.printStackTrace();
     
        }
        }
    }//GEN-LAST:event_ReturnBtnActionPerformed
int Rid;
    private void RentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentTableMouseClicked
try{
        DefaultTableModel model=(DefaultTableModel)RentTable.getModel();
      int MyIndex=RentTable.getSelectedRow();
        RegNumTb.setText(model.getValueAt(MyIndex,1).toString());
        CustNameTb.setText(model.getValueAt(MyIndex,2).toString());
        Rid=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
  cost=Integer.valueOf(model.getValueAt(MyIndex,5).toString());
               }catch(Exception e)
               {
                   e.printStackTrace();
               }

    }//GEN-LAST:event_RentTableMouseClicked

    private void ReturnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnTableMouseClicked
int cost=0;
int Fine;
    private void GenerateTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerateTbMouseClicked
  if(cost==0)
  {   
  JOptionPane.showMessageDialog(this,"Select Car to BE returned");
  } else {
      Fine=cost*Integer.valueOf(DelayTb.getText());
      FineTb.setText("Rs"+Fine);
  }
      
    }//GEN-LAST:event_GenerateTbMouseClicked

    private void CustNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustNameTbActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
 new Customers().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
 new Cars().setVisible(true);
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
 new Rents().setVisible(true);
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Returns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustNameTb;
    private javax.swing.JTextField DelayTb;
    private javax.swing.JTextField FineTb;
    private javax.swing.JLabel GenerateTb;
    private javax.swing.JTextField RegNumTb;
    private javax.swing.JTable RentTable;
    private javax.swing.JButton ReturnBtn;
    private javax.swing.JTextField ReturnIdTb;
    private javax.swing.JTable ReturnTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser returnDate;
    // End of variables declaration//GEN-END:variables
}
