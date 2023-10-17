import java.util.Scanner;

public class HollowPyramidOfStar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of ROWS...");
        int rows= scan.nextInt();
        System.out.println("Enter the number of COLUMNS..");
        int columns = scan.nextInt();
        for(int i=1;i<=rows;i++)
        {
           for (int j=1;j<=columns;j++)
           {
               if(i==1||i==rows||j==1||j==columns)
               {
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }

           }
            System.out.println();
        }
    }
}
