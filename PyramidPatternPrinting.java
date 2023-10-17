import java.util.Scanner;

public class PyramidPatternPrinting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the height of pyramid");
        int height= scan.nextInt();
        for(int i=0;i<=height;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
