/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
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
            String url = "jdbc:sqlserver://localhost:51555;databaseName = KFCManagerment;"
                    + "user = sa;password = sa";
            con = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "ssdf");
            System.out.println("asd");
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
}
