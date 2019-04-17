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
    public String TimeOrder;
    public String UsernameEmp;
    public String IDProduct;
    public String CusName;
    public int Quantity;
    public int Price;
    public Order(){
        
    }
    public Order(String IOrder, String DateOrder, String TimeOrder, String UsernameEmp, String IDProduct, String CusName, int Quantity, int Price) {
        this.IOrder = IOrder;
        this.DateOrder = DateOrder;
        this.TimeOrder = TimeOrder;
        this.UsernameEmp = UsernameEmp;
        this.IDProduct = IDProduct;
        this.CusName = CusName;
        this.Quantity = Quantity;
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

    public String getTimeOrder() {
        return TimeOrder;
    }

    public void setTimeOrder(String TimeOrder) {
        this.TimeOrder = TimeOrder;
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

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    public int getTotal(){
        return this.Price*this.Quantity;
    }
    
}
