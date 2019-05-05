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
    public String IDType;
    public int Price;
    public String TypeName;
    public String Size;
    public Product() {
    }
    public Product(String IDProduct, String ProductName, String IDType, int Price,
            String TypeName, String Size) {
        this.IDProduct = IDProduct;
        this.ProductName = ProductName;
        this.IDType = IDType;
        this.Price = Price;
        this.TypeName = TypeName;
        this.Size = Size;
    }

    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
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
