package onlineShopingSystem;
import java.util.ArrayList;
 class ShoppingCart {
    private ArrayList<Product> products=new ArrayList();
    public ShoppingCart(){}
     int a;
    public void addProduct(Product product, int i)
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
    public double totalCost(Product product,int quantity){
        double total=0;
            total=total+product.getPrice()*quantity;
        return  total;

    }

}
