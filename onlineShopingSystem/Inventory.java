package onlineShopingSystem;
import java.io.IOException;
import java.util.ArrayList;


class Inventory  {
     private ArrayList<Product> products=new ArrayList<>();
     public Inventory(){
     }
    public void addProduct(Product product,int stock) throws IOException {
      int newStock=product.getStockLevel();
      newStock=stock-newStock;
     product.setStockLevel(newStock);
         products.add(product);
    }

    public boolean inStock(Product product) {
         int value=product.getStockLevel();
        if (value > 0) {
            return true;
        } else {
            return false;
        }
    }
     public void reStock(Product product,int quantity) throws Exception{
         int value=product.getStockLevel();
         value=value+quantity;
         product.setStockLevel(value);
     }

}
