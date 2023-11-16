package onlineShopingSystem;

public class Shipping {
    private String shippingMethod;
    private double shippingCost;
    public Shipping(String shippingMethod,double shippingCost){
        this.shippingCost=shippingCost;
        this.shippingMethod=shippingMethod;
    }
    public String getShippingMethod(){
        return  shippingMethod;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}
