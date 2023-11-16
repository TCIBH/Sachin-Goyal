package onlineShopingSystem;
import java.io.IOException;
import java.util.ArrayList;
 class ShoppingCart {
    private ArrayList<Product> products=new ArrayList();
    public ShoppingCart(){}
     int a;
    public void addProduct(Product product, int i) throws Exception
    {
        this.a=i;
        products.add(product);
    }
    public void show()
    {
        System.out.println("all Available product");
        for (Product i : products) {
            System.out.println("\nid:" + i.getProductId() + "\nName:" + i.getName() + "\nDescription" + i.getDescription()
                    + "\nPrice:" + i.getPrice() + "\n quantity" + i.getStockLevel());
        }
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public int returnSize(){
        return products.size();
    }
    public double totalCost(Product product,int quantity) throws IOException {
        double total=0;
            total=total+product.getPrice()*quantity;
        return  total;

    }
     public double totalCost() throws Exception{
         double total=0;
         for(Product product:products){
             total=total+(product.getPrice()* product.getStockLevel());
         }
         return  total;
     }

}
