/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapp.ConnectDB;

/**
 *
 * @author Admin
 */
public class ProductController {
    static Statement stm = null;
    static ResultSet rs = null;
    static Connection cnn = null;
    ConnectDB db = new ConnectDB();

    public ArrayList<Product> getData() {
        cnn = db.getCon();
        ArrayList<Product> dsPro = new ArrayList<>();
        try {
            stm = (Statement) cnn.createStatement();
            String query = "SELECT * FROM PRODUCT";
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Product pro = new Product();
                pro.setIDProduct(rs.getString(1));
                pro.setProductName(rs.getString(2));
                pro.setIDType(rs.getString(3));
                pro.setPrice(rs.getInt(4));
                dsPro.add(pro);
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPro;
    }
}
