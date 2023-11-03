package CarRentalSystem;

import java.util.UUID;

class Customer {
    private String customerId;
    private String name;
    private double balance;
    UUID uuid= UUID.randomUUID();
    public Customer(String customerId, String name,double balance)
    {
        this.customerId=customerId;
        this.name=name;
        this.balance=balance;
    }
    public String getName() {
        return name;
    }
    public String getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public UUID getUuid() {
        return uuid;
    }

}
