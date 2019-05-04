/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class TableOrder extends AbstractTableModel {

    private final String name[] = {"IOrder", "DateOrder", "UsernameEmp", "IDProduct", "CusName", "Price", "Total pay"};
    private final Class classname[] = {String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class};
    ArrayList<Order> dsma;
    public TableOrder(ArrayList<Order> dsma) {
        this.dsma = dsma;
    }
    @Override
    public int getRowCount() {
        return dsma.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch (i1) {
            case 0:
                return dsma.get(i).getIOrder();
            case 1:
                return dsma.get(i).getDateOrder();
            case 2:
                return dsma.get(i).getUsernameEmp();
            case 3:
                return dsma.get(i).getIDProduct();
            case 4:
                return dsma.get(i).getCusName();
            case 5:
                return dsma.get(i).getPrice();
            default:
                return null;
        }
    }

    @Override
    public Class<?> getColumnClass(int i) {
        ///return super.getColumnClass(i); //To change body of generated methods, choose Tools | Templates.
        return classname[i];
    }

    @Override
    public String getColumnName(int i) {
        // return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
        return name[i];
    }
}
