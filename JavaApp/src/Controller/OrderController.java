/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Order;
import Entity.Product;
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
 * @author Admin
 */
public class OrderController {

    static Statement stm = null;
    static ResultSet rs = null;
    static Connection cnn = null;
    ConnectDB db = new ConnectDB();

    public ArrayList<Order> getData() {
        cnn = db.getCon();
        ArrayList<Order> dsPro = new ArrayList<>();
        try {
            stm = (Statement) cnn.createStatement();
            String query = "select od.IDOrder,od.DateOrder,em.NameEmp,od.IDProduct,ct.CusName,pr.Price,od.Quantity,od.isStatus from dbo.OrderDetails od \n"
                    + "\n"
                    + "left join Product pr \n"
                    + "on pr.IDProduct = od.IDProduct\n"
                    + "left join Employee em\n"
                    + "on em.UsernameEmp = od.UsernameEmp "
                    + "inner join Customer ct "
                    + "on ct.IDcus = od.IDCus ";
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Order pro = new Order();
                pro.setIOrder(rs.getString(1));
                pro.setDateOrder(rs.getString(2));
                pro.setUsernameEmp(rs.getString(3));
                pro.setIDProduct(rs.getString(4));
                pro.setCusName(rs.getString(5));
                pro.setPrice(rs.getInt(6));
                pro.setQuantity(rs.getInt(7));
                pro.setStatus(rs.getInt(8));
                dsPro.add(pro);
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPro;
    }
    public ArrayList<Order> getDataByCusID(int CusId) {
        cnn = db.getCon();
        ArrayList<Order> dsPro = new ArrayList<>();
        try {
            stm = (Statement) cnn.createStatement();
            String query = "select od.IDOrder,od.DateOrder,em.NameEmp,od.IDProduct,ct.CusName,pr.Price,od.Quantity,od.isStatus from dbo.OrderDetails od \n"
                    + "\n"
                    + "left join Product pr \n"
                    + "on pr.IDProduct = od.IDProduct\n"
                    + "left join Employee em\n"
                    + "on em.UsernameEmp = od.UsernameEmp "
                    + "inner join Customer ct "
                    + "on ct.IDcus = od.IDCus "
                    +"where ct.IDCus = " + CusId;

            rs = stm.executeQuery(query);
            while (rs.next()) {
                Order pro = new Order();
                pro.setIOrder(rs.getString(1));
                pro.setDateOrder(rs.getString(2));
                pro.setUsernameEmp(rs.getString(3));
                pro.setIDProduct(rs.getString(4));
                pro.setCusName(rs.getString(5));
                pro.setPrice(rs.getInt(6));
                pro.setQuantity(rs.getInt(7));
                pro.setStatus(rs.getInt(8));
                dsPro.add(pro);
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPro;
    }
    public boolean UpdateData(String query) throws SQLException {
        cnn = db.getCon();
        int row;
        try {
            stm = (Statement) cnn.createStatement();
            row = stm.executeUpdate(query);
            if (row > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            db.CloseConnect();
        }
        return false;
    }
    //xoa hoa don 
}
