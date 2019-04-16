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
public class TableProd extends AbstractTableModel{
     private final String name[]={"IDProduct","ProductName","IDname","Price"};
     private final Class classname[]={Integer.class,String.class,String.class,String.class,Integer.class};
     private final ArrayList<Product> dsma;

    public TableProd(ArrayList<Product> dsma) {
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
        switch(i1)
        {
            case 0: return dsma.get(i).getIDProduct();
            case 1: return dsma.get(i).getProductName();
            case 2: return dsma.get(i).getIDtype();
            case 3: return dsma.get(i).getPrice();
            
           
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
