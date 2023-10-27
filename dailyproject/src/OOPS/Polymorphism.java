package OOPS;
class shapee{
    double area()
    {
        return 0;
    }
    double perimeter()
    {
        return 0;
    }
}
class Circlee extends shapee
{
    double   radius;
    public Circlee(double radius)
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
class Trianglee extends shapee
{
    double   base,height,a,b;
    public Trianglee(double base,double height,double a,double b)
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
class Rectanglee extends shapee
{
    double  length;
    double breadth;
    public Rectanglee (double length,double breadth)
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
class Square extends shapee
{
    double  length;
    public Square (double length)
    {
        this.length=length;
    }@Override
double area() {
    System.out.println("area of Rectangle=");
    return length*length;
}@Override
double perimeter() {
    System.out.println("perimeter of Rectangle=");
    return 4*length ;
}
}
public class Polymorphism {
    public static void main(String[] args) {
        Circlee obj=new Circlee(3);
        Trianglee obj1=new Trianglee(1,5,4,4);
        Rectanglee obj3=new Rectanglee(45,49);
        Square obj4=new Square(5);
        System.out.println( obj.area());
        System.out.println( obj1.area());
        System.out.println( obj3.area());
        System.out.println( obj.perimeter());
        System.out.println( obj1.perimeter());
        System.out.println( obj3.perimeter());
    }
}

