import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=scan.nextInt();
        for(int i=1;i<=rows;i++)
        {
             int a=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a=a*(i-j)/j;
            }
            System.out.println();
        }
    }
}
