package CarRentalSystem;

import java.util.UUID;

class Car {
    private final String carId;
    private final String brand;
    private final String model;
    private final double basePricePerDay;
    private boolean isAvailable;
    UUID uuid=UUID.randomUUID();
    public Car(String carId, String brand, String model, double basePricePerDay)
    {
        this.carId=carId;
        this.brand=brand;
        this.model=model;
        this.basePricePerDay=basePricePerDay;
        this.isAvailable=true;
    }
    public double getBasePricePerDay() {
        return basePricePerDay;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getCarId() {
        return carId;
    }

    public UUID getUuid() {
        return uuid;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public double calculatePrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }

    public void rent() {
        isAvailable = false;
    }
    public void returnCar() {
        isAvailable = true;
    }

}
