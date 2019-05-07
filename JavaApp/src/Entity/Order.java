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
    public int Quantity;
    public int Status;
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public Order(){
        
    }
    public Order(String IOrder, String DateOrder,String UsernameEmp, String IDProduct, 
            String CusName, int Price,int Quantity,int Status) {
        this.IOrder = IOrder;
        this.DateOrder = DateOrder;
        this.UsernameEmp = UsernameEmp;
        this.IDProduct = IDProduct;
        this.CusName = CusName;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Status = Status;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
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
    public int getTotal(){
        return this.getPrice()*this.getQuantity();
    }
}
