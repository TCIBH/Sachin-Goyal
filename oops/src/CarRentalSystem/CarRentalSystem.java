package CarRentalSystem;
import java.sql.SQLOutput;
import java.util.*;

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
            customer.rent();
            rentals.add(new Rental(car,customer,days));
        }
        else {
            System.out.println("Car is not available for rent...");
        }
    }
    public void returnCar(Car car)
    {

        Rental rentalToRemove=null;
        for(Rental rental:rentals){
            if(rental.getCar()==car){
                rentalToRemove=rental;
                break;
            }
        }
        if(rentalToRemove!=null){
            car.returnCar();
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
            System.out.println("6. show all Available car");
            System.out.println("7. Add a new Car");
            System.out.println("8: Add a new Customer");
            System.out.println("9: Show all rented car");
            System.out.println("5. Exit..");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n==REnt a Car== \n");
                    System.out.println("\n ==Available cars==\n");
                    for (Car car : cars) {
                        if (car.isAvailable()) {
                            System.out.println(car.getCarId() + " - " + car.getBrand() + " - " + car.getModel());
                        }
                    }
                    System.out.println("Enter the car ID you want to rent");
                    String carId = scan.nextLine();
                    System.out.println("Enter our name ");
                    String customerName = scan.nextLine();
                    System.out.println("Enter the number of day for Rental");
                    int rentalDays = scan.nextInt();
                    System.out.println("enter the available balance you have");
                    int balance= scan.nextInt();
                    scan.nextLine();
                    Car selectedCar = null;
                    for (Car car : cars) {
                        if (car.getCarId().equalsIgnoreCase(carId) && car.isAvailable()) {
                            selectedCar = car;
                            break;
                        }
                    }
                    if (selectedCar != null) {
                        double totalPrice = selectedCar.calculatePrice(rentalDays);
                        if (balance < selectedCar.calculatePrice(rentalDays)) {
                            System.out.println("In sufficient balance");
                        } else {
                            Customer newCustomer = new Customer("CUS" + (customers.size() + 1), customerName, balance);
                            addCustomer(newCustomer);
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
                            } else {
                                System.out.println("\nInvalid car selection or car not available for rent.");
                            }
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
                    System.out.println("Total Cars in the company is::");
                    Formatter fmt1 = new Formatter();
                    fmt1.format("%15s %13s %15s %20s\n", "CarID", "Brand", "Model","UUId ");
                    for(Car car:cars) {
                            fmt1.format("%14s %14s %15s %40s\n", car.getCarId(), car.getBrand(), car.getModel(), car.getUuid());
                    }
                    System.out.println(fmt1);
                 break;
                case 4:
                    Formatter fmt2 = new Formatter();
                    fmt2.format("%15s %13s %15s %20s\n", "CustomerId", "Name", "Balance","UUId ");
                    for(Customer customer:customers){
                     fmt2.format("%14s %14s %15s %40s\n",customer.getCustomerId(),customer.getName(),customer.getBalance(),customer.getUuid());
                      //  System.out.println(customer.getCustomerId()+"\t\t"+customer.getName()+"\t\t"+customer.getBalance()+"\t\t"+customer.getUuid());
                    }
                    System.out.println(fmt2);
                    break;
                case 5:
                    System.out.println("\nThank you for using the Car Rental System!");
                    break;
                case 6:
                    System.out.println("Available Car ::");
                    Formatter fmt3 = new Formatter();
                    fmt3.format("%15s %13s %15s %20s\n", "CarID", "Brand", "Model","UUId ");
                    for(Car car:cars) {
                        if (car.isAvailable()) {
                            fmt3.format("%14s %14s %15s %40s\n", car.getCarId(), car.getBrand(), car.getModel(), car.getUuid());
                        }
                    }
                    System.out.println(fmt3);
                    break;
                case 7:
                    System.out.println("---New car in the house--");
                    System.out.println("Enter New car details:");
                    System.out.println("enter the car number");
                    String newCarNumber= scan.nextLine();
                    System.out.println("Enter the Car Brand");
                    String newCarBrand= scan.nextLine();
                    System.out.println("Enter the Model");
                    String newCarModel= scan.nextLine();
                    scan.nextLine();
                    System.out.println("Enter the basePricePerDay");
                    double newCarBasePricePerDay=scan.nextDouble();
                    scan.nextLine();
                    System.out.println("====New car information===");
                    System.out.println("Car Number::"+newCarNumber);
                    System.out.println("Car brand::"+newCarBrand);
                    System.out.println("Car model::"+newCarModel);
                    System.out.println("Car base price per day=="+newCarBasePricePerDay);
                    System.out.println("\n confirm Car Details(y/n): ");
                    String confirm = scan.nextLine();
                    if (confirm.equalsIgnoreCase("Y")) {
                    Car car=new Car(newCarNumber,newCarBrand,newCarModel,newCarBasePricePerDay);
                    addCar(car);
                    System.out.println("Car Added Successfully");
                    }
                    else {
                        System.out.println("\nInvalid car selection or car not available now.");
                    }
                    break;
                case 8:
                    System.out.println("---New Customer in the house--");
                    System.out.println("Enter New customer details:");
                    System.out.println("enter the Customer number");
                    String newCustomerId= scan.nextLine();
                    System.out.println("Enter the Name of the Customer:");
                    String newCustomerName= scan.nextLine();
                    System.out.println("Enter the Balance of the Customer ");
                    double newCustomerBalance= scan.nextDouble();
                    scan.nextLine();
                    System.out.println("====New car information===");
                    System.out.println("Car Number::"+newCustomerId);
                    System.out.println("Car brand::"+newCustomerName);
                    System.out.println("Car model::"+newCustomerBalance);
                    System.out.println("\n confirm New Customer Details(y/n): ");
                    String confirm2 = scan.nextLine();
                    if (confirm2.equalsIgnoreCase("Y")) {
                        Customer newCustomer1=new Customer(newCustomerId,newCustomerName,newCustomerBalance);
                        System.out.println("Customer Added Successfully");
                        addCustomer(newCustomer1);
                    }
                    else {
                        System.out.println("\nInvalid customer details or not interested now .");
                    }
                    break;
                case 9:
                    System.out.println("Rented  Car ::");
                    Formatter fmt4 = new Formatter();
                    fmt4.format("%15s %13s %15s %20s\n", "CarID", "Brand", "Model","UUId ");
                    for(Car car:cars) {
                        if (!car.isAvailable()) {
                            fmt4.format("%14s %14s %15s %40s\n", car.getCarId(), car.getBrand(), car.getModel(), car.getUuid());
                        }
                    }
                    System.out.println(fmt4);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        }while (choice != 5) ;
        }

    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();
        Car car1 = new Car("HR20 am 1996", "Toyota", "Camry", 60.0);
        Car car2 = new Car("HR20 ac 2000", "Honda", "Accord", 70.0);
        Car car3 = new Car("HR20 c 2003", "Audi", "Q6", 1150.0);
        Car car4 = new Car("HR20 a 2005", "Tata", "Harrier", 500.0);
        Car car5 = new Car("HR20 B 2080", "Mahindra", "SUV800", 600.0);
        Car car6 = new Car("HR20 C 2060", "Maruti Suzuki", "Swift", 120.0);
        Car car7 = new Car("HR20 ac 2080", "Hyundai", "City", 800.0);
        Customer c1=new Customer("CUS1","ram",20000);
        Customer c2=new Customer("CUS2","Ramesh",5000);
        Customer c3=new Customer("CUS3","Suresh",200);
        Customer c4=new Customer("CUS4","Rajesh",10000);
        rentalSystem.addCustomer(c1);
        rentalSystem.addCustomer(c2);
        rentalSystem.addCustomer(c3);
        rentalSystem.addCustomer(c4);
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

