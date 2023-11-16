package onlineShopingSystem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class MainClass {
    private List<Product> products;
    private List<Customer> customers;
    private List<Order> orders;
    public MainClass(){
products=new ArrayList<>();
customers=new ArrayList<>();
orders=new ArrayList<>();
    }
    ShoppingCart shoppingCart = new ShoppingCart();
public void addProduct(Product product){
        products.add(product);
}

    void menu() throws IOException {

        Scanner scan=new Scanner(System.in);
        BufferedReader bfn = new BufferedReader(
                new InputStreamReader(System.in));
        int choice;
        do{
            System.out.println("Welcome to the  online shopping system");
            System.out.println("press 1 for search an item");
            System.out.println("press 2 for all products ");
            System.out.println("press 3 to add product to cart");
            System.out.println("press 4 to restock inventory");
            System.out.println("press 5 for exit");
            System.out.println("press 6 to go admin block");
            System.out.println("press 7 to go to cart");
choice=scan.nextInt();
           switch(choice)
           {
               case 1:String search;
                   System.out.println("Enter the  item you want to search");
                    search=bfn.readLine();
                   for (Product product:products){
                       if (product.getName().equalsIgnoreCase(search)) {
                           System.out.println("Item found");
                           System.out.println("do you want to add product to the cart");
                           System.out.println("confirm product(y/n): ");
                           String confirm = bfn.readLine();
                           if (confirm.equalsIgnoreCase("Y")) {
                               System.out.println("enter Quantity of the product");
                               int n = scan.nextInt();
                               if (product.getStockLevel() >= n) {
                                   shoppingCart.addProduct(product, n);
                                   shoppingCart.totalCost(product, n);
                                   product.setStockLevel(product.getStockLevel() - n);
                                   System.out.println("product added successfully");
                                   break;

                               } else {
                                   System.out.println("Invalid stock selection or out of stock");
                               }
                           }
                       }
                       else {
                           System.out.println("not found");
                       }
                       }
                   break;
               case 2:
                   System.out.println("all product are");
                   for (Product i : products) {
                       System.out.println("\nid: " + i.getProductId() + "\nName: " + i.getName() + "\nDescription " + i.getDescription()
                               + "\nPrice: " + i.getPrice()+"\n quantity"+i.getStockLevel());
               }
               break;
               case 3:
                   System.out.println("all Available product");
                   for (Product i : products) {
                       System.out.println("\nid:" + i.getProductId() + "\nName:" + i.getName() + "\nDescription" + i.getDescription()
                               + "\nPrice:" + i.getPrice() + "\n quantity" + i.getStockLevel());
                   }
                   System.out.println("Select product name to add to cart");
                   String str= bfn.readLine();
                   System.out.println("enter the quantity");
                   int i= scan.nextInt();
                   for(Product product:products)
                   {
                       if(product.getName().equalsIgnoreCase(str)) {
                           if (product.getStockLevel() >= i) {
                               shoppingCart.addProduct(product, i);
                               shoppingCart.totalCost(product,i);
                               product.setStockLevel(product.getStockLevel() - i);
                               System.out.println("product added successfully");
                               int schoice;
                               do {
                                   System.out.println("1.Continue Shopping\n2.Checkout");
                                   schoice = scan.nextInt();
                                   switch (schoice) {
                                       case 1:
                                           menu();
                                           break;
                                       case 2:
                                           System.out.println("all item in the cart is");
                                           shoppingCart.show();
                                           System.out.println("total item in the cart is::");
                                           System.out.println(shoppingCart.returnSize());
                                           break;
                                       default:
                                           System.out.println("enter correct choice");
                                   }
                               }while(schoice!=2);
                               break;
                           }
                       }
                       System.out.println("item not  added to cart  ");
                       }

                   break;
               case 4:

                   try {
                       String str1;
                       scan.reset();
                       System.out.println("restock the inventory");
                       System.out.println("enter the product id");
                       str1 = bfn.readLine();
                       System.out.println("enter the quantity");
                       int q = scan.nextInt();
                   for(Product product:products) {
                       Inventory inventory = new Inventory();
                       if (product.getProductId().equalsIgnoreCase(str1)) {
                           inventory.reStock(product, q);
                           System.out.println("stock updated successfully");
                       }
                   }
           }
                   catch (Exception e){
                       System.out.println("enter valid value"+e);
                   }
                   break;
               case 6:
                   int choice2;
                   do {
                       System.out.println("welcome to the admin block");
                       System.out.println("enter 1 to add product");
                       System.out.println("enter 2 to update stock");
                       System.out.println("enter 3 to go to main menu");
                       choice2=scan.nextInt();
                       switch (choice2) {
                           case 1:
                               System.out.println("enter product details");
                               System.out.println("enter product name");
                               String str3=bfn.readLine();
                               System.out.println("Enter product quantity");
                               int newQuantity=bfn.read();
                               System.out.println("enter price");
                             double newPrice= scan.nextDouble();
                               System.out.println("enter desciption");
                               String str4=bfn.readLine();
                               bfn.readLine();
                               System.out.println("enter product id");
                               String newProductID=bfn.readLine();
                               Admin admin=new Admin();
                               admin.addProduct(new Product(newProductID,str3,str4,newPrice,newQuantity));
                               System.out.println("product added successfully");
                               break;
                           case 2:
                               System.out.println("enter product id");
                               String str5=bfn.readLine();
                               for(Product product:products){
                                   if(product.getProductId().equalsIgnoreCase(str5)){
                                       System.out.println("enter the quantity");
                                       int newQuantity1=bfn.read();
                                       Admin admin1=new Admin();
                                       admin1.updateStock(product,newQuantity1);
                                       System.out.println("stock updated successfully");
                                       break;
                                   }
                                   else {
                                       System.out.println("enter the correct product id");
                                   }
                               }
                               break;
                           case 3:
                               menu();
                               break;
                       }
                   }while (choice2!=3);
                   break;
               case  5:
                   System.out.println("thanks for using the online management system ");
                   break;
               case 7:
                   System.out.println("all items in the carts is");
                   shoppingCart.show();
                   System.out.println("total item in the cart is::");
                   System.out.println(shoppingCart.returnSize());
                   System.out.println();
                   break;

           }
        } while(choice!=5);

    }
    public static void main(String[] args) throws IOException {
        MainClass main=new MainClass();
    Product p1=new Product("P001","Parle_g","new",20,100);
        Product p8=new Product("P002","head and shoulder","new",200,20);
        Product p2=new Product("P003","Rin ","new",185,100);
        Product p3=new Product("P004","Surf Excel","new",99,60);
        Product p4=new Product("P005","dove","new",125,50);
        Product p5=new Product("P006","pencil","new",45,100);
        Product p6=new Product("P007","sugar","new",46,100);
        Product p7=new Product("P008","wheat","new",32,100);
        main.addProduct(p1);
        main.addProduct(p2);
        main.addProduct(p3);
        main.addProduct(p4);
        main.addProduct(p5);
        main.addProduct(p6);
        main.addProduct(p7);
        main.addProduct(p8);
    Customer c1= new Customer("C001","sachin ", "h.no 45 Inderprasth  colony","goyalsachin0817@gmail.com");
    ShoppingCart cart=new ShoppingCart();
        main.menu();
    }

}
