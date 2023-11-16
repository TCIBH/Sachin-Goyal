package onlineShopingSystem;

import java.io.IOException;

public class Product {
    private final String ProductId;
    private String name;
    private String description;
    private double price;
    private int stockLevel;
    Product(String productId,String name ,String description,double price,int stockLevel){
        this.ProductId=productId;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockLevel=stockLevel;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public int getStockLevel() {
        return stockLevel;
    }
    public String getDescription() {
        return description;
    }
    public String getProductId() {
        return ProductId;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setStockLevel(int stockLevel)throws IOException {
        this.stockLevel = stockLevel;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null||getClass()!=obj.getClass()){
            return  false;
        }
        Product otherProduct=(Product) obj;
        return ProductId==(otherProduct.ProductId);
    }

}
