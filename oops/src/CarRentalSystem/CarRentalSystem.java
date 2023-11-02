package CarRentalSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CarRentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;
    public CarRentalSystem()
    {
        cars=new ArrayList<>();
        customers=new ArrayList<>();
        rentals=new ArrayList<>();
    }
    public void addCar(Car car)
    {
        cars.add(car);
    }
    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }
    public void rentCar(Car car,Customer customer,int days)
    {
        if(car.isAvailable())
        {
            car.rent();
            rentals.add(new Rental(car,customer,days));
        }
        else {
            System.out.println("Car is not available for rent...");
        }
    }
    public void returnCar(Car car)
    {
        car.returnCar();
        Rental rentalToRemove=null;
        for(Rental rental:rentals){
            if(rental.getCar()==car){
                rentalToRemove=rental;
                break;
            }
        }
        if(rentalToRemove!=null){
            rentals.remove(rentalToRemove);
        }
        else{
            System.out.println("car is not rented or not updates in our system");
        }
    }
    public void menu()
    {
        Scanner scan=new Scanner(System.in);
        int choice;
        do {
            System.out.println("=====Welcome to  Car Rental System =====");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Show all cars");
            System.out.println("4. Show all customer");
            System.out.println("5. Exit..");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n==REnt a Car== \n");
                    System.out.println("Enter our name ");
                    String customerName = scan.nextLine();
                    System.out.println("\n ==Available cars==\n");
                    for (Car car : cars) {
                        if (car.isAvailable()) {
                            System.out.println(car.getCarId() + " - " + car.getBrand() + " - " + car.getModel());
                        }
                    }
                    System.out.println("Enter the car ID you want to rent");
                    String carId = scan.nextLine();

                    System.out.println("Enter the number of day for Rental");
                    int rentalDays = scan.nextInt();
                    scan.nextLine();
                    Customer newCustomer = new Customer("CUS" + (customers.size() + 1), customerName);
                    addCustomer(newCustomer);
                    Car selectedCar = null;
                    for (Car car : cars) {
                        if (car.getCarId().equals(carId) && car.isAvailable()) {
                            selectedCar = car;
                            break;
                        }
                    }
                    if (selectedCar != null) {
                        double totalPrice = selectedCar.calculatePrice(rentalDays);
                        System.out.println("\n== Rental Information ==\n");
                        System.out.println("Customer ID: " + newCustomer.getCustomerId());
                        System.out.println("Customer Name: " + newCustomer.getName());
                        System.out.println("Car: " + selectedCar.getBrand() + " " + selectedCar.getModel());
                        System.out.println("Rental Days: " + rentalDays);
                        System.out.printf("Total Price: %.2f%n", totalPrice);
                        System.out.println("\n confirm rental(y/n): ");
                        String confirm = scan.nextLine();

                        if (confirm.equalsIgnoreCase("Y")) {
                            rentCar(selectedCar, newCustomer, rentalDays);
                            System.out.println("Car Rented Successfully");
                        }
                        else {
                            System.out.println("\nInvalid car selection or car not available for rent.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n ==Return a Car==\n");
                    System.out.print("Enter the car ID you want to return: ");
                    String carId2 = scan.nextLine();
                    Car carToReturn = null;
                    for (Car car : cars) {
                        if (car.getCarId().equals(carId2) && !car.isAvailable()) {
                            carToReturn = car;
                            break;
                        }
                    }
                    if (carToReturn != null) {
                        Customer customer = null;
                        for (Rental rental : rentals) {
                            if (rental.getCar() == carToReturn) {
                                customer = rental.getCustomer();
                                break;
                            }
                        }
                        if (customer != null) {
                            returnCar(carToReturn);
                            System.out.println("Car returned successfully by " + customer.getName());
                        } else {
                            System.out.println("Car was not rented or rental information is missing.");
                        }
                    } else {
                        System.out.println("Invalid car ID or car is not rented.");
                    }
                    break;
                case 3:

                 for (Car car : cars) {
                    if (car.isAvailable()) {
                        System.out.println(car.getCarId() + " - " + car.getBrand() + " - " + car.getModel());
                    }
                }
                 break;
                case 4:
                    for(Customer customer:customers){
                        System.out.println(customer.getCustomerId()+" -"+customer.getName());
                    }
                    break;
                case 5:
                    System.out.println("\nThank you for using the Car Rental System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        }while (choice != 5) ;
        }

    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Camry", 60.0);
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Audi", "Q6", 1150.0);
        Car car4 = new Car("C004", "Tata", "Harrier", 500.0);
        Car car5 = new Car("C005", "Mahindra", "SUV800", 600.0);
        Car car6 = new Car("C006", "Maruti Suzuki", "Swift", 120.0);
        Car car7 = new Car("C007", "Hyundai", "City", 800.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);
        rentalSystem.addCar(car4);
        rentalSystem.addCar(car5);
        rentalSystem.addCar(car6);
        rentalSystem.addCar(car7);
        rentalSystem.menu();
    }
    }

