
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Rents extends javax.swing.JFrame {

    public Rents() {
        initComponents();
        DisplayCars();
        GetCustomers();
        DisplayRents();
       
    }
         Connection Con=null;
   Statement St=null;
   ResultSet Rs=null;
   private void DisplayCars()
   {String CarStatus="Available";
       try{
          Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
          St=Con.createStatement();
          Rs=St.executeQuery("Select * from CARTB where Status='"+CarStatus+"'");
          CarTable.setModel(DbUtils.resultSetToTableModel(Rs));
               }catch(SQLException e)
               {
                   e.printStackTrace();
               }
   }
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
   private void GetCustomers()
   {
    try{
          Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
           St=Con.createStatement();
           String query=("select * from user1.customertb");
            Rs=St.executeQuery(query);
            while(Rs.next()){
               String Customer=Rs.getString("CustName");
               CustCb.addItem(Customer);
            }
    }catch(Exception e){
        
    }
   }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        RentIdTb = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CustCb = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegNumTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        FeeTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        RentTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CarTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        RentDate = new com.toedter.calendar.JDateChooser();
        ReturnDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RentIdTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentIdTbActionPerformed(evt);
            }
        });

        SaveBtn.setForeground(new java.awt.Color(0, 0, 255));
        SaveBtn.setText("SAVE");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EditBtn.setForeground(new java.awt.Color(51, 51, 255));
        EditBtn.setText("EDIT");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        ResetBtn.setForeground(new java.awt.Color(0, 51, 255));
        ResetBtn.setText("RESET");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Registration");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Fees");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Rent Id");

        CustCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustCbActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 102, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 204, 255));
        jLabel6.setText("Cars Rented");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText(" Cars On Rent");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Rent Date");

        RegNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNumTbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Return Date");

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setText("Customers");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setText("Cars");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setText("Returncar");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        FeeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeeTbActionPerformed(evt);
            }
        });

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

        CarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "CarReg", "Brand", "Model", "Status", "Price"
            }
        ));
        CarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CarTable);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 255));
        jLabel18.setText(" Cars List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(RentIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustCb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FeeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(684, 684, 684)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RentIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RegNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CustCb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FeeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(EditBtn)
                    .addComponent(ResetBtn))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(332, 332, 332))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
      if(RegNumTb.getText().isEmpty()||FeeTb.getText().isEmpty()||RentIdTb.getText().isEmpty() || RentIdTb.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this,"Select Rent details to be updated");
      }else{
         RentDat=RentDate.getDate();       
            MyRentDat=new java.sql.Date(RentDat.getTime());
              ReturnDat=ReturnDate.getDate();       
            MyReturnDat=new java.sql.Date(ReturnDat.getTime()); 
          try{
               Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
           int Rid=Integer.valueOf(RentIdTb.getText());
 String Query ="Update user1.renttb set CarReg='"+RegNumTb.getText()+"',CustName='"+CustCb.getSelectedItem().toString()+"',RentDate='"+MyRentDat+"',ReturnDate='"+MyReturnDat+"',RentFee="+FeeTb.getText()+"where RentId="+Rid;
           Statement Add=Con.createStatement();
           Add.executeUpdate(Query);
             JOptionPane.showMessageDialog(this,"Rent Details updated Successfully");
              DisplayRents();
              Reset();
        }catch(Exception e){
        e.printStackTrace();       
    }
        }
    }//GEN-LAST:event_EditBtnActionPerformed

    private void CustCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustCbActionPerformed

    private void RegNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNumTbActionPerformed

    private void FeeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FeeTbActionPerformed

    private void RentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentTableMouseClicked
 DefaultTableModel model=(DefaultTableModel)RentTable.getModel();
      int MyIndex=RentTable.getSelectedRow();
      RentIdTb.setText(model.getValueAt(MyIndex,0).toString());
       RegNumTb.setText(model.getValueAt(MyIndex,1).toString());
        CustCb.setSelectedItem(model.getValueAt(MyIndex,2).toString());
         FeeTb.setText(model.getValueAt(MyIndex,5).toString());
      
    }//GEN-LAST:event_RentTableMouseClicked

    private void CarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarTableMouseClicked
       DefaultTableModel model=(DefaultTableModel)CarTable.getModel();
      int MyIndex=CarTable.getSelectedRow();
      RegNumTb.setText(model.getValueAt(MyIndex,0).toString());
    }//GEN-LAST:event_CarTableMouseClicked
private void UpdateCar()
{
    try{
               Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
            String Reg=RegNumTb.getText();
            String CarStatus="Booked";
 String Query ="Update user1.cartb set Status='"+CarStatus+"' where CarReg='"+Reg+"'";
           Statement Add=Con.createStatement();
           Add.executeUpdate(Query);
             JOptionPane.showMessageDialog(this,"Car Updated Successfully");
              DisplayCars();
              Reset();
        }catch(Exception e){
        e.printStackTrace();       
    }
}
    
java.util.Date RentDat,ReturnDat;
java.sql.Date MyRentDat,MyReturnDat;
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(RegNumTb.getText().isEmpty()||FeeTb.getText().isEmpty()||RentIdTb.getText().isEmpty() || RentIdTb.getText().isEmpty())
      {
           JOptionPane.showMessageDialog(this,"Missing Information");
      }else{
          try{
             
              RentDat=RentDate.getDate();       
            MyRentDat=new java.sql.Date(RentDat.getTime());
              ReturnDat=ReturnDate.getDate();       
            MyReturnDat=new java.sql.Date(ReturnDat.getTime()); 
             Con=DriverManager.getConnection("jdbc:derby://localhost:1527/cardb","user1","user1");
            PreparedStatement add=Con.prepareStatement("insert into RentTb values(?,?,?,?,?,?)");
            add.setInt(1,Integer.valueOf(RentIdTb.getText()));
             add.setString(2,RegNumTb.getText());
             add.setString(3,CustCb.getSelectedItem().toString());
              add.setDate(4,  MyRentDat);
              add.setDate(5,  MyReturnDat);
              add.setInt(6,Integer.valueOf(FeeTb.getText()));
              int row=add.executeUpdate();
              JOptionPane.showMessageDialog(this,"Car Rented Successfully");
              DisplayRents(); 
              UpdateCar();
              DisplayCars();
        }catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_SaveBtnActionPerformed
    }
    private void Reset(){
    RentIdTb.setText("");
       RegNumTb.setText("");
       CustCb.setSelectedIndex(0);
       FeeTb.setText("");
    }
    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
       Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
 new Customers().setVisible(true);
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
 new Cars().setVisible(true);
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
 new Returns().setVisible(true);
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void RentIdTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentIdTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentIdTbActionPerformed
       
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
            java.util.logging.Logger.getLogger(Rents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CarTable;
    private javax.swing.JComboBox<String> CustCb;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField FeeTb;
    private javax.swing.JTextField RegNumTb;
    private com.toedter.calendar.JDateChooser RentDate;
    private javax.swing.JTextField RentIdTb;
    private javax.swing.JTable RentTable;
    private javax.swing.JButton ResetBtn;
    private com.toedter.calendar.JDateChooser ReturnDate;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
