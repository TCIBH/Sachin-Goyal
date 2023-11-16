package onlineShopingSystem;
import java.io.IOException;
import java.util.ArrayList;
public class Admin {
    private Inventory inventory;
    private ArrayList<Product> products=new ArrayList<>();
    private ArrayList<Integer> stocklevel=new ArrayList<>();
    private ArrayList<Customer> customers=new ArrayList<>();
    private ArrayList<Order> orders=new ArrayList<>();
    public Admin(){}
        void addProduct(Product product){
        products.add(product);}
        void updateProduct(Product product){
        products.add(product);
    }
    public void updateStock(Product  product,int stockLevel) throws IOException {
        int newStock=product.getStockLevel();
        newStock=newStock+stockLevel;
        product.setStockLevel(newStock);
        System.out.println("stock updated");
    }
    public void  addOrder(Order order) throws  Exception{
        orders.add(order);
        System.out.println("order added successfully");
    }
    void updateOrder(Order orderToUpdate){
        orders.remove(orderToUpdate);
    }
    void addCustomer(Customer customer){
        customers.add(customer);
    }
    void updateCustomer(Customer customerToUpdate){
        customers.remove(customerToUpdate);
    }
}
