package OOPS;
class Student{
    private int rollNumber,marks;
    private String name;
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
public class Encapsulate {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setName("sachin");
        obj.setMarks(15);
        obj.setRollNumber(123456);
        System.out.println(obj.getMarks());
        System.out.println(obj.getName());
        System.out.println(obj.getRollNumber());
    }
}
