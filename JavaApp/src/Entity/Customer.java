/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Haidz
 */
public class Customer {
    public int IDCus;
    public String Cusname;
    public String DateAdd;
    public String Phone;
    public String Email;

    public Customer() {
    }

    public Customer(int IDCus, String Cusname, String DateAdd, String Phone, String Email) {
        this.IDCus = IDCus;
        this.Cusname = Cusname;
        this.DateAdd = DateAdd;
        this.Phone = Phone;
        this.Email = Email;
    }

    public int getIDCus() {
        return IDCus;
    }

    public void setIDCus(int IDCus) {
        this.IDCus = IDCus;
    }

    public String getCusname() {
        return Cusname;
    }

    public void setCusname(String Cusname) {
        this.Cusname = Cusname;
    }

    public String getDateAdd() {
        return DateAdd;
    }

    public void setDateAdd(String DateAdd) {
        this.DateAdd = DateAdd;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
