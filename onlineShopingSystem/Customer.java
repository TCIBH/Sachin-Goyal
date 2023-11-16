package onlineShopingSystem;
 public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String email;
    public Customer(String customerId,String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.customerId = customerId;
    }
    public Customer() {
        name = "";
        address = "";
        email = "";
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCustomerId() {
        return customerId;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }

     @Override
     public boolean equals(Object obj) {
         if(this==obj)
         {
             return true;
         }
         if(obj==null||getClass()!=obj.getClass()){
             return false;
         }
         Customer othercustomer= (Customer) obj;
         return customerId.equals(othercustomer.customerId);
     }
 }
