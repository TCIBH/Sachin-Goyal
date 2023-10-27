package OOPS;
class shape{
    double area()
    {
        return 0;
    }
    double perimeter()
    {
        return 0;
    }
}
class Circle extends shape
{
double   radius;
public Circle(double radius)
{
    this.radius=radius;
}@Override
    double area() {
    System.out.println("area of circle=");
        return 3.14*radius*radius;
    }
    @Override
    double perimeter() {
        System.out.println("perimeter of circle=");
        return 3.14*2*radius;
    }
}
class Triangle extends shape
{
    double   base,height,a,b;
    public Triangle(double base,double height,double a,double b)
    {
        this.base=base;
        this.height=height;
        this.a=a;
        this.b=b;
    }@Override
double area() {
    System.out.println("area of Triangle=");
    return 0.5*base*height;
}
    @Override
    double perimeter() {
        System.out.println("perimeter of Triangle=");
        return a+b+base;
    }
}
class Rectangle2 extends shape
{
    double  length;
    double breadth;
    public Rectangle2 (double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }@Override
double area() {
    System.out.println("area of Rectangle=");
    return length*breadth;
}@Override
   double perimeter() {
        System.out.println("perimeter of Rectangle=");
        return length+breadth;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Circle obj=new Circle(3);
        Triangle obj1=new Triangle(1,5,4,4);
        Rectangle2 obj3=new Rectangle2(45,49);
        System.out.println( obj.area());
        System.out.println( obj1.area());
        System.out.println( obj3.area());
        System.out.println( obj.perimeter());
        System.out.println( obj1.perimeter());
        System.out.println( obj3.perimeter());
    }
}