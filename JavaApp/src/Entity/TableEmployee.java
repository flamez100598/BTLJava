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
public class TableEmployee extends AbstractTableModel{
     private final String name[]={"User","Pass","Tên","Giới tính","Ngày Sinh","Phone","Email","Address"};
     private final Class classname[]={String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class};
     private final ArrayList<Employee> dsnv;

    public TableEmployee(ArrayList<Employee> dsnv) {
        this.dsnv = dsnv;
    }

   
    
    
    @Override
    public int getRowCount() {
        return dsnv.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1)
        {
            case 0: return dsnv.get(i).getUsernameEmp();
            case 1: return dsnv.get(i).getPassword();
            case 2: return dsnv.get(i).getNameEmp();
            case 3: return dsnv.get(i).getGender();
            case 4: return dsnv.get(i).getBirthday();
            case 5: return dsnv.get(i).getPhone();
            case 6: return dsnv.get(i).getEmail();
            case 7: return dsnv.get(i).getAddress();
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
