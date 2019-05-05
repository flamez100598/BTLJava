/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import Entity.Product;
import java.io.File;
import java.io.FileReader;
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
 * @author Admin
 */
public class ConnectDB {
     Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public ConnectDB() {
        Properties p = new Properties();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:4443;databaseName = KFCManagerment;"
                    + "user = sa;password = sa";
            con = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Lỗi 100:: Không tìm thấy lớp");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi 101:: Không thể kết nối đến máy chủ");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Lỗi 102:: Cấu hình bị trống");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    Connection cnn = null;
        static Statement stm = null;
    static ResultSet rs = null;
     public void CloseConnect() {
        if (cnn != null) {
            try {
                cnn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
     }
     public boolean Login(String userName,String passWord){
         cnn = this.getCon();
         boolean check = false;
        try {
            stm = (Statement) cnn.createStatement();
            String query = "select * from [dbo].[Administrator]";
            rs = stm.executeQuery(query);
            while (rs.next()) {
                if(userName.equals(rs.getString(1))&& passWord.equals(rs.getString(2))){
                    check = true;
                    break;
                }
                else{
                    check = false;
                }
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
     }
}
