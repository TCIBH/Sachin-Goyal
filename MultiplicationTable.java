import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number from which you want tom print the multiplication table startung table of 1");
        int number=scan.nextInt();
        for(int i=1;i<=number;i++)
        {
            System.out.printf("The Multiplication table of  %d is ",i);
            for(int j=1;j<=10;j++)
            {
                System.out.printf("\n %d * %d= ",i,j );
                System.out.print(i*j);
            }
            System.out.println();
        }
    }
}
