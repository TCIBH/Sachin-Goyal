import java.util.Scanner;
public class FlyodTriangle {
    public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number of Rows of Flyod's Triangle");
                int rows= scan.nextInt();
                int a=1;
                for(int i=1;i<=rows;i++)
                {
                    for (int j=1;j<rows-i;j++) {
                        System.out.print(" ");
                    }

                    for(int k=1;k<=i;k++)
                    {
                        System.out.print(a+" ");
                        a++;
                    }
                    System.out.println( "   ");

                }

            }
        }


