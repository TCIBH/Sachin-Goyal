package onlineShopingSystem;

import java.util.ArrayList;
import java.util.UUID;

public class Order {
    private UUID orderID;
    private Customer customer;
    private ArrayList<Product> products= new ArrayList<>();
    private double totalCost;
    private Shipping shipping;
    private Payment payment;
    public Order(Customer customer,ArrayList<Product> products,double totalCost,Shipping shipping,Payment payment){
        this.customer=customer;
        this.products=products;
        this.payment=payment;
        this.shipping=shipping;
        this.totalCost=totalCost;
        this.orderID=UUID.randomUUID();
    }

    public UUID getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public Payment getPayment() {
        return payment;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return  true;
        }
        if (obj==null||getClass()!=obj.getClass()){
            return  false;
        }
        Order order=(Order) obj;
        return orderID.equals(order.orderID);
    }
}
