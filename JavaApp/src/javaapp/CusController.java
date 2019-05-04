/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import Entity.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Haidz
 */
public class CusController {
   Statement stm = null;
    ResultSet rs = null;
    Connection cnn = null;


     public  ArrayList<Customer> getData(){
        ArrayList<Customer> dsCus = new ArrayList<>();
        ConnectDB db = new ConnectDB();
        cnn = db.getCon();
        try {        
            stm = cnn.createStatement();
            String query = "SELECT * FROM Customer";
            rs = stm.executeQuery(query);
            while(rs.next()){
                Customer Cus =new Customer();
                Cus.setIDCus(rs.getInt(1));
                Cus.setCusname(rs.getString(2));
                Cus.setDateAdd(rs.getString(3));
                Cus.setPhone(rs.getString(4));
                Cus.setEmail(rs.getString(5));
             
               
                dsCus.add(Cus);
                
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsCus;
    }
    //thuc hien cap nhat bang du lieu- them-sua -xoa

   
    public boolean UpdateData(String query ) {
        ConnectDB db = new ConnectDB();
        cnn = db.getCon();
        int row=0;
        try {
            stm = (Statement) cnn.createStatement();
            row= stm.executeUpdate(query);
           if(row>0)
           {
               return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        } finally {
            CloseConnect();
        }
        return false;
    }
        public void CloseConnect() {
        if (cnn != null) {
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    public static void main(String[] args) {
        new ConnectDB();
    }  
}
