/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapp.ConnectDB;
import javax.swing.JOptionPane;

/**
 *
 * @author Haidz
 */
public class EmployeeController {
     Statement stm = null;
    ResultSet rs = null;
    Connection cnn = null;
     public  ArrayList<Employee> getData(){
        ArrayList<Employee> dsEmp = new ArrayList<>();
        ConnectDB db = new ConnectDB();
        cnn = db.getCon();
        try {        
            stm = cnn.createStatement();
            String query = "SELECT * FROM Employee";
            rs = stm.executeQuery(query);
            while(rs.next()){
                Employee Emp=new Employee();
                Emp.setUsernameEmp(rs.getString(1));
                Emp.setPassword(rs.getString(2));
                Emp.setNameEmp(rs.getString(3));
                Emp.setGender(rs.getString(4));
              Emp.setBirthday(rs.getString(5));
              Emp.setPhone(rs.getString(6));
              Emp.setEmail(rs.getString(7));
               Emp.setAddress(rs.getString(8));
               
                dsEmp.add(Emp);
                
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsEmp;
    }
    //thuc hien cap nhat bang du lieu- them-sua -xoa

   
    public boolean UpdateData(String query) {
        ConnectDB db = new ConnectDB();
        cnn = db.getCon();
        int row=0;
        try {
            stm = (Statement) cnn.createStatement();
            row= stm.executeUpdate(query);
           if(row == 1)
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
