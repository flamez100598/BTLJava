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
 * @author Haidz
 */
public class TableCustomer extends AbstractTableModel {

     private final String name[]={"ID","Name","DateAdd","Phone","Email"};
     private final Class classname[]={Integer.class,String.class,String.class,String.class,String.class};
     private final ArrayList<Customer> dskh;

    public TableCustomer(ArrayList<Customer> dskh) {
        this.dskh = dskh;
    }

   
    
    
    @Override
    public int getRowCount() {
        return dskh.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1)
        {
            case 0: return dskh.get(i).getIDCus();
            case 1: return dskh.get(i).getCusname();
            case 2: return dskh.get(i).getDateAdd();
            case 3: return dskh.get(i).getPhone();
            case 4: return dskh.get(i).getEmail();
           
            default: return null;    
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
