/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Admin
 */
public class Order {
    public String IOrder;
    public String DateOrder;
    public String UsernameEmp;
    public String IDProduct;
    public String CusName;
    public int Price;
    public Order(){
        
    }
    public Order(String IOrder, String DateOrder,String UsernameEmp, String IDProduct, String CusName, int Price) {
        this.IOrder = IOrder;
        this.DateOrder = DateOrder;
        this.UsernameEmp = UsernameEmp;
        this.IDProduct = IDProduct;
        this.CusName = CusName;
        this.Price = Price;
    }

    public String getIOrder() {
        return IOrder;
    }

    public void setIOrder(String IOrder) {
        this.IOrder = IOrder;
    }

    public String getDateOrder() {
        return DateOrder;
    }

    public void setDateOrder(String DateOrder) {
        this.DateOrder = DateOrder;
    }


    public String getUsernameEmp() {
        return UsernameEmp;
    }

    public void setUsernameEmp(String UsernameEmp) {
        this.UsernameEmp = UsernameEmp;
    }

    public String getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(String IDProduct) {
        this.IDProduct = IDProduct;
    }

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String CusName) {
        this.CusName = CusName;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int Price) {
        this.Price = Price;
    }
}
