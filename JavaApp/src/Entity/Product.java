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
public class Product {
   public String IDProduct;
   public String ProductName;
   public String IDtype;
   public String IDType;
   public int Price;

    public Product() {
    }
    public Product(String IDProduct, String ProductName, String IDType, int Price) {
        this.IDProduct = IDProduct;
        this.ProductName = ProductName;
        this.IDType = IDType;
        this.Price = Price;
    }

    public String getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(String IDProduct) {
        this.IDProduct = IDProduct;
    }

    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
    public String getIDtype() {
        return IDtype;
    }
    public void setIDtype(String IDtype) {
        this.IDtype = IDtype;
    }
    public String getIDType() {
        return IDType;
    }
    public void setIDType(String IDType) {
        this.IDType = IDType;
    }



    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    
}
