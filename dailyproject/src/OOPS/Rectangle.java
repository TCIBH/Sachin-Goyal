package OOPS;

import java.util.Scanner;

class Rectangle1{
 void area(int length,int breadth)
 {
     System.out.println("area of rectangle = "+length*breadth);
 }
 void perimeter(int length,int breadth)
     {
         System.out.println("perimeter of rectangle = "+2*(length+breadth));
     }
}
public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 obj=new Rectangle1();
        Scanner scan=new Scanner(System.in);
        System.out.println("Simple oops program for finding the area and perimeter of rectangle");
        System.out.println("enter the length of rectangle");
        int length= scan.nextInt();
        System.out.println("Enter breadth of rectangle");
        int breadth= scan.nextInt();
        obj.area(length,breadth);
        obj.perimeter(length,breadth);
    }
}
