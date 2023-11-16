package onlineShopingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

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
    public void updateStock(Product  product,int stockLevel){
        int newStock=product.getStockLevel();
        newStock=newStock+stockLevel;
        product.setStockLevel(newStock);
        System.out.println("stock updated");
    }
    public void  addOrder(Order order){
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
